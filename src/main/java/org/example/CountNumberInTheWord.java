package org.example;

import java.util.HashMap;

public class CountNumberInTheWord {
    public static void main(String[] args) {
        String str = "I love to coding in Java.";
        int wordCount = countNumberInWord(str);
        System.out.println("Number of words: " + wordCount);
    }

    public static int countNumberInWord(String s){
        String[] words = s.trim().split("\\s+");
        HashMap<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "");
            String lowercaseWord = word.toLowerCase();
            wordMap.put(lowercaseWord, wordMap.getOrDefault(lowercaseWord, 0) + 1);
        }

        return wordMap.size();
    }
}
