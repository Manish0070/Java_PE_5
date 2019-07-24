package com.stackroute.pe5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ArrayElementReplaceTest {
    ArrayElementReplace arrayElementReplace;

    @org.junit.Before
    public void setUp() throws Exception {
        arrayElementReplace = new ArrayElementReplace();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        arrayElementReplace = null;
    }
    @Test
    public void givenAnArrayOfElementsShouldReplaceWithRequiredElement(){
        List<String> fruits = new ArrayList<String>();

        fruits.add("Apple");
        fruits.add("Grape");
        fruits.add("Melon");
        fruits.add("Berry");

        List<String> expected = new ArrayList<String>();

        expected.add("Banana");
        expected.add("Grape");
        expected.add("Melon");
        expected.add("Berry");

        List actualvalue = arrayElementReplace.elementReplacer((ArrayList) fruits,"Apple","Banana");
        assertEquals(expected,actualvalue);
    }
}