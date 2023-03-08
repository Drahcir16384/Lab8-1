package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class CustomListTest {

    private ArrayList<City> citylist = new ArrayList<>();;

    public void init()
    {
        //citylist =
    }

    @Test
    public void testAddCity()
    {

        CustomList list = new CustomList(null, citylist);
        assertEquals(0, list.getCount());
        City city = new City("Edmonton", "AB");
        list.addCity(city);

        assertEquals(1, list.getCount());


    }
    @Test
    public void testHasCity()
    {
        CustomList list = new CustomList(null, citylist);
        City city = new City("Edmonton", "AB");
        list.addCity(city);


        assertTrue(list.hasCity(city));
        city = new City("Toronto", "ON");
        assertFalse(list.hasCity(city));


    }

    @Test
    public void testDeleteCity()
    {
        CustomList list = new CustomList(null, citylist);
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        assertEquals(1, list.getCount());
        list.deleteCity(city);
        assertFalse(list.hasCity(city));
        assertEquals(0, list.getCount());

    }









    }
