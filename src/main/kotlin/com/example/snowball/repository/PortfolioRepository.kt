package com.example.snowball.repository

import com.example.snowball.domain.Entity.Portfolio
import org.springframework.data.jpa.repository.JpaRepository

interface PortfolioRepository: JpaRepository<Portfolio, Long> {
}