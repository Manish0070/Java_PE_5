package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class CountRepeatedCharacters {

        public Map<String, Boolean> counterToCheckCharacters(String[] inputString) {
            Map<String, Boolean> resultMap = new HashMap<>();
            if (inputString == null) {
                return null;
            }
            else {
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
