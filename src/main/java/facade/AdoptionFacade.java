package facade;

import factory.Pet;
import factory.PetFactory;

import strategy.AdoptionFeeCalculator;
import strategy.FeeStrategy;

import builder.AdoptionApplication;
import builder.AdoptionApplicationBuilder;

import decorator.AdoptionPackage;
import decorator.BasicPackage;
import decorator.StarterKitDecorator;
import decorator.TrainingGuideDecorator;

import observer.Subject;
import observer.ApplicantNotifier;
import observer.StaffNotifier;

public class AdoptionFacade {

    private AdoptionFeeCalculator feeCalculator;

    public AdoptionFacade(FeeStrategy strategy) {
        feeCalculator = new AdoptionFeeCalculator(strategy);
    }

    public Pet createPet(String type, String name) {
        return PetFactory.createPet(type, name);
    }


    public double calculateAdoptionFee(Pet pet) {
        return feeCalculator.calculateFee(pet);
    }

    public void setFeeStrategy(FeeStrategy strategy) {
        feeCalculator.setStrategy(strategy);
    }

    public AdoptionApplication submitApplication(
            String petType,
            String petName,
            String applicantName,
            String contact,
            String reason,
            boolean addStarterKit,
            boolean addTrainingGuide) {

        Pet pet = createPet(petType, petName);

        AdoptionApplication application =
                new AdoptionApplicationBuilder()
                        .setApplicantName(applicantName)
                        .setContact(contact)
                        .setPet(pet)
                        .setReason(reason)
                        .build();

        AdoptionPackage adoptionPackage = new BasicPackage();

        if (addStarterKit) {
            adoptionPackage =
                    new StarterKitDecorator(adoptionPackage);
        }

        if (addTrainingGuide) {
            adoptionPackage =
                    new TrainingGuideDecorator(adoptionPackage);
        }

        Subject subject = new Subject();

        subject.addObserver(new ApplicantNotifier());
        subject.addObserver(new StaffNotifier());

        subject.notifyObservers(
                "A new adoption application has been created for "
                        + pet.getName()
        );

        System.out.println();
        System.out.println("=== ADOPTION APPLICATION ===");
        System.out.println("Applicant: " + application.getApplicantName());
        System.out.println("Contact: " + application.getContact());
        System.out.println("Pet: " + application.getPet().getName());
        System.out.println("Reason: " + application.getReason());


        System.out.println();
        System.out.println("=== ADOPTION PACKAGE ===");
        System.out.println("Package: " + adoptionPackage.getDescription());
        System.out.println("Package Cost: "
                + adoptionPackage.getCost() + " KZT");

        return application;
    }

    public void showPetInformation(Pet pet) {

        System.out.println();
        System.out.println("=== PET INFORMATION ===");
        System.out.println("Type: " + pet.getType());
        System.out.println("Name: " + pet.getName());
        System.out.println("Adoption Fee: "
                + calculateAdoptionFee(pet) + " KZT");
    }
}