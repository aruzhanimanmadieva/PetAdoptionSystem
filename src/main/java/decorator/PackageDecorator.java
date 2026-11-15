package decorator;

public abstract class PackageDecorator implements AdoptionPackage {

    protected AdoptionPackage adoptionPackage;

    public PackageDecorator(AdoptionPackage adoptionPackage) {
        this.adoptionPackage = adoptionPackage;
    }

    @Override
    public String getDescription() {
        return adoptionPackage.getDescription();
    }

    @Override
    public double getCost() {
        return adoptionPackage.getCost();
    }
}