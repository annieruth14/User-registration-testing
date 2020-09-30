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


	public String check_email(String message) {
		String pattern = "^[A-Za-z0-9]+([_+-.]?[A-Za-z0-9]+)*@[A-Za-z0-9]+.[A-Za-z]{2,4}(.[A-Za-z]{2})?$";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(message);
		if (m.find())
		  	return "true";
		else 
		    return "false";
	}


	public boolean check_phoneNumber(String phone) {
		String pattern = "^[0-9]{1,3}[ ][0-9]{10}?$";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(phone);
		if (m.find())
		  	return true;
		else 
		    return false;
	}


	public boolean check_Password(String password) {
		String pattern = "^.{8,}$";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(password);
		if (m.find())
		  	return true;
		else 
		    return false;
	}


	public boolean check_Password1(String password1) {
		String pattern = "^(?=.*[A-Z]).{8,}";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(password1);
		if (m.find())
		  	return true;
		else 
		    return false;
	}
	
	public boolean check_Password2(String password2) {
		String pattern = "^(?=.*[0-9])(?=.*[A-Z]).{8,}";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(password2);
		if (m.find())
		  	return true;
		else 
		    return false;
	}


	public boolean check_Password3(String password3) {
		String pattern = "^(?=.*?[0-9])(?=.*?[A-Z])[0-9a-zA-Z]*[@#$%][0-9a-zA-Z]*${8,}";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(password3);
		if (m.find())
		  	return true;
		else 
		    return false;
	}
}
