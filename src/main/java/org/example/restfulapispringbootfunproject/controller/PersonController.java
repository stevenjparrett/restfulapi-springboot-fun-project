package org.example.restfulapispringbootfunproject.controller;

import org.example.restfulapispringbootfunproject.model.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @GetMapping("/output")
    public ResponseEntity<Person> getPerson() {
        Person person = new Person(1,"mark",10);
        return new ResponseEntity<>(person, HttpStatus.OK);
    }


}
