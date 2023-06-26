package com.example.rockpaperscissors.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rockpaperscissors.domain.Rule;
import com.example.rockpaperscissors.repository.RuleRepository;

@RestController
@RequestMapping("/rules")
public class RuleController {
    @Autowired
    private RuleRepository ruleRepository;

    @GetMapping
    public List<Rule> findAll() {
        return ruleRepository.findAll();
    }

    @GetMapping(value = "/name/{name}")
    public List<Rule> findByName(@PathVariable String name) {
        return ruleRepository.findByName(name);
    }
}
