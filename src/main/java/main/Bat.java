package main;

public class Bat extends Mammals implements Flying{

    //////////// Attributes ////////////

    private String name;
    private String breed;
    private int legs;

    /////////// Constructors ///////////
    public Bat(String name, String breed, int legs){
        this.name = name;
        this.breed = breed;
        this.legs = legs;
    }

    /////////// Methods ////////////

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    @Override
    public void takeOff() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void land() {

    }
}
