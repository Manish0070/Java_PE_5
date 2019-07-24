package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.List;

public class ArrayElementReplace {
    public ArrayList elementReplacer(ArrayList fruits, String inputString,String replaceElement) {
        if(fruits.contains(inputString)){
           int index=fruits.indexOf(inputString);
           fruits.set(index,replaceElement);
        }

    return fruits;

    }
    public ArrayList emptyList(ArrayList fruits){
        fruits= new ArrayList<String>(fruits);
        fruits.removeAll(fruits);
        return fruits;
    }

}