package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;
//program where an array of strings is input and output is a Map<String,boolean> where
//each different string is a key and its value is true if that string appears 2 or more times in the array
//Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
//Output - {“a” : true,”b” :false ,”c” :true,”d” : false}

public class CountRepeatedCharacters {

    public Map<String, Boolean> counterToCheckCharacters(String[] inputString) {
        Map<String, Boolean> resultMap = new HashMap<>();
        if (inputString == null) {
            return null;
        } else {
            for (int i = 0; i < inputString.length; i++) {
                String character = inputString[i];//taking first character of string in variable(character)
                if (resultMap.containsKey(character))//checking charcter present or not
                    resultMap.put(character, true);//if character presents adding it to resultMap
                else
                    resultMap.put(character, false);//if character not presents adding to resultMap
            }
            return resultMap;
        }
    }
}
