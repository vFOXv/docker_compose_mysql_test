package com.example.DemoDockerMySQLjavaWEB.services;

import com.example.DemoDockerMySQLjavaWEB.models.Person;
import com.example.DemoDockerMySQLjavaWEB.repositories.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAllPeople(){
        return personRepository.getAllPerson();
    }

    public void savePerson(Person person){
        personRepository.savePerson(person);
    }

    public void deletePerson(Long id){
        personRepository.deletePersonById(id);
    }
}
