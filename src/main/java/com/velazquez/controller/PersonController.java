package com.velazquez.controller;

import com.velazquez.model.Person;
import com.velazquez.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/hello")
    public String hello() {
        System.out.println("hello");
        return "Hello";
    }

    @GetMapping("/person")
    public Iterable<Person> getPerson() {
        return personService.get();
    }

    @GetMapping("/person/{id}")
    public Person getPerson(@PathVariable Long id) {
        return personService.get(id).get();
    }

    @PostMapping("/person")
    public void save(@RequestBody Person person) {
        personService.save(person);
    }

    @PutMapping("/person")
    public void update(@RequestBody Person person) {
        personService.save(person);
    }

    @DeleteMapping("/person/{id}")
    public void delete(Long id) {
        personService.delete(id);
    }

}
