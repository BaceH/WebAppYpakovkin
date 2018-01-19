package com.ypakovkin.models;

import java.util.List;

/**
 * TODO: comment
 * @author parsentev
 * @since 17.04.2015
 */
public class User {
	private String login;
	private String email;


	public User() {
	}

	public User(final String login, final String email) {
		this.login = login;
		this.email = email;
	}


	public String getLogin() {
		return this.login;
	}

	public String getEmail() {
		return this.email;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
