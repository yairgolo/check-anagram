package com.yair.model;

import java.util.Arrays;
import java.util.Locale;

public class Find {

    public static boolean checkForAnagram (String s1, String s2){
        String st1 = s1.replaceAll("\\s", "");
        String st2 = s2.replaceAll("\\s", "");
        char[] c1 = st1.toLowerCase(Locale.ROOT).toCharArray();
        char[] c2 = st2.toLowerCase(Locale.ROOT).toCharArray();
        boolean isAnagram = false;

        if (c1.length != c2.length){
            return false;
        } else {
            Arrays.sort(c1);
            Arrays.sort(c2);
            for (int i = 0; i < c1.length; i++) {
                if (c1[i] != c2[i]){
                    return false;
                }
            }
        }
            return true;

    }
}
