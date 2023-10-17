package com.sofea.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("TesteApi")
public class TesteController {
	
	@GetMapping
	public String retornandoString () {
		return "";
	}
	
	@GetMapping("/1")
	public String retornandoString () {
		return "";
	}

}
