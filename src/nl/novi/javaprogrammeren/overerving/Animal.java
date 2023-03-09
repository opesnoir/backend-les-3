package nl.novi.javaprogrammeren.overerving;

public abstract class Animal {
    //variabelen
    String name;
    String gender;

    //constructors
    public Animal(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    //methodes
    public void movement(){
        System.out.println("the " + name + " has moved 0,25 meter");
    }
    public void sleep (){
        System.out.println("the " + name + " sleeps 8 hours a night");
    }

    //abstract classes
    abstract void sound();
    abstract void food();


}
