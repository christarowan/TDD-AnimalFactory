package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Cat cat = new Cat (null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        cat.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = cat.getName();
        Assert.assertEquals(dogName, givenName);
    }



    @Test
    public void speakTest() {
        String expectedResult = "meow!";
        Cat cat = new Cat(null, null, null);
        String actualResult = cat.speak();
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void setBirthDateTest(){
        Cat cat = new Cat(null, null, null);
        LocalDate date = LocalDate.of(2011, 1, 18);
        Date expectedBirthDate = Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant());
        cat.setBirthDate(expectedBirthDate);
        Date actualResult = cat.getBirthDate();
        Assert.assertEquals(actualResult, expectedBirthDate);
    }

    @Test
    public void eatTest(){
        Cat cat = new Cat (null, null, null);
        Food food = new Food();
        cat.eat(food);
    }

    @Test
    public void getIdTest() {
        Cat cat = new Cat (null, null, 234);
        int getID = cat.getId();
        Assert.assertEquals(getID,234);
    }

    @Test
    public void checkAnimalInheritance(){
        Cat cat = new Cat(null, null, null );
        assert cat instanceof Animal;
    }
    @Test
    public void checkMammalInheritance(){
        Cat cat = new Cat (null, null, null );
        assert cat instanceof Mammal;
    }

}
