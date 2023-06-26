package com.example.rockpaperscissors.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rockpaperscissors.model.Rule;
import com.example.rockpaperscissors.service.RuleService;

@RestController
@RequestMapping("/rules")
public class RuleController {
    @Autowired
    private RuleService ruleService;

    @GetMapping
    public List<Rule> findAll() {
        return ruleService.getRules();
    }

    // @GetMapping(value = "/name/{name}")
    // public List<Rule> findByName(@PathVariable String name) {
    // return ruleService.getRuleByName(name);
    // }
}
