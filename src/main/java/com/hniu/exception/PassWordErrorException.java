package com.hniu.exception;

import org.apache.shiro.authc.AuthenticationException;

public class PassWordErrorException extends Exception {


	public PassWordErrorException() {
		super();
	}

	public PassWordErrorException(String string) {
		super(string);
	}
}
