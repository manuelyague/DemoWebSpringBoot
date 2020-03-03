package cl.myague.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.myague.model.Person;

public interface PersonRepo extends JpaRepository<Person, Integer>{

	
	
}
