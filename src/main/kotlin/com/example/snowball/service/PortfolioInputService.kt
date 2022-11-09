package com.example.snowball.service

import com.example.snowball.domain.Entity.PortfolioInput
import com.example.snowball.repository.PortfolioInputRepository
import org.springframework.stereotype.Service

@Service
class PortfolioInputService(val repository:PortfolioInputRepository) {

    fun create(portfolioInput: PortfolioInput){
        repository.save(portfolioInput)
    }
}