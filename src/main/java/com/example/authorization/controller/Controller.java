package com.example.authorization.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.authorization.dto.User;

/**
 * The Class Controller.
 */
@RestController
public class Controller {

	/**
	 * Gets the token.
	 *
	 * @param user the user
	 * @return the token
	 */
	@GetMapping("get-token")
	public User getToken(User user) {
		return new User();
	}

}

