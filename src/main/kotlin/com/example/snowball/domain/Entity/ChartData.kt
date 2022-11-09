package com.example.snowball.domain.Entity

import lombok.NoArgsConstructor
import javax.persistence.*

@Entity
@Table
@NoArgsConstructor
class ChartData (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long? = null,

    private var dataDate: String? = null,

    private var dataValue: Int? = null
)