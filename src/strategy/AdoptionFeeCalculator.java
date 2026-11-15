package strategy;

import factory.Pet;

public class AdoptionFeeCalculator {

    private FeeStrategy strategy;

    public AdoptionFeeCalculator(FeeStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(FeeStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateFee(Pet pet) {
        return strategy.calculateFee(pet);
    }
}
