package rocks.zipcodewilmington;

import org.junit.Test;
import rocks.zipcodewilmington.animals.*;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void dogCreationTest() {

        String expectedDogName = "Annie";
        LocalDate date = LocalDate.of(2009, 12, 1);
        Date expectedBirthDate = Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant());
        Dog dog = AnimalFactory.createDog(expectedDogName, expectedBirthDate);
        assert dog.getId() > -1;
    }

   @Test
    public void catCreationTest() {
        String expectedCatName = "Fez";
        LocalDate date = LocalDate.of(2015, 10, 31);
        Date expectedBirthDate = Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant());
        Cat cat = AnimalFactory.createCat(expectedCatName, expectedBirthDate);
        assert cat.getId() > -1;
    }


}
