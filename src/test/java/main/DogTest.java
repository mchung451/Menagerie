package main;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class DogTest {

    Dog testingDog = new Dog("Scooby","Shitzu",2012,true);

    @Test
    @DisplayName("Dog Noise Test")
    void woofingTest(){
        assertEquals("woof",testingDog.woof(), "This is not a dog");
    }

    @Test
    @DisplayName("Getters and Setters Test")
    void getAndSet(){
        testingDog.setName("Scrappy");
        testingDog.setBreed("Chihuahua");
        testingDog.setBirthYear(2020);
        testingDog.setVaccinated(false);
        assertEquals("Scrappy",testingDog.getName(),"Names do not match");
        assertEquals("Chihuahua",testingDog.getBreed(),"Breeds do not match");
        assertEquals(2020,testingDog.getBirthYear(),"Birth Year does not match");
        assertFalse(testingDog.isVaccinated(),"Vaccination status is not matching");
    }

    @Test
    @DisplayName("To string method")
    void toStringTest(){
        assertEquals("Dog{name='Scooby', breed='Shitzu', birthYear=2012, vaccinated=true}",testingDog.toString(),"To string method doesn't work");
    }

    @Test
    @DisplayName("Dog is a Mammal Test")
    void mammalTest() {
        assertEquals("I breathe air",testingDog.breathe(),"This cannot be a mammal as it does not breathe air");
        assertEquals("I have a live birth",testingDog.reproduce(),"This cannot be a mammal as it does not have a live birth");
        assertEquals("I am an vertebrate",testingDog.skeleton(),"This cannot be a mammal as it not a vertebrate");
    }

    @Test
    @DisplayName("Dog is an Animal Test")
    void animalTest(){
        assertEquals("I die",testingDog.death(),"This cannot be an animal as it does not die");
        assertEquals("I eat something",testingDog.eat(),"This cannot be an animal as it does not eat");
    }
}
