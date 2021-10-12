package main;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

class Roost {

    /// Attributes ///
    private List<Bat> defaultRoost = new ArrayList<>();

    /// Constructor ///
    public Roost() {
        this.defaultRoost.add(new Bat("Barry", "Vampire", 2019, 0.21, false));
        this.defaultRoost.add(new Bat("Fred", "Fruit", 2021,0.5,true));
    }

    /// Methods ///

    public String addANewBat(String batName, String batBreed, int batBirthYear, double batWingspan, boolean batBlind) {
        Bat newBat = new Bat(batName, batBreed, batBirthYear, batWingspan, batBlind);
        return String.valueOf(defaultRoost.add(newBat));
    }

    public String toString() {
        return new Gson().toJson(defaultRoost);
    }

}

class Kennel {

    /// Attributes ///
    private List<Dog> defaultKennel = new ArrayList<>();

    /// Constructor ///
    public Kennel() {
        this.defaultKennel.add(new Dog("Scooby", "Poodle", 2017,true));
        this.defaultKennel.add(new Dog("Beethoven", "Bulldog", 2020,false));
        this.defaultKennel.add(new Dog("Billy", "Golden Retriever", 2009,true));
    }

    /// Methods ///

    public String addANewDog(String dogName, String dogBreed, int dogBirthYear, boolean dogVaccinated) {
        Dog newDog = new Dog(dogName, dogBreed, dogBirthYear, dogVaccinated);
        return String.valueOf(defaultKennel.add(newDog));
    }

    public String toString() {
        return new Gson().toJson(defaultKennel);
    }
}

@RestController
public class MainController {

    Roost newRoost = new Roost();
    Kennel newKennel = new Kennel();

    @GetMapping("/Roost")
    public String myRoost() {
        return newRoost.toString();
    }

    @GetMapping("/Kennel")
    public String myKennel() {
        return newKennel.toString();
    }

    @GetMapping("/WelcomeMessage")
    public String welcome(){
        return "Please do not use flash when photographing the animals";
    }


    @PostMapping("/addDog")
    public String addANewDog(@RequestParam String dogName, String dogBreed, int dogBirthYear, boolean dogVaccinated){
        newKennel.addANewDog(dogName,dogBreed,dogBirthYear,dogVaccinated);
        return "Dog successfully added!";
    }

    @PostMapping("/addRoost" )
    public String addingNewBat(@RequestParam String batName,String batBreed, int batBirthYear, double batWingspan, boolean batBlind){
        newRoost.addANewBat(batName,batBreed, batBirthYear, batWingspan, batBlind);
        return "Bat successfully added!";
    }
}
