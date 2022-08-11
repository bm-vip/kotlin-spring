package com.example.kotlinspring.repository

import com.example.kotlinspring.entity.PersonEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonRepository : CrudRepository<PersonEntity,String>{

}