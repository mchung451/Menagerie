package main;

public class Dog extends Mammals{


    //////////// Attributes ////////////

    private String name;
    private String breed;
    private int birthYear;
    private boolean vaccinated;

    //////////// Constructors ////////////

    public Dog (String name, String breed, int birthYear, boolean vaccinated){
        this.name = name;
        this.breed = breed;
        this.birthYear = birthYear;
        this.vaccinated = vaccinated;
    }

    //////////// Methods /////////////////

    public String woof(){
        return "woof";
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

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", birthYear=" + birthYear +
                ", vaccinated=" + vaccinated +
                '}';
    }
}
