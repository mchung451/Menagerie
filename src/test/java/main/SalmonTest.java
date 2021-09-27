package main;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SalmonTest {

    Salmon testSalmon = new Salmon("Alex", "Pink", 0);

    @Test
    @DisplayName("Salmon arms test")
    void armTest() {
        assertEquals(0, testSalmon.getSalmonArms(), "This cannot be a salmon as it has arms");
    }

    @Test
    @DisplayName("Starfish is an animal Test")
    void animalTest() {
        assertEquals("I die", testSalmon.death(), "This cannot be an animal as it does not die");
    }

    @Test
    @DisplayName("Starfish is a fish Test")
    void fishTest() {
        assertEquals("I breathe water", testSalmon.breathe(), "This does not breathe water so cannot be a fish");
        assertEquals("I live in water", testSalmon.habitat(), "This does not live in water so cannot be a fish");
    }
}
