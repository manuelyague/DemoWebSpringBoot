package cl.myague.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.myague.model.Person;
import cl.myague.repo.PersonRepo;

@Controller
public class DemoController {
	
	@Autowired
	private PersonRepo personRepo;
	
	/* @GetMapping permite acceder al metodo solamente a traves de la operacion de tipo GET*/
	@GetMapping("/welcome")
	public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
		Person person = new Person();
		person.setIdPerson(1);
		person.setName(name);
		personRepo.save(person);
		
		model.addAttribute("name", name);
		return "welcome";/*nombre de la pagina a nagevar*/
	}

}
