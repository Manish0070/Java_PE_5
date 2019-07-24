package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class InterchangeValuesTest {
    InterchangeValues interchangeValues;

    @Before
    public void setUp() throws Exception {
        interchangeValues = new InterchangeValues();
    }

    @After
    public void tearDown() throws Exception {
        interchangeValues = null;
    }
    @Test
    public void givenInputMapReturnSwappingOfValues() {
        Map<String,String> stringMap = new HashMap<>();//giving values to the exchange method
        stringMap.put("val1","java");
        stringMap.put("val2","c++");
        String result = interchangeValues.exchange(stringMap);
        String expected = "{val2=java, val1= }";
        assertEquals(expected, result);

    }

    @Test
    public void givenInputMap2ReturnSwappingOfValues() {
        Map<String,String> stringMap = new HashMap<>();
        stringMap.put("val1","mars");
        stringMap.put("val2","saturn");
        String result = interchangeValues.exchange(stringMap);
        String expected = "{val2=mars, val1= }";
        assertEquals(expected, result);

    }

    }