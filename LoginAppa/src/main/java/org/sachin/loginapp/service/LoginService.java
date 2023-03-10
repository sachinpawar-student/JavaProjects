package org.sachin.loginapp.service;

import java.util.HashMap;

import org.sachin.loginapp.dto.User;

public class LoginService {

	HashMap<String, String> users = new HashMap<String, String>();

	public LoginService()

	{
		users.put("1", "sachin");
		users.put("2", "sac");

		users.put("3", "sa");

	}

	public Boolean authenticate(String userId, String passwrod) {

		if (passwrod == null || passwrod.trim() == "") {

			return false;
		}
		return true;

	}

	public User getUsername(String userId) {
		
		User user= new User();
		
		user.setUserName(users.get(userId));
		user.setUserId(userId);
		return user;
		

	}

}
