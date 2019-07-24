package com.stackroute.pe5;

import java.util.Map;

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


