package main;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class BatTest {

    Bat testBat = new Bat("Robin","Fruit",2010,0.3,false);

    @Test
    @DisplayName("Bat Noise Test")
    void screechTest(){
        assertEquals("Screech!",testBat.screech(),"The noise does not match the sound a bat makes");
    }

    @Test
    @DisplayName("Setters and Getters Test")
    void setAndGet(){
        testBat.setName("Barry");
        testBat.setSpecies("Vampire");
        testBat.setBirthYear(2020);
        testBat.setWingspan(0.2);
        testBat.setBlind(false);
        assertEquals("Barry",testBat.getName(),"The names do not match");
        assertEquals("Vampire",testBat.getSpecies(),"The species do not match");
        assertEquals(2020,testBat.getBirthYear(),"The birth year does not match");
        assertEquals(0.2,testBat.getWingspan(),"The wingspan does not match");
        assertFalse(testBat.isBlind(),"The blind status is incorrect");
    }

    @Test
    @DisplayName("toString test")
    void toStringTest(){
        assertEquals("Bat{name='Unknown', species='Unknown', birthYear=2021, wingspan=1.0, blind=true}",testBat.toString(),"To string method does not work");
    }

    @Test
    @DisplayName("Bat is a Mammal Test")
    void mammalTest() {
        assertEquals("I breathe air", testBat.breathe(), "This cannot be a mammal as it does not breathe air");
        assertEquals("I have a live birth", testBat.reproduce(), "This cannot be a mammal as it does not have a live birth");
        assertEquals("I am an vertebrate", testBat.skeleton(), "This cannot be a mammal as it not a vertebrate");
    }

    @Test
    @DisplayName("Bat is an animal Test")
    void animalTest() {
        assertEquals("I die", testBat.death(), "This cannot be an animal as it does not die");
        assertEquals("I eat something", testBat.eat(),"This cannot be an animal as it does not eat");
    }

    @Test
    @DisplayName("Bat can fly test")
    void flyTest() {
        assertEquals("I take off", testBat.takeOff(), "This thing cannot take off");
        assertEquals("I fly", testBat.fly(), "This thing cannot fly");
        assertEquals("I land", testBat.land(), "This thing cannot land");
    }

}