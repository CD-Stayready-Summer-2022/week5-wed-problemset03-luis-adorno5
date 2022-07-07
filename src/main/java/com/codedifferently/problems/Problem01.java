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
//        int letterCount = 0;
//        char[] letters = input.toCharArray();
//        for(int i = 0; i<input.length(); i++){
//            char lowerCase = Character.toLowerCase(letters[i]);
//            if(lowerCase == Character.toLowerCase(letter.charAt(0))){
//                letterCount++;
//            }
//        }
        String regex = "[^"+letter.toLowerCase()+"]";
        return input.toLowerCase().replaceAll(regex, "").length();
    }
}
