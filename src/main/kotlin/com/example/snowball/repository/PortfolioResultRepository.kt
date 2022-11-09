package com.example.snowball.repository

import com.example.snowball.domain.Entity.PortfolioResult
import org.springframework.data.jpa.repository.JpaRepository

interface PortfolioResultRepository: JpaRepository<PortfolioResult, Long> {
}