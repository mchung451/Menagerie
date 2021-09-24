package main;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BatTest {

    Bat testBat = new Bat("Barry","Fruit",2);

    @Test
    @DisplayName("Bat Leg Test")
    public void batTesting(){
        assertEquals(2, testBat.getLegs(), "This is not a bat");;
    }
}
