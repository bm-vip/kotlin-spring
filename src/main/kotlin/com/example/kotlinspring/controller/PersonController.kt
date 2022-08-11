package com.example.kotlinspring.controller

import com.example.kotlinspring.entity.PersonEntity
import com.example.kotlinspring.service.PersonService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/person/v1")
class PersonController(val personService: PersonService) {
    @GetMapping("/findAll")
    fun findAllPerson(): Iterable<PersonEntity> {
        return personService.findAll();
    }

    @PostMapping("/save")
    fun save(@RequestBody person:PersonEntity):PersonEntity{
        return personService.save(person)
    }
}