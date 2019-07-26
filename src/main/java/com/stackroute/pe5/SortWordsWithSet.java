package com.stackroute.pe5;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//A program to implement set interface which sorts the given randomly ordered names in

//ascending order. Convert the sorted set in to an array list
//Input : Harry Olive Alice Bluto Eugene
//Output :
//Sorted Set : Alice Bluto Eugene Harry Olive
//Array list from Set : Alice Bluto Eugene Harry Olive

public class SortWordsWithSet {

    public List<String> sortFunctinon(Set<String> hash_set) {

        Set<String> sorted = new TreeSet<String>(hash_set);

        List<String> list = new ArrayList<String>(sorted);

        return list;
    }

}
