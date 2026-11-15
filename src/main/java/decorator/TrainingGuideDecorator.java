package decorator;

public class TrainingGuideDecorator extends PackageDecorator {

    public TrainingGuideDecorator(AdoptionPackage adoptionPackage) {
        super(adoptionPackage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Training Guide";
    }

    @Override
    public double getCost() {
        return super.getCost() + 3000.0;
    }
}
