package com.example.rockpaperscissors.repository;

import org.springframework.stereotype.Repository;

import com.example.rockpaperscissors.domain.Rule;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RuleRepository extends JpaRepository<Rule, Integer> {
    public List<Rule> findByName(String name);
}
