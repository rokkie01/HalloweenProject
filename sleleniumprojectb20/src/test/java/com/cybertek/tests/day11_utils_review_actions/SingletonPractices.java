package com.cybertek.tests.day11_utils_review_actions;

import org.testng.annotations.Test;

public class SingletonPractices {

    @Test
    public void singleton_test1(){

        String str1 = Singleton.getWord();
        System.out.println("str1 = " + str1);

        String str2 = Singleton.getWord();
        System.out.println("str1 = " + str2);

        String str3 = Singleton.getWord();
        System.out.println("str1 = " + str3);
    }
}
