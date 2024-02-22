package com.example.DemoDockerMySQLjavaWEB.repositories;

import com.example.DemoDockerMySQLjavaWEB.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    Person getPersonById(Long id);
    List<Person> getAllPerson();
    Person savePerson(Person person);

    Person updatePerson(Long id, Person person);

    void deletePersonById(Long id);
}
