package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void newDogTest() {
        String expectedName = "Sage";
        Dog dog = new Dog( expectedName, null, null);
        Assert.assertEquals(dog.getName(), expectedName);
    }

    @Test
    public void speakTest() {
        String expectedResult = "bark!";
        Dog dog = new Dog(null, null, null);
        String actualResult = dog.speak();
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void setBirthDateTest(){
        Dog dog = new Dog(null, null, null);
        LocalDate date = LocalDate.of(2010, 11, 1);
        Date expectedBirthDate = Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant());
        dog.setBirthDate(expectedBirthDate);
        Date actualResult = dog.getBirthDate();
        Assert.assertEquals(actualResult, expectedBirthDate);
    }

    @Test
    public void eatTest(){
    Dog dog = new Dog(null, null, null);
    Food food = new Food();
    dog.eat(food);
    }

    @Test
    public void getIdTest() {
    Dog dog = new Dog(null, null, 234);
    int getID = dog.getId();
    Assert.assertEquals(getID,234);
    }

    @Test
    public void checkAnimalInheritance(){
        Dog dog = new Dog(null, null, null );
        assert dog instanceof Animal;
    }
    @Test
    public void checkMammalInheritance(){
        Dog dog = new Dog(null, null, null );
         assert dog instanceof Mammal;
    }

}
