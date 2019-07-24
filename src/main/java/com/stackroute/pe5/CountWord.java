package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class CountWord {
    public int countFunction(String inputString){
        String[] wordsArray = inputString.split("\\s+");
        int count=0;
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : wordsArray) {

            if (map.containsKey(word)) {
                count = map.get(word);
                map.put(word, count + 1);
            } else {
                map.put(word, 1);
            }
        }
        if(count>1){
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            return entry.getValue();
        }}

        return 0;
    }


}

