package com.stackroute.pe5;

import java.util.Map;
//A method that accepts a Map object having two key-value pairs with the keys val1 and val2.

//  Modify and return the given map as follows:
//a. If the key `val1` has a value, set the key `val2` to have that value, and
//b. Set the key `val1` to have the value `" "` (empty string).
//Example 1:
//The map {"val1": "java", "val2": "c++"} should return {"val1": " ", "val2":
//"java"}
//Example 2:
//The map {"val1": "mars", "val2": "saturn"} should return {"val1": " ", "val2":
//"mars"}

public class InterchangeValues {


    public String exchange(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        String value = map.get("val1"); //getting val1 into value
        map.replace("val2", value); //replacing val2 with val1
        map.replace("val1", " ");//making val1 as empty string
        return map.toString();
    }
}


