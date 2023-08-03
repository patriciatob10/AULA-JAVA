package com.kaspper.olamundospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OlaMundoController {
	
	@GetMapping("/ola-mundo")	
	public String olaMundo() {
		
		return "index";
	}

}
