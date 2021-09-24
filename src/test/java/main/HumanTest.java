package main;

import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanTest {

    Human testHuman = new Human("Fred","European",2);

    @Test
    @DisplayName("Human Noise Test")
    public void humanNoiseTest(){
        assertEquals("ahhh!",testHuman.humanNoise(),"This cannot be a human");
    }

    @Test
    @DisplayName("Human Leg Test")
    public void humanLegTest(){
        assertEquals(2,testHuman.getLegs(),"This cannot be a human");
    }


}
