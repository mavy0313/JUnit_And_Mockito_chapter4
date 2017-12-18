package com.mavy0313.junitandmockito.exercises.bookingsystem;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class BookingSystemTest {

    private Object[] getInvalidHours() {
        return $(
                $("8:30"),
                $(""),
                $("abcd"),
                $("08;00"),
                $("8:0"),
                $("8"),
                $("_#$%"));
    }

    @Test
    public void shouldReturnListOfBookedHours() {
        BookingSystem bookingSystem = new BookingSystem();

        assertEquals("", bookingSystem.getBookedHours());

        bookingSystem.bookHours("8:00");

        assertEquals("8:00", bookingSystem.getBookedHours());

        bookingSystem.bookHours("9:00");
        bookingSystem.bookHours("10:00");
        assertEquals("8:00, 9:00, 10:00", bookingSystem.getBookedHours());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAllowDoubleBooked() {
        BookingSystem bookingSystem = new BookingSystem();
        bookingSystem.bookHours("8:00");
        bookingSystem.bookHours("8:00");
    }

    @Test(expected = IllegalArgumentException.class)
    @Parameters(method = "getInvalidHours")
    public void shouldNotAllowToBookInvalidHours(String invalidHour) {
        BookingSystem bookingSystem = new BookingSystem();
        bookingSystem.bookHours(invalidHour);
    }
}
