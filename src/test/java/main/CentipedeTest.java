package main;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CentipedeTest {

    Centipede testCentipede = new Centipede("Mildred", 100);

    @Test
    @DisplayName("Centipede Leg Test")
    void centipedeTest() {
        assertEquals(100, testCentipede.getLegs());
        ;
    }

    @Test
    @DisplayName("Centipede is a insect test")
    void testingInsect() { assertEquals("I am a invertebrate",testCentipede.skeleton(),"This cannot be an insect as it is not an invertebrate");}


    @Test
    @DisplayName("Centipede is an animal Test")
    void animalTest() {
        assertEquals("I die", testCentipede.death(), "This cannot be an animal as it does not die");
    }
}
