package com.lens.springio.self.catmarks;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepository extends JpaRepository<Cat, Long> {
	Collection<Cat> findByUserUserName(String userName);
}
