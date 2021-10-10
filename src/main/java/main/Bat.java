package main;

public class Bat extends Mammals implements Flying{

    //////////// Attributes ////////////

    private String name;
    private String species;
    private int birthYear;
    private double wingspan;
    private boolean blind;

    /////////// Constructors ///////////

    public Bat(String name, String species, int birthYear, double wingspan, boolean blind){
        this.name = name;
        this.species = species;
        this.birthYear = birthYear;
        this.wingspan = wingspan;
        this.blind = blind;
    }

    public Bat() {
        this.name = "Unknown";
        this.species = "Unknown";
        this.birthYear = 0;
        this.wingspan = 0;
        this.blind = true;
    }

    /////////// Methods ////////////

    public String screech(){
        return "Screech!";
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

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public boolean isBlind() {
        return blind;
    }

    public void setBlind(boolean blind) {
        this.blind = blind;
    }

    @Override
    public String takeOff() {
        return "I take off";
    }

    @Override
    public String fly() {
        return "I fly";
    }

    @Override
    public String land() {
        return "I land";

    }

    @Override
    public String toString() {
        return "Bat{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", birthYear=" + birthYear +
                ", wingspan=" + wingspan +
                ", blind=" + blind +
                '}';
    }
}
