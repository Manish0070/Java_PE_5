package com.stackroute.pe5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//A program to find the number of counts in the following String. Store the output in
//Map<String,Integer> as key value pair.
//Input : String str = “one one -one___two,,three,one @three*one?two”;
//Output : {"one":5 , "two":2, "three" :2}

public class WordRepeatCounter {
    public Map<String, Integer> countFunction(String input) {
        if (input == null) return null;
        List<String> stringList = Arrays.asList(input.split("[\\s_@'*?,(+)#$%^&!~./;`-]+"));
        Map<String, Integer> map = new HashMap<>();
        for (String word : stringList) {
            if (map.containsKey(word)) {
                map.replace(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        return map;
    }

}
