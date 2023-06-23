package com.example.rockpaperscissors.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rules")
public class RulesController {

    @GetMapping
    public String getRules() {
        // TODO add json rules
        return "These are the rules of the game...";
    }
}
