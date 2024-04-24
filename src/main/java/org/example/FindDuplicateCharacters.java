package org.example;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateCharacters {
    public static void main(String[] args) {
        String str = "hello methodia";
        findDuplicateCharacters(str);
    }

    public static void findDuplicateCharacters(String str) {
        Set<Character> duplicates = new HashSet<>();
        Set<Character> seen = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (!seen.add(c)) {
                duplicates.add(c);
            }
        }

        System.out.println("Duplicate characters in the string '" + str + "':");
        for (char duplicate : duplicates) {
            System.out.println(duplicate);
        }
    }
}

