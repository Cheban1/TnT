package com.tat.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tat.model.PersonalInfo;
import com.tat.repository.PersonalInfoRepository;

@RestController
@RequestMapping("/")
public class PersonalInfoController {
	@Autowired
	PersonalInfoRepository personalInfoRepo;
	
	/*
	 * @GetMapping("/registration") public String getRegistrationForm() { return
	 * "registration"; }
	 */
	@PostMapping("/create")
	public PersonalInfo postInfo(@RequestBody PersonalInfo personalIn) {
		return personalInfoRepo.save(personalIn);
	}	
	
	@GetMapping("/get")
	public List<PersonalInfo>info(){
		return personalInfoRepo.findAll();
		
	}

	
}
