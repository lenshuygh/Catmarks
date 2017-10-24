package com.lens.springio.self.catmarks;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/{userId}/cats")
public class CatRestController {
	private final CatRepository catRepository;
	
	private final UserRepository userRepository;
	
	@Autowired
	public CatRestController(CatRepository catRepository,UserRepository userRepository){
		this.catRepository = catRepository;
		this.userRepository = userRepository;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	Collection<Cat> readCats (@PathVariable String userId){
		return this.catRepository.findByUserUserName(userId);
	}
}
