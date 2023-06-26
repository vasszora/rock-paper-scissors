package com.example.rockpaperscissors.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rockpaperscissors.model.Rule;
import com.example.rockpaperscissors.repository.RuleRepository;

@Service
public class RuleService {
    @Autowired
    private RuleRepository ruleRepository;

    public List<Rule> getRules() {
        return ruleRepository.findAll();
    }

    public Rule getRuleByName(String name) {
        return ruleRepository.findByName(name).get(0);
    }
}
