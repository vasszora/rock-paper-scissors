package com.example.rockpaperscissors.model;

import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private boolean userWon;
    private Hand computerHand;
    private Hand userHand;
    private Rule rule;

    public Result(boolean userWon, Hand computerHand, Hand userHand) {
        this.userWon = userWon;
        this.computerHand = computerHand;
        this.userHand = userHand;
    }
}
