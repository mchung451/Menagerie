package main;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BatTest {

    Bat testBat = new Bat("Barry","Fruit",2);

    @Test
    @DisplayName("Bat Leg Test")
    public void batTesting(){
        assertEquals(2, testBat.getLegs(), "This is not a bat");;
    }

    @Test
    @DisplayName("Bat is a Mammal Test")
    public void mammalTest() {
        assertEquals("I breathe air",testBat.breathe(),"This cannot be a mammal as it does not breathe air");
        assertEquals("I have a live birth",testBat.reproduce(),"This cannot be a mammal as it does not have a live birth");
        assertEquals("I am an vertebrate",testBat.skeleton(),"This cannot be a mammal as it not a vertebrate");
    }

    @Test
    @DisplayName("Bat is an animal Test")
    public void animalTest(){
        assertEquals("I die",testBat.death(),"This cannot be an animal as it does not die");
    }

    @Test
    @DisplayName("Bat can fly test")
    public void flyTest(){
        assertEquals("I take off",testBat.takeOff(),"This thing cannot fly");
    }
}
