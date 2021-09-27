package main;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StarfishTest {

    Starfish testStarfish = new Starfish("Patrick","Pink",5);

    @Test
    @DisplayName("Testing the number of arms of a starfish")

    void armTest(){
        assertEquals(5,testStarfish.getArms(),"This cannot be a starfish");
    }

    @Test
    @DisplayName("Starfish is an animal Test")
    void animalTest(){
        assertEquals("I die",testStarfish.death(),"This cannot be an animal as it does not die");
    }

    @Test
    @DisplayName("Starfish is a fish Test")
    void fishTest(){
        assertEquals("I breathe water",testStarfish.breathe(),"This does not breathe water so cannot be a fish");
        assertEquals("I live in water",testStarfish.habitat(),"This does not live in water so cannot be a fish");
    }


}
