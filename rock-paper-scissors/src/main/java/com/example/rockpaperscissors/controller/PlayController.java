package com.example.rockpaperscissors.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.example.rockpaperscissors.model.Hand;
import com.example.rockpaperscissors.model.Result;
import com.example.rockpaperscissors.model.Rule;
import com.example.rockpaperscissors.service.RuleService;

@RestController
@RequestMapping("/play")
public class PlayController {
    @Autowired
    private RuleService ruleService;

    @PostMapping
    @ExceptionHandler({ MethodArgumentTypeMismatchException.class })
    public Result play(@RequestParam(required = false) boolean explain,
            @RequestParam String userHand) {
        Hand computerHand = Hand.randomHand();
        Hand userHandEnum;
        try {
            userHandEnum = Hand.valueOf(userHand.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid hand: " + userHand);
        }

        Rule rule = ruleService.getRuleByName(userHandEnum);
        boolean userWon = (rule.getBeats().equals(computerHand));

        if (explain) {
            return new Result(userWon, computerHand, userHandEnum, rule);
        }
        return new Result(userWon, computerHand, userHandEnum);
    }
}
