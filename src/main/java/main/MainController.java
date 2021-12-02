package main;

import com.google.gson.Gson;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
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

    public List<Bat> getListOfBat() {
        return defaultRoost;
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

    public List<Dog> getListOfDog() {
        return defaultKennel;
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

    @PostMapping("/Kennel/addDogTest")
    public String addANewDog(@RequestParam String dogName1, String dogBreed1, int dogBirthYear1, boolean dogVaccinated1){
        newKennel.addANewDog(dogName1,dogBreed1,dogBirthYear1,dogVaccinated1);
        return "Dog successfully added!";
    }

    @PostMapping("Roost/addRoost")
    public String addingNewBat(@RequestParam String batName1,String batBreed1, int batBirthYear1, double batWingspan1, boolean batBlind1){
        newRoost.addANewBat(batName1,batBreed1, batBirthYear1, batWingspan1, batBlind1);
        return "Bat successfully added!";
    }

    @CrossOrigin("http://localhost:3000")
    @PostMapping("Kennel/addDog")
    public ResponseEntity<Dog> addDog (@RequestBody Dog newDog){
        List<Dog> modKennel = newKennel.getListOfDog();
        Dog testDog = new Dog(newDog.getName(),newDog.getBreed(),newDog.getBirthYear(),newDog.isVaccinated());
        modKennel.add(newDog);
        return new ResponseEntity<Dog>(testDog, HttpStatus.OK);
    }

    @CrossOrigin("http://localhost:3000")
    @PostMapping("Roost/addBat")
    public ResponseEntity<Bat> addBat (@RequestBody Bat newBat){
        List<Bat> modRoost = newRoost.getListOfBat();
        Bat testBat = new Bat(newBat.getName(), newBat.getSpecies(), newBat.getBirthYear(), newBat.getWingspan(), newBat.isBlind());
        modRoost.add(newBat);
        return new ResponseEntity<Bat>(testBat, HttpStatus.OK);
    }


    @GetMapping("/Kennel/dogSearch")
    public String getDogByName (@RequestParam String name){
        return newKennel.selectDogByName(name).toString();
    }

    @CrossOrigin("http://localhost:3000")
    @DeleteMapping("/Kennel/deleteDog")
    public String deleteDogByName (@RequestParam String name) {
        newKennel.deleteByName(name);
        return newKennel.toString();
    }

    @PutMapping("/Kennel/CRUD")
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
