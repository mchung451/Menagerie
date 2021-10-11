package main;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class vaccineStepDefinitions {

    /// "A dog name Barney is not vaccinated" User Story ///


    Dog Barney = new Dog("Barney","Terrier",2017,false);

    @Given("Barney has not been vaccinated")
    public boolean checkBarneyVaccinated(){
        return Barney.isVaccinated();
    }

    @When("I check the Barney's birth year")
    public void checkBarneyBirthYear(){
        Barney.needsAVaccine();
    }

    @Then("I should write a note on Barney saying {string}")
    public void zookeeperActionforBarney(String expectedAnswer){
        assertEquals(expectedAnswer,Barney.vaccineMessage());
    }

    /// "A dog named Baxter is not vaccinated" User Story///

    Dog Baxter = new Dog("Baxter","Labrador",2020,true);

    @Given("Baxter has been vaccinated")
    public boolean checkBaxterVaccinated(){
        return Baxter.isVaccinated();
    }

    @When("I check the Baxter's birth year")
    public void checkBaxterBirthYear(){
        Baxter.needsAVaccine();
    }

    @Then("I should write a note on Baxter saying {string}")
    public void zookeeperActionForBaxter(String expectedAnswer){
        assertEquals(expectedAnswer,Baxter.vaccineMessage());
    }

}
