package main;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeeTest {
    Bee testBee = new Bee("Bumble", "Queen", 6);

    @Test
    @DisplayName("Bee Sound Test")
    void testingBeeSound() {
        assertEquals("Buzz", testBee.buzz(), "This is not a bee");
    }

    @Test
    @DisplayName("Bee Leg Test")
    void testingBeeLegs() {
        assertEquals(6, testBee.getSiblings(), "This is not a bee");
    }

    @Test
    @DisplayName("Setters and Getters Test")
    void setAndGet(){
        testBee.setName("Matilda");
        testBee.setBreed("Worker");
        testBee.setSiblings(100);
        assertEquals("Matilda",testBee.getName(),"Names don't match");
        assertEquals("Worker",testBee.getBreed(),"Breeds don't match");
        assertEquals(100,testBee.getSiblings(),"Siblings don't match");
    }

    @Test
    @DisplayName("Bee is a insect test")
    void testingInsect() {
        assertEquals("I am a invertebrate", testBee.skeleton(), "This cannot be an insect as it is not an invertebrate");
        assertEquals("I lay an egg",testBee.reproduce(),"This cannot be an insect as it is an egg");
        assertEquals("I breathe air",testBee.breathe(),"This cannot be an insect as it does not breathe air");

    }


    @Test
    @DisplayName("Bee is an animal Test")
    void animalTest() {
        assertEquals("I die", testBee.death(), "This cannot be an animal as it does not die");
    }

    @Test
    @DisplayName("Bee can fly test")
    void flyTest() {
        assertEquals("I take off", testBee.takeOff(), "This thing cannot take off");
        assertEquals("I fly", testBee.fly(), "This thing cannot fly");
        assertEquals("I land", testBee.land(), "This thing cannot land");
    }
}
