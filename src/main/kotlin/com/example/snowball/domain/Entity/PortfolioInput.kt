package com.example.snowball.domain.Entity

import javax.persistence.*

@Entity
@Table
class PortfolioInput (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long? = null,

    private var name: String? = null,

    private var startDate: String? = null,

    private var endDate: String? = null,

    private var rebalancingDuration: Int? = null,

    private var inputMoney: Int? = null,

    private var startMoney: Int? = null,

    private var inputWay: Int? = null,

    private var strategyNumber: Int? = null,

    @OneToMany(cascade = [CascadeType.ALL])
    private var strategies: MutableList<Strategy> = ArrayList<Strategy>(),
)