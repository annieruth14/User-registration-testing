package com.bridgelabz.testing.UserRegistrationTesting;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class EmailValidationTest {
	private String email;
	private String expectedResult;
	private UserRegistration userReg;
	
	public EmailValidationTest(String email, String expectedResult) {
		this.email = email;
		this.expectedResult = expectedResult;
	}
	@Before
	public void initialize() {
		userReg = new UserRegistration();
	}
	@Parameterized.Parameters
	public static Collection input() {
		//called implicitly by the compiler
		//System.out.println("first");
		return Arrays.asList(new Object[][] { {"abc@yahoo.com", "true"}, 
			{"abc-100@yahoo.com", "true"},	{"abc.100@yahoo.com", "true"},	{"abc111@abc.com", "true"},
			{"abc-100@abc.net", "true"},		{"abc.100@abc.com", "true"},		{"abc@1.com", "true"},
			{"abc@gmail.com.com" , "false"},	{"abc+100@gmail.com", "true"},	{"abc", "false"},
			{"abc@.com.my", "false"},			{"abc123@gmail.a", "false"},		{"abc123@.com", "false"},
			{"abc123@.com.com", "false"},		{".abc@abc.com", "false"},		{"abc()*@gmail.com", "false"},
			{"abc@%*.com", "false"},			{"abc..2002@gmail.com", "false"},	{"abc.@gmail.com", "false"},
			{"abc@abc@gmail.com", "false"},	{"abc@gmail.com.1a", "false"},		{"abc@gmail.com.aa.au", "false"}}	);
	}
	
	@Test
	public void testEmail() throws UserRegException {
		boolean result = false;
		try {
			result = userReg.check_email(email);
		}
		catch (UserRegException e){
			Assert.assertEquals(UserRegException.ExceptionType.INVALID_EMAIL, e.exceptionType);
		}
	}
	
}
