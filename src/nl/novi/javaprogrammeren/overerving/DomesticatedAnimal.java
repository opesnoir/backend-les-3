package nl.novi.javaprogrammeren.overerving;

public abstract class DomesticatedAnimal extends Animal {
    //variables
    String ownerName;
    String favoriteFoodBrand;
    String breed;

    //constructors
    public DomesticatedAnimal(String name, String gender, String ownerName, String favoriteFoodBrand, String breed) {
        super(name, gender);
        this.ownerName = ownerName;
        this.favoriteFoodBrand = favoriteFoodBrand;
        this.breed = breed;
    }

    //getters and setters
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getFavoriteFoodBrand() {
        return favoriteFoodBrand;
    }

    public void setFavoriteFoodBrand(String favoriteFoodBrand) {
        this.favoriteFoodBrand = favoriteFoodBrand;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

}
