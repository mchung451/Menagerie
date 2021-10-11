package main;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SnailTest {

    Snail testSnail = new Snail("Gary","Giant African",0.24);

    @Test
    @DisplayName("Snail Sound Test")
    void snailSoundTest(){
        assertEquals("Slither",testSnail.snailSound(),"This cannot be a snail");
    }


    @Test
    @DisplayName("Snail get and set test")
    void getAndSet(){
        testSnail.setName("AJ");
        testSnail.setBreed("Milk");
        testSnail.setShellDiameter(1);
        assertEquals("AJ",testSnail.getName(),"Names don't match");
        assertEquals("Milk",testSnail.getBreed(),"Breeds don't match");
        assertEquals(1,testSnail.getShellDiameter(),"Shell diameter don't match");

    }

    @Test
    @DisplayName("Snail is a insect test")
    void testingInsect() { assertEquals("I am a invertebrate",testSnail.skeleton(),"This cannot be an insect as it is not an invertebrate");}

    @Test
    @DisplayName("Snail is an animal Test")
    void animalTest(){
        assertEquals("I die",testSnail.death(),"This cannot be an animal as it does not die");
    }


}
