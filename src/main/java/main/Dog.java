package main;

public class Dog extends Mammals{

    //TEST!//

    //////////// Attributes ////////////

    private String name;
    private String breed;
    private int birthYear;
    private boolean vaccinated;
    private boolean needsVaccine;

    //////////// Constructors ////////////

    public Dog (String name, String breed, int birthYear, boolean vaccinated){
        this.name = name;
        this.breed = breed;
        this.birthYear = birthYear;
        this.vaccinated = vaccinated;
    }

    //////////// Methods /////////////////

    public String woof(){
        if (birthYear >=0){
            birthYear += 1;
        }
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

    public boolean isNeedsVaccine() {
        return needsVaccine;
    }

    public void setNeedsVaccine(boolean needsVaccine) {
        this.needsVaccine = needsVaccine;
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

    public void needsAVaccine(){
        if (getBirthYear() >= 2019){
            this.setNeedsVaccine(true);
        }
        else{
            this.setNeedsVaccine(false);
        }
    }

    public String vaccineMessage(){
        String message;
        if (isNeedsVaccine()){
            message = "not list the dog to be vaccinated";
        }
        else{
            message = "list the dog to be vaccinated";
        }
        return message;
    }



}
