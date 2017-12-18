package com.mavy0313.junitandmockito.exercises.bookingsystem;

import java.util.LinkedHashMap;
import java.util.Map;

public class BookingSystem {

    private Map<String, Boolean> bookedHours = new LinkedHashMap<>();

    public String getBookedHours() {
//        StringBuilder result = new StringBuilder();
//
//        for (String hour : bookedHours.keySet()) {
//            result.append(hour).append(", ");
//        }
//
//        if (result.toString().endsWith(", ")) {
//            result.delete(result.length() - 2, result.length());
//        }
//        return result.toString();

        return String.join(", ", bookedHours.keySet());
    }

    public void bookHours(String hours) {
        if (!hours.matches("\\d{1,2}:00")) {
            throw new IllegalArgumentException("Invalid hours");
        }

        if (bookedHours.containsKey(hours)) {
            throw new IllegalArgumentException("Already booked");
        }
        bookedHours.put(hours, true);
    }
}
