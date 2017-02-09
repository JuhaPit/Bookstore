package com.pitkanen.service;

import org.springframework.data.repository.CrudRepository;

import com.pitkanen.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
}
