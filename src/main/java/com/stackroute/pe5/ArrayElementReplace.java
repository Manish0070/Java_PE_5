package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.List;

//Java program to update specific array element by given element and empty the array list.
//Input: [Apple, Grape, Melon, Berry]
// Output: [Kiwi, Grape, Mango, Berry]
//Array list after removing all elements []

public class ArrayElementReplace {
    public ArrayList elementReplacer(ArrayList fruits, String inputString, String replaceElement) {
        if (fruits.contains(inputString)) {
            int index = fruits.indexOf(inputString);
            fruits.set(index, replaceElement);
        }

        return fruits;

    }

    public ArrayList emptyList(ArrayList fruits) {
        fruits = new ArrayList<String>(fruits);
        fruits.removeAll(fruits);
        return fruits;
    }

}