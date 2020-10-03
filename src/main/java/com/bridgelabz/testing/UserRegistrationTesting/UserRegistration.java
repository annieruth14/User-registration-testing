package com.bridgelabz.testing.UserRegistrationTesting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface LambdaFunc {
	boolean message(String value);
}

public class UserRegistration {
	public void welcome() {
		System.out.println("Welcome to User Registration");
	}

	LambdaFunc check_firstName = (fName) -> {
		try {
			String pattern = "^[A-Z][a-z]{2,}$";
			Pattern r = Pattern.compile(pattern);
			Matcher m = r.matcher(fName);
			if (m.find())
			 	return true;
			else
				throw new UserRegException(UserRegException.ExceptionType.INVALID_NAME, "Name is not valid");
		}
		catch(UserRegException e) {
		    
		}
		return false;
	};
	
	
	
	LambdaFunc check_lastName = (lName) -> {
		try {
			String pattern = "^[A-Z][a-z]{2,}$";
			Pattern r = Pattern.compile(pattern);
			Matcher m = r.matcher(lName);
			if (m.find())
			  	return true;
			else 
				throw new UserRegException(UserRegException.ExceptionType.INVALID_NAME, "Name is not valid");
		}
		catch(UserRegException e) {
			
		}
		return false;
	};


	LambdaFunc check_email = email ->{
		try {
			String pattern = "^[A-Za-z0-9]+([_+-.]?[A-Za-z0-9]+)*@[A-Za-z0-9]+.[A-Za-z]{2,4}(.[A-Za-z]{2,3})?$";
			Pattern r = Pattern.compile(pattern);
			Matcher m = r.matcher(email);
			if (m.find())
			  	return true;
			else 
				throw new UserRegException(UserRegException.ExceptionType.INVALID_EMAIL, "Email id is not valid");

		}
		catch(UserRegException e) {
			
		}
		return false; 
	};


	LambdaFunc check_phoneNumber = (phone) -> {
		try {
			String pattern = "^[0-9]{1,3}[ ][0-9]{10}?$";
			Pattern r = Pattern.compile(pattern);
			Matcher m = r.matcher(phone);
			if (m.find())
			  	return true;
			else 
				throw new UserRegException(UserRegException.ExceptionType.INVALID_PHONE_NO, "Phone number is not valid");
		}
		catch(UserRegException e) {
			
		}
		return false;
	};


	LambdaFunc check_Password = password -> {
		try {
			String pattern = "^(?=.*?[0-9])(?=.*?[A-Z])[0-9a-zA-Z]*[@#$%][0-9a-zA-Z]*${8,}";
			Pattern r = Pattern.compile(pattern);
			Matcher m = r.matcher(password);
			if (m.find())
			  	return true;
			else 
				throw new UserRegException(UserRegException.ExceptionType.INVALID_PASSWORD, "Phone number is not valid");
		}
		catch(UserRegException e) {
			
		}
		return false;
	};
}
