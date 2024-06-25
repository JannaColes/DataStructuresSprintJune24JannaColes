package com.example.todolist;

import java.util.Random;

public class QuoteProvider {
    private static final String[] quotes = {
            "Believe you can and you're halfway there.",
            "The only way to do great work is to love what you do.",
            "Don't watch the clock; do what it does. Keep going.",
            "The future belongs to those who believe in the beauty of their dreams.",
            "You are never too old to set another goal or to dream a new dream."


    };

    public static String getRandomQuote() {
        Random random = new Random();
        return quotes[random.nextInt(quotes.length)];
    }
}
