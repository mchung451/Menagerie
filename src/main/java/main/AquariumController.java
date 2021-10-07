package main;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AquariumController {

    @GetMapping("/Aquarium")
    public String myAquarium(){
        Aquarium myNewAquarium = new Aquarium();
        return myNewAquarium.toString();
    }

    @PostMapping("/newSalmon")
    public String addNewSalmon(String salmonName, String salmonBreed, int salmonLegs){
        Aquarium newAquarium = new Aquarium();
        Salmon newSalmon = new Salmon(salmonName,salmonBreed,salmonLegs);
        List<Salmon> myNewAquarium = newAquarium.getAquarium();
        myNewAquarium.add(newSalmon);
        return myNewAquarium.toString();
    }
}
