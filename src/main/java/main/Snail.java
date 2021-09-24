package main;

public class Snail extends Insects implements Vegan{

    private String name;
    private String breed;
    private int legs;


    public Snail( String name, String breed, int legs){
        this.name = name;
        this.breed = breed;
        this.legs = legs;
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

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    @Override
    public String eatLettuce() {
        return "I only eat Lettuce";
    }
}
