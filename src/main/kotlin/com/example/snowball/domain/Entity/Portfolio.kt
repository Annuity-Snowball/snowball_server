package com.example.snowball.domain.Entity

import javax.persistence.*

@Entity
@Table
class Portfolio (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long? = null,

    private var userName: String? = null,

    private var portfolioName: String? = null,

    @OneToOne(cascade = [CascadeType.ALL])
    private var inputValue: PortfolioInput,

    @OneToOne(cascade = [CascadeType.ALL])
    private var resultValue: PortfolioResult
)