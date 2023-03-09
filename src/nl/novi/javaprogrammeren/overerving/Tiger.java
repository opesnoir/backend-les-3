package nl.novi.javaprogrammeren.overerving;

public class Tiger extends WildAnimal{
    public Tiger(String name, String gender, String cageName, String dayLastFed, String countryOfOrigin) {
        super(name, gender, cageName, dayLastFed, countryOfOrigin);
    }

    @Override
    void sound() {
        System.out.println(getName + "can make different sounds it can: growl, roar, chuff and moan");
    }

    @Override
    void food() {
        System.out.println(getName + "is a carnivore, they consume about an average of 35-110 pounds of meat at a given tim");
    }
}
