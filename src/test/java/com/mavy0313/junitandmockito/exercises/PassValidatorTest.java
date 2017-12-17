package com.mavy0313.junitandmockito.exercises;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PassValidatorTest {

    @Test
    public void passShouldHaveTenSymbols() {
        String passTenSymbols = "passwor_123";
        assertTrue("Password has less then 10 symbols", PassValidator.validate(passTenSymbols));

        String passOneSymbol = "p123_";
        assertFalse("Password has less then 10 symbols", PassValidator.validate(passOneSymbol));
    }

    @Test
    public void passShouldHaveThreeDigits() {
        String passThreeDigits = "password123_";
        assertTrue("Password has less then 3 digits", PassValidator.validate(passThreeDigits));

        String passTwoDigits = "password12_";
        assertFalse("Password has less then 3 digits", PassValidator.validate(passTwoDigits));
    }

    @Test
    public void passShouldHaveUnderscore() {
        String passWithUnderscore = "password123_";
        assertTrue("Password doesn't have underscore", PassValidator.validate(passWithUnderscore));

        String passWithoutUnderscore = "password123";
        assertFalse("Validator should return false if pass doesn't have underscore", PassValidator.validate(passWithoutUnderscore));
    }

    @Test
    public void passShouldHaveMixtureOfLowerAndCapitalLetters() {
        String passWithMixture = "Password123_";
        assertTrue("Password doesn't have mixture of lower and capital letters", PassValidator.validate(passWithMixture));
    }
}
