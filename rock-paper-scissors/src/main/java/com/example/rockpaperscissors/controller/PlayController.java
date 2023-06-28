package com.example.rockpaperscissors.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public Result play(@RequestParam(required = false) boolean explain, @RequestParam String userHand) {
        Hand computerHand = Hand.randomHand();
        if (explain) {
            Rule rule = ruleService.getRuleByName(userHand);
            boolean userWon = (rule.getBeats().equals(computerHand));
            return new Result(userWon, computerHand, Hand.valueOf(userHand.toUpperCase()), Optional.of(rule));
        }
        return new Result(true, computerHand, Hand.valueOf(userHand));
    }
}
