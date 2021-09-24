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

}
