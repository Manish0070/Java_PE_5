package com.stackroute.pe5;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortWordsWithSet {

    public List<String> sortFunctinon(Set<String> hash_set) {

        Set<String>  sorted = new TreeSet<String>(hash_set);

        List<String> list = new ArrayList<String>(sorted);

        return list;
    }

}
