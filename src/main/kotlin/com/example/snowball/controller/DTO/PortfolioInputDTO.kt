package com.example.snowball.controller.DTO

import com.example.snowball.domain.Entity.Strategy

class PortfolioInputDTO (
    var id: Long? = null,

    var startDate: String? = null,

    var endDate: String? = null,

    var rebalancingDuration: Int? = null,

    var inputMoney: Int? = null,

    var startMoney: Int? = null,

    var inputWay: Int? = null,

    var strategyNumber: Int? = null,

    var strategies: ArrayList<Strategy>
)