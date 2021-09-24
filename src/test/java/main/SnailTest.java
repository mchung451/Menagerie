package main;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SnailTest {

    Snail testSnail = new Snail("Gary","Giant African",0);

    @Test
    @DisplayName("Snail Sound Test")
    public void snailSoundTest(){
        assertEquals("Slither",testSnail.snailSound(),"This cannot be a snail");
    }

    @Test
    @DisplayName("Snail Leg Test")
    public void snailLegTest(){
        assertEquals(0,testSnail.getLegs(),"This cannot be a Snail");
    }

    @Test
    @DisplayName("Snail is a insect test")
    public void testingInsect() { assertEquals("I am a invertebrate",testSnail.skeleton(),"This cannot be an insect as it is not an invertebrate");}

    @Test
    @DisplayName("Snail is an animal Test")
    public void animalTest(){
        assertEquals("I die",testSnail.death(),"This cannot be an animal as it does not die");
    }

    @Test
    @DisplayName("Snail is a vegan Test")
    public void veganTest() {
        assertEquals("I only eat Lettuce",testSnail.eatLettuce(),"Cannot be a vegan it eats something other than lettuce");
    }


}
