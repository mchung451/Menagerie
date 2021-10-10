package main;

public class Bee extends Insects implements Flying{

    ///// Attributes ///////
    private String name;
    private String breed;
    private int siblings;

    ///// Constructor //////
    public Bee (String name, String breed, int siblings){
        this.name = name;
        this.breed = breed;
        this.siblings = siblings;
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

    public int getSiblings() {
        return siblings;
    }

    public void setSiblings(int siblings) {
        this.siblings = siblings;
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
}
