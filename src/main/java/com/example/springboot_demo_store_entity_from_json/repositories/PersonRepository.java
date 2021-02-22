package com.example.springboot_demo_store_entity_from_json.repositories;

import com.example.springboot_demo_store_entity_from_json.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> { }
