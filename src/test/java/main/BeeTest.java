package main;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeeTest {
    Bee testBee = new Bee("Bumble","Queen",6);

    @Test
    public void testingBeeSound(){
        assertEquals("Buzz",testBee.buzz(),"This is not a bee");
    }

    @Test
    public void testingBeeLegs(){
        assertEquals(6,6,"This is not a bee");
    }
}
