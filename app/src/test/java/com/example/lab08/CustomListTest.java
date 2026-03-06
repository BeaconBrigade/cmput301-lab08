package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testCountCity() {
        CustomList list = new CustomList();
        assertEquals(0, list.countCities());
        City c = new City("c", "p");
        list.addCity(c);
        assertEquals(1, list.countCities());
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City c = new City("c", "p");
        City d = new City("d", "p");
        list.addCity(c);
        list.deleteCity(c);
        assertEquals(0, list.countCities());
        list.addCity(c);
        list.addCity(d);
        list.deleteCity(c);
        assertEquals(1, list.countCities());
    }
}
