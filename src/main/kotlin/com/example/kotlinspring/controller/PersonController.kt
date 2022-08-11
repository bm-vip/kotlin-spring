package com.example.kotlinspring.controller

import com.example.kotlinspring.entity.PersonEntity
import com.example.kotlinspring.exception.ResourceNotFoundException
import com.example.kotlinspring.service.PersonService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/person/v1")
class PersonController(val personService: PersonService) {
    @GetMapping
    fun findAllPerson(): Iterable<PersonEntity> {
        return personService.findAll();
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): ResponseEntity<PersonEntity> {
        return ResponseEntity.ok(
            personService.findById(id) ?: throw ResourceNotFoundException("person not found with id:" + id)
        )
    }

    @PostMapping
    fun save(@RequestBody person: PersonEntity): PersonEntity {
        return personService.save(person)
    }
}