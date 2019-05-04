package com.research.development.R.D.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

	@GetMapping
	public String greet(@RequestParam boolean exit) {
		System.out.println("Greeting user");
		if(exit)
		System.exit(0);
		return "Holla comistas!";
	}
}
