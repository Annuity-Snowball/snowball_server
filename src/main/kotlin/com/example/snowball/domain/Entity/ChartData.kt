package com.example.snowball.domain.Entity

import javax.persistence.*

@Entity
@Table
class ChartData (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long? = null,

    private var dataDate: String? = null,

    private var dataValue: Int? = null
)