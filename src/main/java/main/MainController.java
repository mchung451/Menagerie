package main;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

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

    public List<Dog> selectDogByName (String name){
        return defaultKennel.stream().filter(Dog -> Dog.getName().toLowerCase().equals(name.toLowerCase())).collect(Collectors.toList());
    }

    public String toString() {
        return new Gson().toJson(defaultKennel);
    }

    public void deleteByName(String name){
        defaultKennel.removeIf(Dog -> (Dog.getName().equals(name)));
    }
}

@RestController
public class MainController {

    Roost newRoost = new Roost();
    Kennel newKennel = new Kennel();

    @CrossOrigin("http://localhost:3000/")
    @GetMapping("/Roost")
    public String myRoost() {
        return newRoost.toString();
    }

    @CrossOrigin("http://localhost:3000/")
    @GetMapping("/Kennel")
    public String myKennel() {
        return newKennel.toString();
    }

    @CrossOrigin("http://localhost:3000/")
    @GetMapping("/WelcomeMessage")
    public String welcome(){
        return "Please do not use flash when photographing the animals";
    }


    @CrossOrigin("http://localhost:3000/")
    @PostMapping("/addDog")
    public String addANewDog(@RequestParam String dogName, String dogBreed, int dogBirthYear, boolean dogVaccinated){
        newKennel.addANewDog(dogName,dogBreed,dogBirthYear,dogVaccinated);
        return "Dog successfully added!";
    }

    @CrossOrigin("http://localhost:3000/")
    @PostMapping("/addRoost" )
    public String addingNewBat(@RequestParam String batName,String batBreed, int batBirthYear, double batWingspan, boolean batBlind){
        newRoost.addANewBat(batName,batBreed, batBirthYear, batWingspan, batBlind);
        return "Bat successfully added!";
    }

    @GetMapping("/dogSearch")
    public String getDogByName (@RequestParam String name){
        return newKennel.selectDogByName(name).toString();
    }

    @DeleteMapping("/Kennel")
    public String deleteDogByName (@RequestParam String name) {
        newKennel.deleteByName(name);
        return newKennel.toString();
    }

    @PutMapping("/updatingDog")
    public String updatingADog (@RequestParam String name, String newName, String newBreed, int newBirthYear, boolean vaccine){
            List<Dog> testDog = newKennel.selectDogByName(name);
            Dog foundDog = testDog.get(0);
            foundDog.setName(newName);
            foundDog.setBreed(newBreed);
            foundDog.setBirthYear(newBirthYear);
            foundDog.setVaccinated(vaccine);
        return testDog.toString();
    }
}
