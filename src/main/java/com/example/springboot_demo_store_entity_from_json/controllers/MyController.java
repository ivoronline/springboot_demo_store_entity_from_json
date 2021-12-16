package com.example.springboot_demo_store_entity_from_json.controllers;

import com.example.springboot_demo_store_entity_from_json.entities.Person;
import com.example.springboot_demo_store_entity_from_json.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

  @Autowired PersonRepository personRepository;

  @ResponseBody
  @RequestMapping("AddPerson")
  String addPerson(@RequestBody Person person) {

    //STORE PERSON ENTITY
    personRepository.save(person);

    //RETURN SOMETHING TO BROWSER
    return "Person added to DB";

  }

}


