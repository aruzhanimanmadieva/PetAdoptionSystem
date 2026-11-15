package factory;

public class Dog implements Pet {

    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public double getBaseAdoptionFee() {
        return 15000;
    }
}
