package com.research.development.R.D.Controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.research.development.R.D.Reactor.TestReactor;

import reactor.core.publisher.Flux;

@RestController
@CrossOrigin
public class Home {

	@GetMapping
	public String greet(@RequestParam boolean exit) {
		System.out.println("Greeting user");
		if(exit)
		System.exit(0);
		return "Holla comistas!";
	}
	
	@GetMapping(value="/try-flux",produces=MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<String> getStudents(){
		return TestReactor.getStudent();
	}
}
