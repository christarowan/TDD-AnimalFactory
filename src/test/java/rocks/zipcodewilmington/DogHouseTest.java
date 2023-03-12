package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `Dog getDogById(Integer id)`


    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(actual, 1);
    }

    @Test
    public void testAddDogs() {
        Dog dog = AnimalFactory.createDog("Fido", null);
        DogHouse.clear();
        DogHouse.add(dog);
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(actual, 1);
    }
    @Test
    public void testRemoveDogByID() {
        Dog dog = AnimalFactory.createDog("Laddie", null);
        DogHouse.clear();
        DogHouse.add(dog);
        int id = dog.getId();
        DogHouse.remove(id);
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(actual, 0);
    }

    @Test
    public void testRemoveDog() {
        Dog dog = AnimalFactory.createDog("Barkley", null);
        DogHouse.clear();
        DogHouse.add(dog);
        DogHouse.remove(dog);
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(actual, 0);
    }
    @Test
    public void testGetDogByID() {
        Dog dog = AnimalFactory.createDog("Bella", null);
        DogHouse.clear();
        DogHouse.add(dog);
        int id = dog.getId();
        Dog dog2 = DogHouse.getDogById(id);
        Assert.assertEquals(dog2.getName(),dog.getName());
    }
}
