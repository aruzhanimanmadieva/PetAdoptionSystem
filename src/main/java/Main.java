import factory.Pet;
import facade.AdoptionFacade;
import builder.AdoptionApplication;
import strategy.StandardFeeStrategy;
import strategy.DiscountFeeStrategy;
import strategy.FreeAdoptionStrategy;

public class Main {

    public static void main(String[] args) {

        AdoptionFacade facade =
                new AdoptionFacade(new StandardFeeStrategy());

        AdoptionApplication application =
                facade.submitApplication(
                        "cat",
                        "Luna",
                        "Zhanar",
                        "87001234567",
                        "I love animals and want to give a pet a home.",
                        true,
                        true
                );

        Pet pet = application.getPet();

        facade.showPetInformation(pet);

        System.out.println();
        System.out.println("Applying discount...");

        facade.setFeeStrategy(new DiscountFeeStrategy());

        facade.showPetInformation(pet);

        System.out.println();
        System.out.println("Free adoption...");

        facade.setFeeStrategy(new FreeAdoptionStrategy());

        facade.showPetInformation(pet);
    }
}