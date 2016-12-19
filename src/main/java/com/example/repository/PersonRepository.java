package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.entity.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {
	public Person findByEmail(String email);
}
