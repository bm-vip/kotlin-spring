package com.example.kotlinspring.entity

import javax.persistence.*

@Entity
data class PersonEntity(@Id @SequenceGenerator(name="seq_person") @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_person") val id: Long?, val name:String) {
}