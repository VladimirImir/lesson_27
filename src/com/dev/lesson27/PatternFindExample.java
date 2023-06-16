package com.dev.lesson27;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternFindExample {

    public static void main(String[] args) {
        String phoneNumber = "das +375 (33) 898-33-33 dsasd +375 (29) 555-12-13 dafdvcx +375 (44) 898-12-22 weq";
        String regex = "(?:\\+375)? ?\\((?<code>\\d{2})\\) ?\\d{3}-\\d{2}-\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        while (matcher.find()){
            System.out.println(matcher.group());
            System.out.println(matcher.group(0));
            System.out.println(matcher.group("code"));
        }
    }
}
