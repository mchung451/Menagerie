package main;

public class Starfish extends Fish {
    private String starfishName;
    private String starfishBreed;
    private int arms;

    /////// This is the constructor /////////
    public Starfish (String starfishName, String starfishBreed, int arms){
        this.starfishName = starfishName;
        this.starfishBreed = starfishBreed;
        this.arms = arms;
    }

    public String getName() {
        return starfishName;
    }

    public void setName(String starfishName) {
        this.starfishName = starfishName;
    }

    public String getBreed() {
        return starfishBreed;
    }

    public void setBreed(String breed) {
        this.starfishBreed = breed;
    }

    public int getArms() {
        return arms;
    }

    public void setArms(int arms) {
        this.arms = arms;
    }
}
