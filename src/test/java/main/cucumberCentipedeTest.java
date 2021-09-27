package main;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

class isItACentipede {
    static String isItACentipede (int legs) {
        return "Centipede".equals(legs) ? "Yes":"No";
    }
}

public class cucumberCentipedeTest{
    private int legs;
    private String actualLegs;

    @Given("It has 100 legs")
    public void legs(){
        legs = 100;
    }

    @When("I ask how many legs it has")
    public void actualLegs(){
        actualLegs = isItACentipede.isItACentipede(legs);
    }

    @Then("I should be told {String}")
    public void reveal(String actualLegs){
        assertEquals(100,actualLegs);
    }
}