package decorator;

public class BasicPackage implements AdoptionPackage {

    @Override
    public String getDescription() {
        return "Basic adoption package";
    }

    @Override
    public double getCost() {
        return 0.0;
    }
}