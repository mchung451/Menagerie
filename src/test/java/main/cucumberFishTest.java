package main;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.mk_latn.No;

import static org.junit.jupiter.api.Assertions.assertEquals;

class isItAFish {
    static String isItaFishbreathing(String actualbreathe){
        return "Fish".equals(actualbreathe) ? "Yes": "No";
    }
}

public class cucumberFishTest {
    private String breathe;
    private String actualbreathe;

    @Given("Salmon breathes water")
    public void breathetest() {
        breathe = "water";
    }
    @When("Salmon is placed in water")
    public void breatheInWater() {
        actualbreathe = isItAFish.isItaFishbreathing("water");
    }

    @Then("Salmon is a fish")
    public void revealsBreathe(){
        assertEquals("water",breathe,"This does not breathe water");
    }
}
