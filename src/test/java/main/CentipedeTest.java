package main;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CentipedeTest {

    Centipede testCentipede = new Centipede("Mildred",100);

    @Test
    @DisplayName("Centipede Leg Test")
    public void centipedeTest(){
        assertEquals(100,testCentipede.getLegs());;
    }
}
