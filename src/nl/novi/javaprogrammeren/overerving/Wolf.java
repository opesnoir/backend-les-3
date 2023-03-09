package nl.novi.javaprogrammeren.overerving;

public class Wolf extends WildAnimal{
    public Wolf(String name, String gender, String cageName, String dayLastFed, String countryOfOrigin) {
        super(name, gender, cageName, dayLastFed, countryOfOrigin);
    }

    @Override
    void sound() {
        System.out.println(getName + " vocalizations can be separated into four categories: barking, whimpering, growling, and howling.");

    }

    @Override
    void food() {
        System.out.println(getName + " eat meat, they are carnivores and prefer to eat large hoofed mammals");
    }
}
