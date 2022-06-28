package com.ashish.springboot.web.service;

import org.springframework.stereotype.Component;

//Spring Bean
@Component
public class LoginService {

	public boolean validateUser(String userid, String password) {
		// hello, world
		return userid.equalsIgnoreCase("hello") 
				&& password.equalsIgnoreCase("world");
	}

}
