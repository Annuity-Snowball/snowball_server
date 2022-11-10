package com.example.snowball.domain.Entity

import lombok.NoArgsConstructor
import javax.persistence.*

@Entity
@Table
@NoArgsConstructor
class Strategy (

    @Id
    @Column(unique=true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long? = null,

    private var productName: String? = null,

    private var productNumber: Int? = null,

    private var productRate: Int? = null,

    private var productStartRate: Int? = null,

    private var productEndRate: Int? = null

)