package com.example.demo.service;

import com.example.demo.model.Person;

import java.util.List;

public interface PersonService {

    Person createPerson(String username, String password);

    List<Person> listAllUsers();
}
