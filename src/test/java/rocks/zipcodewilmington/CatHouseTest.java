package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Arrays;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`
    private CatHouse cathouse = new CatHouse();
    private Cat dumbCat = new Cat("dumbCat", new Date(), 42);

    @Test
    public void addCatTest() {
        cathouse.add(dumbCat);
        Assert.assertEquals(cathouse.getNumberOfCats(), (Integer) 1);
        cathouse.clear();
    }

    @Test
    public void removeCatTest() {
        cathouse.remove(dumbCat);
        Assert.assertEquals(cathouse.getNumberOfCats(), (Integer) 0);
        cathouse.clear();
    }

    @Test
    public void removeCatByIDTest() {
        Cat smallCat = new Cat(null,null,567);
        cathouse.add(smallCat);
        cathouse.remove(567);
        Assert.assertEquals(cathouse.getNumberOfCats(), (Integer) 0);
        cathouse.clear();
    }

    @Test
    public void getCatByIDTest() {
        Cat smallCat = new Cat(null,null,567);
        Cat fatCat = new Cat(null,null,123);

        cathouse.add(smallCat);
        cathouse.add(fatCat);
        Assert.assertEquals(cathouse.getCatById(567), smallCat);
        cathouse.clear();
    }

    @Test
    public void numberOfCatsTest() {
        Cat smallCat = new Cat(null,null,567);
        Cat fatCat = new Cat(null,null,123);
        Cat coolCat = new Cat(null,null,123);
        Cat profoundlySmallCat = new Cat(null,null,123);

        cathouse.add(smallCat);
        cathouse.add(fatCat);
        cathouse.add(coolCat);
        cathouse.add(profoundlySmallCat);
        cathouse.add(dumbCat);

        Assert.assertEquals(cathouse.getNumberOfCats(), (Integer) 5);
        cathouse.clear();
    }
}