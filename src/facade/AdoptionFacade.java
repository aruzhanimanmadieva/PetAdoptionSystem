package facade;

import factory.Pet;
import factory.PetFactory;
import strategy.AdoptionFeeCalculator;
import strategy.FeeStrategy;

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

    public void showPetInformation(Pet pet) {

        System.out.println("=== PET INFORMATION ===");
        System.out.println("Type: " + pet.getType());
        System.out.println("Name: " + pet.getName());
        System.out.println("Adoption Fee : " + calculateAdoptionFee(pet) + " KZT");
    }

}
