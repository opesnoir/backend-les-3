package nl.novi.javaprogrammeren.overerving;

public class Lion extends WildAnimal {

    public Lion(String name, String gender, String cageName, String dayLastFed, String countryOfOrigin) {
        super(name, gender, cageName, dayLastFed, countryOfOrigin);
    }

    @Override
    void sound() {
        System.out.println(name + " makes a roaring sound");

    }

    @Override
    void food() {
        System.out.println(name + " is a carnivore and eats meat only");

    }
}
