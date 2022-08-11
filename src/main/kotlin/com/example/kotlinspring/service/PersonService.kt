package com.example.kotlinspring.service

import com.example.kotlinspring.entity.PersonEntity
import com.example.kotlinspring.repository.PersonRepository
import org.springframework.stereotype.Service

@Service
class PersonService(var repository: PersonRepository) {
    fun findAll(): Iterable<PersonEntity> {
        return repository.findAll()
    }

    fun save(person: PersonEntity):PersonEntity {
        return repository.save(person)
    }
}