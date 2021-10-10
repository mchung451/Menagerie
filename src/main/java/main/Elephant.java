package main;

public class Elephant extends Mammals{

    /////// Attributes //////

    private String name;
    private String species;
    private double height;
    private int birthYear;
    private boolean healthy;


    /////// Methods //////

    public Elephant (String name, String species, double height, int birthYear, boolean healthy){
        this.name = name;
        this.species = species;
        this.height = height;
        this.birthYear = birthYear;
        this.healthy = healthy;
    }

    ///// Methods //////

    public String stomp(){
        return "STOMP!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public boolean isHealthy() {
        return healthy;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

}
