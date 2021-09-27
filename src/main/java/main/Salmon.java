package main;

public class Salmon {

    ////// Attributes //////////

    private String salmonName;
    private String salmonBreed;
    private int salmonArms;

    /////// Constructors //////////

    public Salmon(String salmonName, String salmonBreed, int salmonArms) {
        this.salmonName = salmonName;
        this.salmonBreed = salmonBreed;
        this.salmonArms = salmonArms;
    }

    //////// Methods ////////////

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

    public int getSalmonArms() {
        return salmonArms;
    }

    public void setSalmonArms(int salmonArms) {
        this.salmonArms = salmonArms;
    }
}
