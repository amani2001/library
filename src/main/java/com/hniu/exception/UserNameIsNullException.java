package com.hniu.exception;

import org.apache.shiro.authc.AuthenticationException;

public class UserNameIsNullException extends AuthenticationException {

	private static final long serialVersionUID = -1956304655105515993L;

	public UserNameIsNullException() {
		super();
	}

	public UserNameIsNullException(String string) {
		super(string);
	}

}
