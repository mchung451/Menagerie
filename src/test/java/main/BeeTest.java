package main;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeeTest {
    Bee testBee = new Bee("Bumble", "Queen", 6);

    @Test
    @DisplayName("Bee Sound Test")
    public void testingBeeSound() {
        assertEquals("Buzz", testBee.buzz(), "This is not a bee");
    }

    @Test
    @DisplayName("Bee Leg Test")
    public void testingBeeLegs() {
        assertEquals(6, testBee.getLegs(), "This is not a bee");
    }

    @Test
    @DisplayName("Bee is a insect test")
    public void testingInsect() {
        assertEquals("I am a invertebrate", testBee.skeleton(), "This cannot be an insect as it is not an invertebrate");
    }


    @Test
    @DisplayName("Bee is an animal Test")
    public void animalTest() {
        assertEquals("I die", testBee.death(), "This cannot be an animal as it does not die");
    }

    @Test
    @DisplayName("Bee can fly test")
    public void flyTest() {
        assertEquals("I take off", testBee.takeOff(), "This thing cannot take off");
        assertEquals("I fly", testBee.fly(), "This thing cannot fly");
        assertEquals("I land", testBee.land(), "This thing cannot land");
    }
}
