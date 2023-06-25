package com.example.rockpaperscissors.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.rockpaperscissors.domain.Rule;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RuleRepository extends JpaRepository<Rule, Integer> {
    // List<Rule> findAll();
}
