package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

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
    Cat cat = new Cat("Jarvis", new Date(), 0);

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
        //given
            //The cat constructed in the field
        //when
        cat.setName("Garfield");
        //then
        Assert.assertEquals(cat.getName(), "Garfield");
    }

    @Test
    public void setBirthDateTest() {
        //given
            //The cat constructed in the field
        Date newDate = new Date();
        //when
        cat.setBirthDate(newDate);
        //then
        Assert.assertEquals(cat.getBirthDate(), newDate);
    }

    @Test
    public void speakTest() {
        //given
            //The cat constructed in the field
        //when

        //then
        Assert.assertEquals(cat.speak(), "meow!");

    }

    @Test
    public void eatTest() {
        Assert.assertTrue(cat.getNumberOfMealsEaten() == 0);


    }

    @Test
    public void getIdTest() {
        //given
            //cat up there
        //when
        Integer id = cat.getId();

        //then
        Assert.assertEquals(id, cat.getId());
    }

    @Test
    public void animalInstanceOfTest() {
        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void mammalInstanceOfTest() {
        Assert.assertTrue(cat instanceof Mammal);
    }


}
