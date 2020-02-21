package com.learn.java8features.defaults;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodExample {

    public static void main(String[] args) {

        /* Sort a list of Strings */
        List<String> stringList = Arrays.asList("Adam", "Jenny", "Alex", "Dan","Mike", "Eric");

        /* Before Java8 way */
        /*Collections.sort(stringList);
        System.out.println("Sorted list before 8: " + stringList);*/

        /* Since Java8 way of sorting */
        stringList.sort(Comparator.naturalOrder());
        System.out.println("Sorted using default sort method of List interface: " + stringList);
        stringList.sort(Comparator.reverseOrder());
        System.out.println("Reverse sorting using default sort method of List interface: " + stringList);
    }
}
