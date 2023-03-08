package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


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
        City city = new City("Edmonton", "AB");
        list.addCity(city);

        assertEquals(1, list.getCount());


    }

    @Test
    public void addCityTest() {
        CustomList list;

        list = new CustomList(null,new ArrayList<>());

        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), listSize + 1);
    }


    }
