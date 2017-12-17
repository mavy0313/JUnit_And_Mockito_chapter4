package com.mavy0313.junitandmockito.exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegex {
    public static String getDigits(String arg) {

        StringBuilder result = new StringBuilder();
        Pattern pattern = Pattern.compile("(\\d{3,})");
        Matcher matcher = pattern.matcher(arg);
//        if (matcher.matches()) {
//            for (int i = 1; i <= matcher.groupCount(); i++) {
//                if (i == matcher.groupCount()) {
//                    result.append(matcher.group(i));
//                } else {
//                    result.append(matcher.group(i)).append(", ");
//                }
//            }
//        }
        while (matcher.find()) {
            result.append(matcher.group()).append(", ");
        }
        if (result.toString().endsWith(", ")) {
            result.delete(result.length() - 2, result.length());
        }

        return result.toString();
    }
}
