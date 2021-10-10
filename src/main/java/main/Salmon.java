package main;

public class Salmon extends Fish{

    ////// Attributes //////////

    private String salmonName;
    private String salmonBreed;
    private double weight;

    /////// Constructors //////////

    public Salmon(String salmonName, String salmonBreed, double weight) {
        this.salmonName = salmonName;
        this.salmonBreed = salmonBreed;
        this.weight = weight;
    }

    //////// Methods ////////////

    public String fleshColour(){
        return "I have orange flesh";
    }

    public String getSalmonName() {
        return salmonName;
    }

    public void setSalmonName(String salmonName) {
        this.salmonName = salmonName;
    }

    public String getSalmonBreed() {
        return salmonBreed;
    }

    public void setSalmonBreed(String salmonBreed) {
        this.salmonBreed = salmonBreed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Salmon{" +
                "salmonName='" + salmonName + '\'' +
                ", salmonBreed='" + salmonBreed + '\'' +
                ", weight=" + weight +
                '}';
    }
}
