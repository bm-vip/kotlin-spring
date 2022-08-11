package com.example.kotlinspring.entity

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class PersonEntity(@Id @GeneratedValue val id: UUID?, val name:String) {

}