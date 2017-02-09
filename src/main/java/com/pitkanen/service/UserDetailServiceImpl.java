package com.pitkanen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.pitkanen.domain.User;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
	private final UserRepository repository;
	@Autowired
	public UserDetailServiceImpl(UserRepository userRepository){
		this.repository = userRepository;
	}
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		User currUser = repository.findByUsername(username);
		UserDetails user = new org.springframework.security.core.userdetails.User(username, currUser.getPasswordHash(),
				AuthorityUtils.createAuthorityList(currUser.getRole()));
		return user;
	}

}
