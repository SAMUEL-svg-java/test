package com.velazquez.service;

import com.velazquez.model.Person;
import com.velazquez.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Iterable<Person> get() {
        return personRepository.findAll();
    }

    public Optional<Person> get(Long id) {
        return personRepository.findById(id);
    }

    public void save(Person person) {
        personRepository.save(person);
    }

    public void  delete(Long id) {
        personRepository.deleteById(id);
    }

}