package com.example.snowball.repository

import com.example.snowball.domain.Entity.Strategy
import org.springframework.data.jpa.repository.JpaRepository

interface StrategyRepository: JpaRepository<Strategy, Long> {
}