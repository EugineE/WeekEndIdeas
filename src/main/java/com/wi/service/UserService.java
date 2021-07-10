//$Id$
package com.wi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wi.entity.User;
import com.wi.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public void save(User user) {
		user.setName("jhj");
		repository.save(user);
	}

}
