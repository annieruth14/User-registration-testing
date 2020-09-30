package com.bridgelabz.testing.UserRegistrationTesting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public void welcome() {
		System.out.println("Welcome to User Registration");
	}


	public boolean check_firstName(String value) throws UserRegException {
		String pattern = "^[A-Z][a-z]{2,}$";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(value);
		if (m.find())
		 	return true;
		else 
		    throw new UserRegException(UserRegException.ExceptionType.INVALID_NAME, "Name is not valid");
	}
	
	
	public boolean check_lastName(String message) throws UserRegException  {
		String pattern = "^[A-Z][a-z]{2,}$";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(message);
		if (m.find())
		  	return true;
		else 
			throw new UserRegException(UserRegException.ExceptionType.INVALID_NAME, "Name is not valid");
	}


	public boolean check_email(String message) throws UserRegException {
		String pattern = "^[A-Za-z0-9]+([_+-.]?[A-Za-z0-9]+)*@[A-Za-z0-9]+.[A-Za-z]{2,4}(.[A-Za-z]{2})?$";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(message);
		if (m.find())
		  	return true;
		else 
			throw new UserRegException(UserRegException.ExceptionType.INVALID_EMAIL, "Email id is not valid");
	}


	public boolean check_phoneNumber(String phone) throws UserRegException {
		String pattern = "^[0-9]{1,3}[ ][0-9]{10}?$";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(phone);
		if (m.find())
		  	return true;
		else 
			throw new UserRegException(UserRegException.ExceptionType.INVALID_PHONE_NO, "Phone number is not valid");
	}


	public boolean check_Password(String password) throws  UserRegException {
		String pattern = "^(?=.*?[0-9])(?=.*?[A-Z])[0-9a-zA-Z]*[@#$%][0-9a-zA-Z]*${8,}";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(password);
		if (m.find())
		  	return true;
		else 
			throw new UserRegException(UserRegException.ExceptionType.INVALID_PASSWORD, "Phone number is not valid");
	}
}
