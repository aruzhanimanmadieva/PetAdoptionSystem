package strategy;

import factory.Pet;

public class FreeAdoptionStrategy implements FeeStrategy {

    @Override
    public double calculateFee(Pet pet) {
        return 0;
    }
}
