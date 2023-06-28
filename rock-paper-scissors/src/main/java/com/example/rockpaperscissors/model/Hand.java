package com.example.rockpaperscissors.model;

import java.util.Random;

public enum Hand {
    ROCK("rock"),
    PAPER("paper"),
    SCISSORS("scissors");

    private String hand;
    private static final Random PRNG = new Random();
    private static final Hand[] hands = values();

    private Hand(String hand) {
        this.hand = hand;
    }

    public static Hand randomHand() {
        return hands[PRNG.nextInt(hands.length)];
    }

}
