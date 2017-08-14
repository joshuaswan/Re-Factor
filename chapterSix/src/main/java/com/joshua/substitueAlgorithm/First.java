package com.joshua.substitueAlgorithm;

import java.util.Arrays;
import java.util.List;

/**
 * Created by joshua on 2017/8/14.
 */
public class First {

    public String foundPerson(String[] people){
        for (int i=0 ;i<people.length;i++){
            if (people[i].equals("Don"))
                return "Don";
            if (people[i].equals("John"))
                return "John";
            if (people[i].equals("Kent"))
                return "Kent";
        }
        return "";
    }

    public String reFoundPerson(String[] people){
        List candidates = Arrays.asList(new String[] {"Don","John","Kent"});
        for (int i=0;i<people.length;i++){
            if (candidates.contains(people[i]))
                return people[i];
        }
        return "";
    }
}
