package strategy;

import factory.Pet;

public class DiscountFeeStrategy implements FeeStrategy {

    @Override
    public double calculateFee(Pet pet) {
        return pet.getBaseAdoptionFee() * 0.5;
    }
}
