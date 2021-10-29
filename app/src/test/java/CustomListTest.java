import static org.junit.Assert.*;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {

    static CustomList list;

    @Before
    public void setup(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        City c = new City("Edmonton", "AB");

        int size = list.getCount();
        list.addCity(c);
        assertEquals(list.getCount(), size+1);
    }

    @Test
    public void deleteCityTest(){
        //Add a city
        City c = new City("Edmonton", "AB");

        list.addCity(c);
        list.deleteCity(c);

        assertEquals(list.getCount(), 0);
    }

    @Test
    public void countCitiesTest(){
        //Add 2 cities
        City c = new City("AAAAAAAA", "NS");

        list.addCity(c);
        list.addCity(c);

        assertEquals(list.countCities(), 2);
    }

}