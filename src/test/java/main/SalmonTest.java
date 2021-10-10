package main;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalmonTest {

    Salmon testSalmon = new Salmon("Alex", "Pink", 1.76);

    @Test
    @DisplayName("Salmon arms test")
    void fleshTest() {
        assertEquals("I have orange flesh",testSalmon.fleshColour(),"This animal does not have the matching flesh colour for a real salmon");
    }

    @Test
    @DisplayName("Getting and Setting Test")
    void getAndSet(){
        testSalmon.setSalmonName("Mo");
        testSalmon.setSalmonBreed("Wild Pacific");
        testSalmon.setWeight(0.12);
        assertEquals("Mo",testSalmon.getSalmonName(),"The names do not match");
        assertEquals("Wild Pacific",testSalmon.getSalmonBreed(),"The breeds do not match");
        assertEquals(0.12,testSalmon.getWeight(),"The weights not not match");

    }

    @Test
    @DisplayName("Salmon is an animal Test")
    void animalTest() {
        assertEquals("I die", testSalmon.death(), "This cannot be an animal as it does not die");
    }

    @Test
    @DisplayName("Salmon is a fish Test")
    void fishTest() {
        assertEquals("I breathe water", testSalmon.breathe(), "This does not breathe water so cannot be a fish");
        assertEquals("I live in water", testSalmon.habitat(), "This does not live in water so cannot be a fish");
    }
}
