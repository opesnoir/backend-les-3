package nl.novi.javaprogrammeren.overerving;

public abstract class WildAnimal extends Animal{
    //variabelen
    String cageName;
    String dayLastFed;
    String countryOfOrigin;

    //constructors
    public WildAnimal(String name, String gender, String cageName, String dayLastFed, String countryOfOrigin) {
        super(name, gender);
        this.cageName = cageName;
        this.dayLastFed = dayLastFed;
        this.countryOfOrigin = countryOfOrigin;
    }

    //getters and setters

    public String getCageName() {
        return cageName;
    }

    public void setCageName(String cageName) {
        this.cageName = cageName;
    }

    public String getDayLastFed() {
        return dayLastFed;
    }

    public void setDayLastFed(String dayLastFed) {
        this.dayLastFed = dayLastFed;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }
}
