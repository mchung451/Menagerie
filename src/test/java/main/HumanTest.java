package main;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HumanTest {

    Human testHuman = new Human("Fred","European",2);

    @Test
    @DisplayName("Human Noise Test")
    void humanNoiseTest(){
        assertEquals("ahhh!",testHuman.humanNoise(),"This cannot be a human");
    }

    @Test
    @DisplayName("Human Leg Test")
    void humanLegTest(){
        assertEquals(2,testHuman.getLegs(),"This cannot be a human");
    }

    @Test
    @DisplayName("Human is a Mammal Test")
    void mammalTest() {
        assertEquals("I breathe air",testHuman.breathe(),"This cannot be a mammal as it does not breathe air");
        assertEquals("I have a live birth",testHuman.reproduce(),"This cannot be a mammal as it does not have a live birth");
        assertEquals("I am an vertebrate",testHuman.skeleton(),"This cannot be a mammal as it not a vertebrate");
    }

    @Test
    @DisplayName("Human is an animal Test")
    void animalTest(){
        assertEquals("I die",testHuman.death(),"This cannot be an animal as it does not die");
    }

    @Test
    @DisplayName("Human is a vegan Test")
    public void veganTest() {
        assertEquals("I only eat Lettuce",testHuman.eatLettuce(),"Cannot be a vegan it eats something other than lettuce");
    }


}
