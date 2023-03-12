package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    //
    //
    //
    // TODO - Create tests for `Cat getCatById(Integer id)`
    //

    @Test
    public void testGetNumberOfCats() {

        String name = "Penelope";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);

        // Then
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(actual, 1);
    }

    @Test
    public void testAddCats() {
        Cat cat = AnimalFactory.createCat("Willow", null);
        CatHouse.clear();
        CatHouse.add(cat);
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(actual, 1);
    }
    @Test
    public void testRemoveCatByID() {
        Cat cat = AnimalFactory.createCat("Hexie", null);
        CatHouse.clear();
        CatHouse.add(cat);
        int id = cat.getId();
        CatHouse.remove(id);
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(actual, 0);
    }

    @Test
    public void testRemoveCat() {
        Cat cat = AnimalFactory.createCat("Bailey", null);
        CatHouse.clear();
        CatHouse.add(cat);
        CatHouse.remove(cat);
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(actual, 0);
    }
    @Test
    public void testGetCatByID() {
        Cat cat = AnimalFactory.createCat("Rosie", null);
        CatHouse.clear();
        CatHouse.add(cat);
        int id = cat.getId();
        Cat cat2 = CatHouse.getCatById(id);
        Assert.assertEquals(cat2.getName(),cat.getName());
    }
}
