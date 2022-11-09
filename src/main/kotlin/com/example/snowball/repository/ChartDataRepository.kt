package com.example.snowball.repository

import com.example.snowball.domain.Entity.ChartData
import org.springframework.data.jpa.repository.JpaRepository

interface ChartDataRepository:JpaRepository<ChartData, Long> {
}