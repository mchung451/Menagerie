package main;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SpringTest {

    Roost testRoost = new Roost();
    Kennel testKennel = new Kennel();

    @Test
    @DisplayName("testRoost to string")
    void getRoostTest(){
        assertEquals("[{\"name\":\"Barry\",\"species\":\"Vampire\",\"birthYear\":2019,\"wingspan\":0.21,\"blind\":false},{\"name\":\"Fred\",\"species\":\"Fruit\",\"birthYear\":2021,\"wingspan\":0.5,\"blind\":true}]", testRoost.toString(),"The class is not right");
    }

    @Test
    @DisplayName("testKennel to string")
    void getKennelTest(){
        assertEquals("[{\"name\":\"Scooby\",\"breed\":\"Poodle\",\"birthYear\":2017,\"vaccinated\":true,\"needsVaccine\":false},{\"name\":\"Beethoven\",\"breed\":\"Bulldog\",\"birthYear\":2020,\"vaccinated\":false,\"needsVaccine\":false},{\"name\":\"Billy\",\"breed\":\"Golden Retriever\",\"birthYear\":2009,\"vaccinated\":true,\"needsVaccine\":false}]",testKennel.toString(),"No match");
    }
}
