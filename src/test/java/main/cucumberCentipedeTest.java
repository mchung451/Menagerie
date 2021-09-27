package main;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

class isItACentipede {
    static String isItACentipede (String legs) {
        return "Centipede".equals(legs) ? "Yes":"No";
    }
}

public class cucumberCentipedeTest{
    private String legs;
    private String actualLegs;

    @Given("It has 100 legs")
    public void legsTest1(){
        legs = "100";
    }

    @Given("It has 4 legs")
    public void legsTest2(){
        legs = "4";
    }

    @Given("It has 0 legs")
    public void legsTest3(){
        legs = "0";
    }

    @When("I ask how many legs it has")
    public void actualLegs(){
        actualLegs = isItACentipede.isItACentipede(legs);
    }

    @Then("I should be told {String}")
    public void reveal(String actualLegs){
        assertEquals("100",actualLegs);
    }
}