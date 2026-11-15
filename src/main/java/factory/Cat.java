package factory;

public class Cat implements Pet {

    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return "Cat";
    }

    @Override
    public double getBaseAdoptionFee() {
        return 10000;
    }
}


