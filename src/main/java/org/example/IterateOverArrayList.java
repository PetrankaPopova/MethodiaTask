package org.example;

import java.util.ArrayList;

public class IterateOverArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        System.out.println("Iterating over the ArrayList using for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("\nIterating over the ArrayList using while loop:");
        int j = 0;
        while (j < list.size()) {
            System.out.println(list.get(j));
            j++;
        }
    }
}

