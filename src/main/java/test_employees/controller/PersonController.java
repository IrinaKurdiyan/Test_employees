package test_employees.controller;

import org.springframework.web.bind.annotation.*;
import test_employees.model.Person;
import test_employees.repository.Repository;

import java.util.List;

@RestController
public class PersonController {
    Repository rep = new Repository();

    @GetMapping("/person/{id}")
    public Person getPersonById(@PathVariable("id") Integer id) {
        return rep.getPersonById(id);
    }

    @GetMapping("/personList")
    public List<Person> getAllPersons() {
       return rep.getAllPersons();
    }

    @PostMapping("/person")
    public Person addPerson (@RequestBody Person person) {
        return rep.addPerson(person);
    }

    @PutMapping("/person")
    public Person updatePersonData (@RequestBody Person person) {
        return rep.updatePersonData(person);
    }

    @DeleteMapping("/person/{id}")
    public Person deletePerson(@PathVariable("id") Integer id) {
        return rep.deletePersonById(id);
    }

}
