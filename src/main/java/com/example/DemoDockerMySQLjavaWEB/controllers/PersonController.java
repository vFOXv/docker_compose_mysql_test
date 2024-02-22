package com.example.DemoDockerMySQLjavaWEB.controllers;

import com.example.DemoDockerMySQLjavaWEB.models.Person;
import com.example.DemoDockerMySQLjavaWEB.services.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/person")
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/show/all")
    public String showAllPeople(Model model){
        model.addAttribute("allPeople", personService.getAllPeople());
        return "Person/all_people";
    }

    @GetMapping("/add/new_person")
    public String goToPageForAddNewPerson(Model model){
        model.addAttribute("new_person", new Person());
        return "Person/new_person";
    }

    @PostMapping("/add/new_person")
    public String createNewPerson(@ModelAttribute("new_person") Person person){
        personService.savePerson(person);
        //может упасть - возможно надо указать в redirect /person ============================>>>>>>>>>>
        return "redirect:/show/all";
    }



    @DeleteMapping("/{id}")
    public String deletePerson(Long id){
        personService.deletePerson(id);
        //может упасть - возможно надо указать в redirect /person ============================>>>>>>>>>>
        return "redirect:/show/all";
    }
}
