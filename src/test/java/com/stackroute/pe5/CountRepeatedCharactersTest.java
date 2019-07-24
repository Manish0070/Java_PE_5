package com.stackroute.pe5;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;
public class CountRepeatedCharactersTest {
    CountRepeatedCharacters countRepeatedCharacters;
    @Before
    public void setUp() throws Exception {
        countRepeatedCharacters=new CountRepeatedCharacters();
    }
    @After
    public void tearDown() throws Exception {
        countRepeatedCharacters=null;
    }
    @Test
    public void givenAStringArrayShoyldReturnMapWithStringAndBooleanPair(){
        String[] array={"a","b","c","d","z","a","c","z"};
        Map<String,Boolean> expected=new HashMap<>();
        expected.put("a",true);
        expected.put("b",false);
        expected.put("c",true);
        expected.put("d",false);
        expected.put("z",true);
        System.out.println(expected);
        Map<String, Boolean> actualResult=countRepeatedCharacters.counterToCheckCharacters(array);
        System.out.println("Actual" +actualResult);
        assertEquals(expected,actualResult);
    }
}