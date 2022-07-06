package com.codedifferently.problems;

import java.util.ArrayList;

public class Problem02 {
    public static Integer cousinTag(ArrayList<String> cousins, Integer startIndex, String targetName) {
        Integer left = 0;
        Integer right = 0;
        boolean isFound = false;
        for (int i = startIndex; i <= cousins.size()-1; i++) { //counts up
            if(cousins.get(i).equals(targetName)){
                isFound = true;
            }
            if (!(cousins.get(i).equals(targetName)) && !isFound){
                left++;
            }
        }

        for (int i = startIndex; i > -1; i--) { //counts down
            if (!(cousins.get(i).equals(targetName))){
                right++;
            }
        }

        if (left > right){
            return right;
        }
        else if (right > left) {
            return left;
        }
        return 0;
    }
}
