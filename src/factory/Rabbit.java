package factory;

public class Rabbit implements Pet {

    private final String name;

    public Rabbit(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return "Rabbit";
    }

    @Override
    public double getBaseAdoptionFee() {
        return 8000;
    }
}

