package main;

public class Snail extends Insects {

    private String name;
    private String breed;
    public double shellDiameter;


    public Snail( String name, String breed, double shellDiameter){
        this.name = name;
        this.breed = breed;
        this.shellDiameter = shellDiameter;
    }

    public String snailSound(){
        return "Slither";
    }

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


    public double getShellDiameter() {
        return shellDiameter;
    }

    public void setShellDiameter(double shellDiameter) {
        this.shellDiameter = shellDiameter;
    }
}
