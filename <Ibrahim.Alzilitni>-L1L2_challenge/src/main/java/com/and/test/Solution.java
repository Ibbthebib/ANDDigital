package com.and.test;

import java.util.*;

public class Solution {

    /**
     * The following is the method where the solution shall be written
     */

    public static String solution(String input) throws NumberFormatException {

        HashSet<String> ANDSiblings = new HashSet<String>();
        String digitsOnly = ""; // A String with digitsOnly from the input
        char position;
        String currentStr = "";
        char[] a = input.toCharArray(); // Array used to print digits into the digitsOnly String
        for (char individuals : a) {
            if (Character.isDigit(individuals)) {
                digitsOnly += individuals;
            }
        }
        ANDSiblings.add(digitsOnly.charAt(0) + "");
        for (int i = 1; i < digitsOnly.length(); i++) {
            position = digitsOnly.charAt(i);
            HashSet<String> temp = new HashSet<String>(); // Temp set which is emptied and reinitialised after printing out its contents to the ANDSiblings set.
            for (String values : ANDSiblings) {
                currentStr = values;
                for (int j = 0; j <= i; j++) {
                    temp.add(currentStr.substring(0, j) + position + currentStr.substring(j));
                }
            }

            ANDSiblings = temp;
        }
        return String.valueOf(ANDSiblings);
    }


    public static void main(String args[]) {
        /*
        Please input content below.
         */
        solution("236");
    }

}
