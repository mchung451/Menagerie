package main;

public class Bee extends Insects implements Flying{

    ///// Attributes ///////
    private String name;
    private String breed;
    private int legs;

    ///// Constructor //////
    public Bee (String name, String breed, int legs){
        this.name = name;
        this.breed = breed;
        this.legs = legs;
    }

    ////// Methods ///////

    public String buzz(){
        return "Buzz";
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

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
