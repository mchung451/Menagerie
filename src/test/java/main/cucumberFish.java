package main;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;




class runner{

}
public class cucumberFish {
    private String breathe;
    private String actualbreathe;


    class isItAFish {
        static String isItaFishbreathing(String actualbreathe){
            return "Fish".equals(actualbreathe) ? "Yes": "No";
        }
    }

    @Given("Salmon breathes water")
    public void salmonBreatheTest() {
        breathe = "water";
    }

    @Given("Dog doesn't breathe water")
    public void dogBreatheTest(){
        breathe = "air";
    }

    @Given("Starfish breathes water")
    public void starfishBreatheTest(){
        breathe = "water";
    }

    @When("Salmon is placed in water")
    public void breatheInWaterSalmon() {
        actualbreathe = isItAFish.isItaFishbreathing("water");
    }

    @When("Dog is placed in water")
    public void breatheInWaterDog() {
        actualbreathe = isItAFish.isItaFishbreathing("air");
    }

    @When("Starfish is placed in water")
    public void breatheInWaterStarfish(){
        actualbreathe = isItAFish.isItaFishbreathing("water");
    }

    @Then("Salmon is a fish")
    public void revealsBreatheSalmon(){
        assertEquals("water",breathe,"This does not breathe water");
    }

    @Then("Dog is not a fish")
    public void revealIsBreatheDog(){
        assertEquals("air",breathe,"This does not breathe air");
    }

    @Then("Starfish is a fish")
    public void revealIsBreatheSalmon(){
        assertEquals("water",breathe,"This does not breathe water");
    }
}
