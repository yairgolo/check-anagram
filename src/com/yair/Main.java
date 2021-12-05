package com.yair;

import com.yair.model.Find;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String s1 = "hello world";
        String s2 = "world h e ll o";
        System.out.println(Find.checkForAnagram(s1, s2));
    }
}
