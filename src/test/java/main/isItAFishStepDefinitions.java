package main;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class isItAFishStepDefinitions {
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

    @Given("Bat doesn't breathe water")
    public void batBreatheTest(){
        breathe = "air";
    }

    @When("Salmon is placed in water")
    public void breatheInWaterSalmon() {
        actualbreathe = isItAFish.isItaFishbreathing("water");
    }

    @When("Dog is placed in water")
    public void breatheInWaterDog() {
        actualbreathe = isItAFish.isItaFishbreathing("air");
    }

    @When("Bat is placed in water")
    public void breatheInWaterBat(){
        actualbreathe = isItAFish.isItaFishbreathing("air");
    }

    @Then("Salmon is a fish")
    public void revealsBreatheSalmon(){
        assertEquals("water",breathe,"This does not breathe water");
    }

    @Then("Dog is not a fish")
    public void revealIsBreatheDog(){
        assertEquals("air",breathe,"This does not breathe air");
    }

    @Then("Bat is not a fish")
    public void revealIsBreatheSalmon(){
        assertEquals("air",breathe,"This does not breathe water");
    }
}
