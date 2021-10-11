package main;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

class isItACentipedeMain {
    static boolean isItACentipede (int legs) {
        return "Centipede".equals(legs);
    }
}

public class cucumberCentipede{
    private int legs;
    private int actualLegs;
    private boolean match;

    public cucumberCentipede (int actualLegs, boolean match){
        this.actualLegs = 100;
        this.match = true;
    }

    @Given("It has 100 legs")
    public void legsTest1(){
        legs = 100;
    }

    @Given("It has 4 legs")
    public void legsTest2(){
        legs = 4;
    }

    @Given("It has 0 legs")
    public void legsTest3(){
        legs = 0;
    }

    @When("I ask how many legs it has")
    public void actualLegs(){
        match = isItACentipedeMain.isItACentipede(legs);
    }

    @Then("I should be told Yes")
    public void revealYes(){
        assertEquals(actualLegs,legs);
    }

    @Then("I should be told a dog is not a centipede")
    public void revealNoDog(){
        assertEquals(actualLegs,legs);
    }

    @Then("I should be told a salmon is not a centipede")
    public void revealNoSalmon(){
        assertEquals(actualLegs,legs);
    }
}