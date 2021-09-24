package main;

public class Starfish extends Fish {
    private String name;
    private String breed;
    private int arms;

    public Starfish (String name, String breed, int arms){
        this.name = name;
        this.breed = breed;
        this.arms = arms;
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

    public int getArms() {
        return arms;
    }

    public void setArms(int arms) {
        this.arms = arms;
    }
}
