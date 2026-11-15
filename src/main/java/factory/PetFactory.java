package factory;


public class PetFactory {

    public static Pet createPet(String type, String name) {

        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("Pet type is required.");
        }

        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Pet name is required.");
        }

        switch (type.toLowerCase()) {

            case "dog":
                return new Dog(name);

            case "cat":
                return new Cat(name);

            case "rabbit":
                return new Rabbit(name);

            default:
                throw new IllegalArgumentException("Unknown pet type.");
        }
    }
}
