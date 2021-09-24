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

}
