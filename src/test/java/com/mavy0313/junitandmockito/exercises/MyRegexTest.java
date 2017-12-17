package com.mavy0313.junitandmockito.exercises;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class MyRegexTest {

    private Object[] getErAndInput() {
        return $(
                $("123", "abc123"),
                $("345", "abc345"),
                $("", "abc 12"),
                $("345", "cdefg 345 12bb23"),
                $("345, 678", "cdefg 345 12bbb33 678tt"),
                $("345, 678", "345678"));
    }

    @Test
    @Parameters(method = "getErAndInput")
    public void shouldReturnThreeDigits(String er, String input) {
        String ar = MyRegex.getDigits(input);

        assertEquals("Method should return digits " + er + " but returned " + ar, er, ar);
    }

//    @Test
//    public void shouldReturnThreeDigits2() {
//        String er = "345";
//        String ar = MyRegex.getDigits("abc345");
//
//        assertEquals("Method should return digits " + er + " but returned " + ar, er, ar);
//    }
}
