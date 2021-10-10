package main;

public class Centipede extends Insects{

    /////// Attributes ///////////
    private String name;
    private int legs;

    ////// Constructors //////////
    public Centipede(String name, int legs){
        this.name = name;
        this.legs = legs;
    }

    /////// Methods //////////

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
