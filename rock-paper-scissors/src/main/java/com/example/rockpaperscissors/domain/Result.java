package com.example.rockpaperscissors.domain;

import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private boolean userWon;
    private String computerHand;
    private String userHand;
    // private Optional<Rule> rule;

    /*
     * public Result(boolean userWon, String computerHand, String userHand) {
     * this.userWon = userWon;
     * this.computerHand = computerHand;
     * this.userHand = userHand;
     * }
     */
}
