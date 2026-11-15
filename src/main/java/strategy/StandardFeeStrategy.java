package strategy;

import factory.Pet;

public class StandardFeeStrategy implements FeeStrategy {

    @Override
    public double calculateFee(Pet pet) {
        return pet.getBaseAdoptionFee();
    }
}
