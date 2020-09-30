package com.bridgelabz.testing.UserRegistrationTesting;

public class UserRegException extends Exception{
	enum ExceptionType{
		INVALID_NAME, INVALID_PHONE_NO, INVALID_PASSWORD, INVALID_EMAIL
	}
	
	ExceptionType exceptionType;
	
	public UserRegException(ExceptionType exceptionType, String message) {
		super(message);
		this.exceptionType = exceptionType;
	}
}
