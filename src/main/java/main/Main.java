package main;

import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


class Roost {

    /// Attributes ///
    private List<Bat> roost = new ArrayList<>();

    /// Constructor ///
    public Roost() {
        this.roost.add(new Bat("Barry", "Fruit", 2));
        this.roost.add(new Bat("Shaun", "Giant", 2));
    }

    /// Methods ///

    public String addANewBat(String batName, String batBreed, int batLegs) {
        Bat newBat = new Bat(batName, batBreed, batLegs);
        return String.valueOf(roost.add(newBat));
    }

    public List<Bat> getRoost() {
        return this.roost;
    }

    public String toString() {
        String json = new Gson().toJson(roost);
        return json;
    }

}

class Kennel {

    /// Attributes ///
    private List<Dog> kennel = new ArrayList<>();

    /// Constructor ///
    public Kennel() {
        this.kennel.add(new Dog("Scooby", "Poodle", 4));
        this.kennel.add(new Dog("Beethoven", "Bulldog", 4));
        this.kennel.add(new Dog("Billy", "Golden Retriever", 4));
    }

    /// Methods ///

    public String addANewDog(String dogName, String dogBreed, int dogLegs) {
        Dog newDog = new Dog(dogName, dogBreed, dogLegs);
        return String.valueOf(kennel.add(newDog));
    }

    public List<Dog> getKennel() {
        return this.kennel;
    }

    public String toString() {
        String json = new Gson().toJson(kennel);
        return json;
    }
}


@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args){
        SpringApplication.run(Main.class, args);
    }

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
    public String addANewDog(@RequestParam String dogName, String dogBreed, int dogLegs){
        newKennel.addANewDog(dogName,dogBreed,dogLegs);
        return "Dog successfully added!";
    }

    @PostMapping("/addRoost" )
    public String addingNewBat(@RequestParam String batName,String batBreed, int batLegs){
        newRoost.addANewBat(batName,batBreed, batLegs);
        return "Bat successfully added!";
    }
}
