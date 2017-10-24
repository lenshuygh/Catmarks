package com.lens.springio.self.catmarks;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CatmarksApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatmarksApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(UserRepository userRepository,CatRepository catRepository){
		return (clr) -> Arrays.asList(
				"lens,gert,dasha,amelie,lotte,kristof".split(","))
				.forEach(
						a -> {
							User user = userRepository.save(new User(a,"password"));
							catRepository.save(new Cat(user,"Kat van "+ user.userName ,5,"Kater","Huiskat"));
						}
						);
	}
}
