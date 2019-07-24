package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountWordTest {
    CountWord countWord;

    @Before
    public void setUp() throws Exception {
        countWord = new CountWord();
    }

    @After
    public void tearDown() throws Exception {
        countWord = null;
    }
    @Test
    public void givenInputStringShouldReturnCountOfRepeatedWords(){

        int actualvalue=countWord.countFunction("one one bhsagd one two two");

        assertEquals(3,actualvalue);
    }
}
