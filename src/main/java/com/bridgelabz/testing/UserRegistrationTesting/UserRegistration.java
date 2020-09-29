package com.bridgelabz.testing.UserRegistrationTesting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public void welcome() {
		System.out.println("Welcome to User Registration");
	}


	public boolean check_firstName(String value) {
		String pattern = "^[A-Z][a-z]{2,}$";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(value);
		if (m.find())
		 	return true;
		else 
		    return false;
	}
	
	
	public boolean check_lastName(String message) {
		String pattern = "^[A-Z][a-z]{2,}$";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(message);
		if (m.find())
		  	return true;
		else 
		    return false;
	}


	public boolean check_email(String message) {
		String pattern = "^[A-Za-z0-9]+([_+-.]?[A-Za-z0-9]+)*@[A-Za-z0-9]+.[A-Za-z]{2,4}(.[A-Za-z]{2})?$";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(message);
		if (m.find())
		  	return true;
		else 
		    return false;
	}
}
