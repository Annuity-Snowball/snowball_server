package com.example.snowball.controller.DTO

import com.example.snowball.domain.Entity.ChartData

class PortfolioResultDTO (

    var id: Long? = null,

    var winRateWithBenefit: Float? = null,
    var winRateWithOutBenefit: Float? = null,


    var returnRateWithBenefit: Float? = null,
    var returnRateWithOutBenefit: Float? = null,

    var valueWithBenefit: Int? = null,
    var valueWithOutBenefit: Int? = null,

    var chartDataWithBenefit: ArrayList<ChartData>,

    var chartDataWithOutBenefit: ArrayList<ChartData>,

    var dailyReturnRate: ArrayList<ChartData>
)