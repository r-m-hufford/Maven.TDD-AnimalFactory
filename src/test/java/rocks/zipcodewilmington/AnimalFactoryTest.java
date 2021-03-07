package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`


    @Test
    public void createDogTestName() {
        //given
        AnimalFactory animal = new AnimalFactory();
        String name = "Cujo";

        Dog dog = AnimalFactory.createDog(name, null);

        Assert.assertEquals(dog.getName(), name);
    }

    @Test
    public void createDogTestBirthDate() {
        //given
        AnimalFactory animal = new AnimalFactory();
        Date birthDate = new Date();

        Dog dog = AnimalFactory.createDog(null, birthDate);

        Assert.assertEquals(dog.getBirthDate(), birthDate);
    }

    @Test
    public void createCatTestName() {
        //given
        AnimalFactory animal = new AnimalFactory();
        String name = "Mewtwo";

        Cat cat = AnimalFactory.createCat(name, null);

        Assert.assertEquals(cat.getName(), name);
    }

    @Test
    public void createCatTestBirthDate() {
        //given
        AnimalFactory animal = new AnimalFactory();
        Date birthDate = new Date();

        Cat cat = AnimalFactory.createCat(null, birthDate);

        Assert.assertEquals(cat.getBirthDate(), birthDate);
    }
}