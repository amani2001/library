package com.hniu.exception;

import org.apache.shiro.authc.AuthenticationException;

public class PassWordIsNullException extends AuthenticationException {

	private static final long serialVersionUID = -5679560506294835718L;

	public PassWordIsNullException() {
		super();
	}

	public PassWordIsNullException(String string) {
		super(string);
	}
}
