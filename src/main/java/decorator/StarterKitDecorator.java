package decorator;

public class StarterKitDecorator extends PackageDecorator {

    public StarterKitDecorator(AdoptionPackage adoptionPackage) {
        super(adoptionPackage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Starter Kit";
    }

    @Override
    public double getCost() {
        return super.getCost() + 5000.0;
    }
}