package com.varelait.makeStringGreat;

import java.util.ArrayList;
import java.util.List;

public class MakeStringGreat {
    public static String makeGood(String input){
        char[] inputChar = input.toCharArray();
        List<Character> result = new ArrayList<>();
        Integer current = null;
        Integer next = null;

        for (int i = 0; i < inputChar.length - 1; i++){
            current = (int) inputChar[i];
            next = (int) inputChar[i + 1];
            if (current + 32 == next || current - 32 == next)
                i++;
            else
                result.add(inputChar[i]);
            current = null;
            next = null;
        }

        return "Is good";
    }
}
