package nl.novi.javaprogrammeren.overerving;

public class Dog extends DomesticatedAnimal{
    public Dog(String name, String gender, String ownerName, String favoriteFoodBrand, String breed) {
        super(name, gender, ownerName, favoriteFoodBrand, breed);
    }

    @Override
    void sound() {
        System.out.println(getName + " barks");

    }

    @Override
    void food() {
        System.out.println(getName + " loves meat and other dog-food");

    }
}
