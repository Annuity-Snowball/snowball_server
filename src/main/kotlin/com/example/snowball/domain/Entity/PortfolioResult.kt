package com.example.snowball.domain.Entity

import javax.persistence.*

@Entity
class PortfolioResult (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long? = null,

    private var winRateWithBenefit: Float? = null,
    private var winRateWithOutBenefit: Float? = null,


    private var returnRateWithBenefit: Float? = null,
    private var returnRateWithOutBenefit: Float? = null,

    private var valueWithBenefit: Int? = null,
    private var valueWithOutBenefit: Int? = null,

    @OneToMany(cascade = [CascadeType.ALL])
    private var chartDataWithBenefit: ArrayList<ChartData>,

    @OneToMany(cascade = [CascadeType.ALL])
    private var chartDataWithOutBenefit: ArrayList<ChartData>,

    @OneToMany(cascade = [CascadeType.ALL])
    private var dailyReturnRate: ArrayList<ChartData>

)