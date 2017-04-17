package com.cc.cloudrest.service.core;

import com.cc.cloudrest.common.domain.User;

public interface UserService {
	
	abstract User get(String username);
	
	abstract String add(String username,String password);

}
