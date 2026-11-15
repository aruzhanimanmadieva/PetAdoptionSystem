import factory.Pet;
import facade.AdoptionFacade;
import strategy.StandardFeeStrategy;
import strategy.DiscountFeeStrategy;
import strategy.FreeAdoptionStrategy;
import builder.AdoptionApplication;
import builder.AdoptionApplicationBuilder;
import decorator.AdoptionPackage;
import decorator.BasicPackage;
import decorator.StarterKitDecorator;
import decorator.TrainingGuideDecorator;
import observer.Subject;
import observer.ApplicantNotifier;
import observer.StaffNotifier;

public class Main {

    public static void main(String[] args) {

        AdoptionFacade facade =
                new AdoptionFacade(new StandardFeeStrategy());

        Pet cat = facade.createPet("cat", "Luna");

        AdoptionPackage adoptionPackage = new BasicPackage();

        adoptionPackage = new StarterKitDecorator(adoptionPackage);
        adoptionPackage = new TrainingGuideDecorator(adoptionPackage);
        System.out.println("=== ADOPTION PACKAGE ===");
        System.out.println("Package: " + adoptionPackage.getDescription());
        System.out.println("Package Cost: " + adoptionPackage.getCost() + " KZT");

        System.out.println();

        AdoptionApplication application =
                new AdoptionApplicationBuilder()
                        .setApplicantName("Ulzhan")
                        .setContact("87001234567")
                        .setPet(cat)
                        .setReason("I love animals and want to give a pet a home.")
                        .build();

        Subject adoptionSubject = new Subject();

        adoptionSubject.addObserver(new ApplicantNotifier());
        adoptionSubject.addObserver(new StaffNotifier());

        adoptionSubject.notifyObservers(
                "A new adoption application has been created for " + cat.getName()
        );

        System.out.println();

        System.out.println("=== ADOPTION APPLICATION ===");
        System.out.println("Applicant: " + application.getApplicantName());
        System.out.println("Contact: " + application.getContact());
        System.out.println("Pet: " + application.getPet().getName());
        System.out.println("Reason: " + application.getReason());

        System.out.println();

        facade.showPetInformation(cat);

        System.out.println();

        System.out.println("Applying discount...");

        facade.setFeeStrategy(new DiscountFeeStrategy());

        facade.showPetInformation(cat);

        System.out.println();

        System.out.println("Free adoption...");

        facade.setFeeStrategy(new FreeAdoptionStrategy());

        facade.showPetInformation(cat);
    }
}
