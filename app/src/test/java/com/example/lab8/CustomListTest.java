package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus
     one
     */
    @Test
    public void addCityTest() {
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    /**
     * Create the city of Edmonton
     * Add the city of Edmonton
     * Check that Edmonton is in the list of all cities
     */
    @Test
    public void hasCityTest() {
        list = MockCityList();
        City edmonton = new City("Edmonton", "AB");
        list.addCity(new City("Edmonton", "AB"));
        assertTrue(list.hasCity(edmonton));
    }

    /**
     * Create the city of Edmonton
     * Add the city of Edmonton to the list of all cities
     * Remove the city of Edmonton
     * Ensure that the number of cities is 0
     */
    @Test
    public void deleteCityTest() {
        list = MockCityList();
        City edmonton = new City("Edmonton", "AB");
        list.addCity(edmonton);
        assertEquals(1, list.getCount());
        list.deleteCity(edmonton);
        assertEquals(0, list.getCount());
    }

    @Test
    public void countCitiesTest() {
        list = MockCityList();
        City waterloo = new City("Waterloo", "ON");
        list.addCity(waterloo);
        assertEquals(1, list.countCities());
    }
}
