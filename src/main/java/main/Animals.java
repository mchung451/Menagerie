package main;

public abstract class Animals {

    /// Methods ///

    public abstract String breathe();
    public abstract String reproduce();
    public abstract String skeleton();

    public String death(){
        return "I die";
    }

    public String eat(){
        return "I eat something";
    }
}


