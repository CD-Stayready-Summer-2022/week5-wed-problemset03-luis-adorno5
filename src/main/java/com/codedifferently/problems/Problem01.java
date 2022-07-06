package com.codedifferently.problems;

import java.util.HashMap;

public class Problem01 {
    /**
     *
     * @param input the string to be searched
     * @param letter the letter that you will search for
     * @return
     */
    public Integer countDuplicateLetters(String input, String letter){
        HashMap<Character, Integer> countLetters = new HashMap<>();
        char[] letters = input.toCharArray();
        for(char c : letters){
            if(Character.toLowerCase(c) == letter.charAt(0)){
                if(countLetters.containsKey(Character.toLowerCase(c)))
                    countLetters.put(c, countLetters.get(c) + 1);
                else
                    countLetters.put(Character.toLowerCase(c), 1);
            }

        }
        return countLetters.get(letter.charAt(0));
    }
}
