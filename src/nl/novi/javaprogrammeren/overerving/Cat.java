package nl.novi.javaprogrammeren.overerving;

public class Cat extends DomesticatedAnimal{

    public Cat(String name, String gender, String ownerName, String favoriteFoodBrand, String breed) {
        super(name, gender, ownerName, favoriteFoodBrand, breed);
    }

    @Override
    void sound() {
        System.out.println(getName + "miaows");
    }

    @Override
    void food() {
        System.out.println(getName + "loves fish and other cat-food");
    }
}
