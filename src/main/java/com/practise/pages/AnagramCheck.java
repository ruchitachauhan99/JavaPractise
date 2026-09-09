package com.practise.pages;

import java.util.HashMap;
import java.util.Map;

public class AnagramCheck {
    public static void main(String[] args) {

        String String1="CAT";
        String String2="ACT";

        Map<Character,Integer> map =new HashMap<>();
        map.put('c',1);
      boolean result=map.containsKey('c');
        System.out.println(result);



    }
}
