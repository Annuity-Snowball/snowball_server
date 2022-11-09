package com.example.snowball.controller

import com.example.snowball.controller.DTO.PortfolioInputDTO
import com.example.snowball.domain.Entity.PortfolioInput
import com.example.snowball.service.PortfolioInputService
import com.example.snowball.service.PortfolioResultService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

/*
* 포트폴리오 추가 api 목록
*/
@RestController
class AddController(
    val portfolioInputService: PortfolioInputService,
    val portfolioResultService: PortfolioResultService
) {

    @PostMapping("/add")
    fun addPortfolio(@RequestBody portInput : PortfolioInputDTO ){

        var portfolioInput:PortfolioInput = PortfolioInput(
            id = portInput.id,
            startDate = portInput.startDate,
            endDate = portInput.endDate,
            rebalancingDuration = portInput.rebalancingDuration,
            inputMoney = portInput.inputMoney,
            startMoney = portInput.startMoney,
            inputWay = portInput.inputWay,
            strategyNumber = portInput.strategyNumber,
            strategies = portInput.strategies
        )

        portfolioInputService.create(portfolioInput)
    }
}