package com.example.snowball.repository

import com.example.snowball.domain.Entity.PortfolioInput
import org.springframework.data.jpa.repository.JpaRepository

interface PortfolioInputRepository:JpaRepository<PortfolioInput, Long> {
}