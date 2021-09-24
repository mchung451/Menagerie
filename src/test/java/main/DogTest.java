package main;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DogTest {

    Dog testingDog = new Dog("Scooby","Shitzu",100);

    @Test
    @DisplayName("Dog Noise Test")
    public void woofingTest(){
        assertEquals("woof",testingDog.woof(), "This is not a dog");
    }

    @Test
    @DisplayName("Dog Leg Test")
    public void legTest(){
        assertEquals(4,testingDog.getLegs(),"This is not a dog");
    }

    @Test
    @DisplayName("Dog is a Mammal Test")
    public void mammalTest() {
        assertEquals("I breathe air",testingDog.breathe(),"This cannot be a dog as it does not breathe air");
        assertEquals("I have a live birth",testingDog.reproduce(),"This cannot be a dog as it does not have a live birth");
    }

    @Test
    @DisplayName("Dog is an animal Test")
    public void animalTest(){
        assertEquals("I die",testingDog.death(),"This cannot be an animal as it does not die");
    }
}
