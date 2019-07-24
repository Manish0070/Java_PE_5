package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class SortWordsWithSetTest {
    SortWordsWithSet sortWordsWithSet;

    @Before
    public void setUp() throws Exception {
        sortWordsWithSet = new SortWordsWithSet();
    }

    @After
    public void tearDown() throws Exception {
        sortWordsWithSet = null;
    }

    @Test
    public void givenInputListShouldReturnSortedorder() {
        Set<String> hash_Set = new HashSet<String>();
        hash_Set.add("Manish");
        hash_Set.add("For");
        hash_Set.add("Man");
        hash_Set.add("Man");
        hash_Set.add("Example");
        hash_Set.add("Set");
        System.out.println("hash_set"+hash_Set);


        List<String> expected = new ArrayList<String>();
        expected.add("Example");
        expected.add("For");
        expected.add("Man");
        expected.add("Manish");
        expected.add("Set");


        System.out.println("Expected" +expected);

        List<String> actualvalue = sortWordsWithSet.sortFunctinon(hash_Set);

        System.out.println("Actual" + actualvalue);

        assertEquals(expected,actualvalue);

    }
}