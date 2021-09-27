package main;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DogTest {

    Dog testingDog = new Dog("Scooby","Shitzu",4);

    @Test
    @DisplayName("Dog Noise Test")
    void woofingTest(){
        assertEquals("woof",testingDog.woof(), "This is not a dog");
    }

    @Test
    @DisplayName("Dog Leg Test")
    void legTest(){
        assertEquals(4,testingDog.getLegs(),"This is not a dog");
    }

    @Test
    @DisplayName("Dog is a Mammal Test")
    void mammalTest() {
        assertEquals("I breathe air",testingDog.breathe(),"This cannot be a mammal as it does not breathe air");
        assertEquals("I have a live birth",testingDog.reproduce(),"This cannot be a mammal as it does not have a live birth");
        assertEquals("I am an vertebrate",testingDog.skeleton(),"This cannot be a mammal as it not a vertebrate");
    }

    @Test
    @DisplayName("Dog is an Animal Test")
    void animalTest(){
        assertEquals("I die",testingDog.death(),"This cannot be an animal as it does not die");
    }
}
