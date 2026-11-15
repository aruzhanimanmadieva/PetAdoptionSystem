package strategy;

import factory.Pet;

public interface FeeStrategy {

    double calculateFee(Pet pet);
}
