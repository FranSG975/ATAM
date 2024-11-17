package com.example.authorization.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * The Class User.
 */
public class User {
	
	private String user;
	private String pwd;
	private String token;
	
	DateTimeFormatter formato = DateTimeFormatter.ofPattern("MMMM dd,yyyy");
	String date = LocalDateTime.now().format(formato);
	

	/**
	 * Gets the user.
	 *
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	

	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	/**
	 * Sets the user.
	 *
	 * @param user the new user
	 */
	public void setUser(String user) {
		this.user = user;
	}


	/**
	 * Gets the pwd.
	 *
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}

	/**
	 * Sets the pwd.
	 *
	 * @param pwd the new pwd
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	/**
	 * Gets the token.
	 *
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * Sets the token.
	 *
	 * @param token the new token
	 */
	public void setToken(String token) {
		this.token = token;
	}

}
