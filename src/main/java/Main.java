import factory.Pet;
import facade.AdoptionFacade;
import strategy.StandardFeeStrategy;
import strategy.DiscountFeeStrategy;
import strategy.FreeAdoptionStrategy;

public class Main {

    public static void main(String[] args) {

        AdoptionFacade facade =
                new AdoptionFacade(new StandardFeeStrategy());

        Pet cat = facade.createPet("cat", "Luna");

        facade.showPetInformation(cat);

        System.out.println();

        System.out.println("Applying discount...");

        facade.setFeeStrategy(new DiscountFeeStrategy());

        facade.showPetInformation(cat);

        System.out.println();

        System.out.println("Free adoption...");

        facade.setFeeStrategy(new FreeAdoptionStrategy());

        facade.showPetInformation(cat);
    }
}
