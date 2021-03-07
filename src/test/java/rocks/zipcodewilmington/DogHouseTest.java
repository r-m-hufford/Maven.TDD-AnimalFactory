package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;
import org.junit.Assert;



/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`
    private DogHouse doghouse = new DogHouse();

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
        DogHouse.getNumberOfDogs();
        doghouse.clear();
    }

    @Test
    public void addDogTest() {
        Dog scotch = new Dog("scotch", new Date(), 1975);
        doghouse.add(scotch);

        Assert.assertEquals(doghouse.getNumberOfDogs(), (Integer) 1);
        doghouse.clear();

    }


    @Test
    public void removeDogTest() {
        Dog scotch = new Dog("scotch", new Date(), 1975);
        doghouse.add(scotch);
        doghouse.remove(scotch);

        Integer numberOfDogs = doghouse.getNumberOfDogs();

        Assert.assertEquals(numberOfDogs, (Integer) 0);
        doghouse.clear();
    }


    @Test
    public void removeDogByIDTest() {
        Dog fern = new Dog("fern", new Date(), 1776);
        doghouse.add(fern);
        doghouse.remove(1776);
        Integer numberOfDogs = doghouse.getNumberOfDogs();

        Assert.assertEquals(numberOfDogs, (Integer) 0);
        doghouse.clear();
    }


    @Test
    public void getDogByIDTest() {
        Dog milo = new Dog("milo", new Date(), 1346);
        Dog otis = new Dog("otis", new Date(), 1984);

        doghouse.add(milo);
        doghouse.add(otis);

        Assert.assertTrue(doghouse.getDogById(1984) == otis);
        doghouse.clear();
    }


    @Test
    public void numberOfDogsTest() {
        Dog milo = new Dog("milo", new Date(), 1346);
        Dog otis = new Dog("otis", new Date(), 1984);
        Dog scotch = new Dog("scotch", new Date(), 1975);
        Dog fern = new Dog("fern", new Date(), 1776);

        doghouse.add(milo);
        doghouse.add(otis);
        doghouse.add(scotch);
        doghouse.add(fern);

        Assert.assertEquals(doghouse.getNumberOfDogs(), (Integer) 4);
        doghouse.clear();
    }
}
