package main;

public abstract class Fish extends Animals{

    public String breathe(){
        return "I breathe water";
    }

    public String reproduce(){
        return "I either lay eggs or have live birth";
    }

    public String skeleton(){
        return "I am an invertebrate";
    }
}
