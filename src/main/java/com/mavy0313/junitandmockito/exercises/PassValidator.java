package com.mavy0313.junitandmockito.exercises;

public class PassValidator {
    public static boolean validate(String pass) {
        if (pass.length() >= 10 && containsDigits(3, pass) && pass.contains("_") && containsCapitalAndLowerLetters(pass)) {
            return true;
        }
        return false;
    }

    private static boolean containsCapitalAndLowerLetters(String arg) {
        boolean hasLowerLetter = false;
        boolean hasCapitalLetter = false;

//        for (char c : arg.toCharArray()) {
//            if (Character.isLowerCase(c)) {
//                hasLowerLetter = true;
//            }
//
//            if (Character.isUpperCase(c)) {
//                hasCapitalLetter = true;
//            }
//
//            if (hasCapitalLetter && hasLowerLetter) {
//                return true;
//            }
//        }

        for (int i = 0; i < arg.length() && !(hasCapitalLetter || hasLowerLetter); i++) {

        }

        return false;
    }

    private static boolean containsDigits(int amountOfDigits, String arg) {
        int count = 0;
        for (char c : arg.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }

        return count == amountOfDigits;
    }


}
