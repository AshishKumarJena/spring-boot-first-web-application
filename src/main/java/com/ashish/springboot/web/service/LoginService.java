package com.ashish.springboot.web.service;

import org.springframework.stereotype.Component;

//Spring Bean
@Component
public class LoginService {

	public boolean validateUser(String userid, String password) {
		// hello, world
		return userid.equalsIgnoreCase("in28Minutes") 
				&& password.equalsIgnoreCase("world");
	}

}
