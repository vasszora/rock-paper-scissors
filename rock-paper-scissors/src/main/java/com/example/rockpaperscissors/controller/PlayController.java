package com.example.rockpaperscissors.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.rockpaperscissors.domain.Result;

@RestController
@RequestMapping("/play")
public class PlayController {

    @PostMapping
    public Result play(@RequestParam(required = false) boolean explain, @RequestParam String userHand) {
        if (explain) {
            return new Result(true, "paper", userHand);
        }
        return new Result(true, "paper", userHand);
    }
}
