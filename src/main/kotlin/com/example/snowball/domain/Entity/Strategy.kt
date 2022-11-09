package com.example.snowball.domain.Entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Strategy (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long? = null,

    private var productNumber: Int? = null,

    private var productRate: Int? = null,

    private var productStartRate: Int? = null,

    private var productEndRate: Int? = null

)