package main;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class ElephantTest {

    Elephant testElephant = new Elephant("Stampy","African",3.45,1998,true);

    @Test
    @DisplayName("Elephant Stomp Test")
    void stompTest(){
        assertEquals("STOMP!",testElephant.stomp(),"No stomp recorded...");
    }

    @Test
    @DisplayName("Setters and Getters Test")
    void setTestElephant(){
        testElephant.setName("Ricky");
        testElephant.setSpecies("Asian");
        testElephant.setHeight(3.99);
        testElephant.setBirthYear(2006);
        testElephant.setHealthy(false);
        assertEquals("Ricky",testElephant.getName(),"The given name of the elephant does not match");
        assertEquals("Asian",testElephant.getSpecies(),"The species is not correct");
        assertEquals(3.99,testElephant.getHeight(),"The measured height is incorrect");
        assertEquals(2006,testElephant.getBirthYear(),"The birth year is incorrect");
        assertFalse(testElephant.isHealthy(),"The health status is not accurate");
    }


    @Test
    @DisplayName("Elephant is a Mammal Test")
    void mammalTest() {
        assertEquals("I breathe air",testElephant.breathe(),"This cannot be a mammal as it does not breathe air");
        assertEquals("I have a live birth",testElephant.reproduce(),"This cannot be a mammal as it does not have a live birth");
        assertEquals("I am an vertebrate",testElephant.skeleton(),"This cannot be a mammal as it not a vertebrate");
    }

    @Test
    @DisplayName("Elephant is an Animal Test")
    void animalTest(){
        assertEquals("I die",testElephant.death(),"This cannot be an animal as it does not die");
        assertEquals("I eat something",testElephant.eat(),"This cannot be an animal as it does not eat");
    }

}
