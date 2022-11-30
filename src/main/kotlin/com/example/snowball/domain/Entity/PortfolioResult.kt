package com.example.snowball.domain.Entity

import javax.persistence.*

@Entity
@Table
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
    private var chartDataWithBenefit: MutableList<ChartData> = ArrayList<ChartData>(),

    @OneToMany(cascade = [CascadeType.ALL])
    private var chartDataWithOutBenefit: MutableList<ChartData> = ArrayList<ChartData>(),

    @OneToMany(cascade = [CascadeType.ALL])
    private var dailyReturnRate: MutableList<ChartData> = ArrayList<ChartData>()

)