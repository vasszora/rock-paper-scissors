package com.example.rockpaperscissors.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/play")
public class PlayController {
    @PostMapping
    public String play(@RequestParam(required = false) boolean explain) {
        if (explain) {
            return "explain";
        }
        return "play";
    }
}
