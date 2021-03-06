package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Person;
import com.example.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	
	public Object findAll(){
		return personRepository.findAll();
	}
	
	public Person findById(Long id){
		return personRepository.findOne(id);
	}
	
	public Person save(Person person){
		return personRepository.save(person);
	}
	
	public void delete(Person person){
		personRepository.delete(person);
		return;
	}
	
	public Person findByEmail(String email){
		return null;
	}
}
