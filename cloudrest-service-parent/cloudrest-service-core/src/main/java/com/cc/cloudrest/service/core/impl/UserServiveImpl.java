package com.cc.cloudrest.service.core.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cc.cloudrest.common.domain.User;
import com.cc.cloudrest.service.core.UserService;
import com.cc.cloudrest.service.repository.UserRepository;

@Service
public class UserServiveImpl implements UserService {
	
	@Resource
	private UserRepository userRepository;

	@Override
	public User get(String username) {
		return userRepository.findByUsername(username);
	}

	@Override
	public String add(String username, String password) {
		return null;
	}

}
