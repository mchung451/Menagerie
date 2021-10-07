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
    @GetMapping("/Roost")
    public String myRoost() {
        Roost myRoost = new Roost();
        return myRoost.toString();
    }

    @GetMapping("/Kennel")
    public String myMap() {
        Kennel myKennel = new Kennel();
        return myKennel.toString();
    }

    @GetMapping("/WelcomeMessage")
    public String welcome(){
        return "Please do not use flash when photographing the animals";
    }

    // Created an instance of Kennel since non-static method //
    Kennel newKennel = new Kennel();
    @PostMapping("/addDog")
    public String addANewDog(String dogName, String dogBreed, int dogLegs){
        List<Dog> newKennel1 = newKennel.getKennel();
        Dog newDog = new Dog(dogName, dogBreed, dogLegs);
        newKennel1.add(newDog);
        return newKennel1.toString();
    }

}
