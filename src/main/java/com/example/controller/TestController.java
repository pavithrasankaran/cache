package com.example.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Test;
import com.example.repositary.TestRepo;

@RestController
@RequestMapping(value = "/test")
public class TestController {

	@Autowired
	TestRepo testRepo;
	
	//cache testing

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Test> getById(@PathVariable Integer id) {

		return testRepo.findById(id);

	}

	@PostMapping("/save")
	public Test save(@RequestBody Test test) {
		return testRepo.save(test);

	}

}
