package com.varelait.makeStringGreat;

import java.util.ArrayList;
import java.util.List;

public class MakeStringGreat {
    public static String makeGood(String s){
        char[] inputChar = s.toCharArray();
        StringBuilder result = new StringBuilder();
        Integer current = null;
        Integer next = null;

        for (int i = 0; i < inputChar.length; i++){
            current = (int) inputChar[i];
            if (i + 1 < inputChar.length) {
                next = (int) inputChar[i + 1];

                if (current + 32 == next || current - 32 == next)
                    return makeGood(result.toString() + s.substring(i + 2));
            }
            result.append(inputChar[i]);
            current = null;
            next = null;
        }


        return result.toString();
    }
}
