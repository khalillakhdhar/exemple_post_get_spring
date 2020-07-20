package com.example.classes.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.classes.Model.Formation;

@RestController
public class FormationController {

	
	
	@GetMapping("")
	ModelAndView web()
	{
	ModelAndView mv=new ModelAndView("formation.html");
	return mv;
	}
	@PostMapping("formation")
	@ResponseBody String createFormation(@RequestParam String titre,@RequestParam String formateur,@RequestParam String description)
	{
		Formation f=new Formation(titre,description,formateur);
		return f.toString();
		
	}
}
