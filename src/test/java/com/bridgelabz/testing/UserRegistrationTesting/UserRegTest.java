package com.bridgelabz.testing.UserRegistrationTesting;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

public class UserRegTest 
{
    UserRegistration userRegistration = null;
   
   
    @Before
    public void initialize() {
    	userRegistration =  new UserRegistration();
    	
    }
    @Test
    public void start() {
    	userRegistration.welcome();
    }
    @Test
    public void givenMessage_whenStartCapital_shouldReturnTrue() {
    	boolean result = false;
    	try {
			result = userRegistration.check_firstName("Annie");
			
		}
    	catch (UserRegException e) {
    		Assert.assertTrue(result);
    	}
    }
    @Test
    public void givenMessage_whenStartNotCapital_shouldReturnFalse() {
    	boolean result = false;
    	try {
    		result = userRegistration.check_firstName("annie");
    	}
    	catch (UserRegException e){
    		Assert.assertEquals(UserRegException.ExceptionType.INVALID_NAME, e.exceptionType);
    	}
    	
    }
    @Test
    public void givenMessage_whenMoreThanThreeAlphabets_shouldReturnTrue() throws UserRegException {
    	boolean result = userRegistration.check_firstName("Ann");
    	Assert.assertTrue(result);
    }
    @Test
    public void givenMessage_whenLessThanThreeAlphabets_shouldReturnFalse(){
    	boolean result = false;
    	try {
    		result = userRegistration.check_firstName("An");
    	}
    	catch (UserRegException e){
    		//System.out.println(e.exceptionType);
    		//System.out.println(UserRegException.ExceptionType.INVALID_NAME);
    		Assert.assertEquals(UserRegException.ExceptionType.INVALID_NAME, e.exceptionType);
    	}
    }
    
    @Test
    public void givenPhone_whenNoSpace_shouldReturnFalse() {
    	boolean result = false;
    	try {
    		result = userRegistration.check_phoneNumber("919875463958");
    	}
    	catch (UserRegException e){
    		Assert.assertEquals(UserRegException.ExceptionType.INVALID_PHONE_NO, e.exceptionType);
    	}
    }
    @Test
    public void givenPhone_whenGreaterThan10_shouldReturnFalse() {
    	boolean result = false;
    	try {
    		result = userRegistration.check_phoneNumber("91 98754639585");
    	}
    	catch (UserRegException e){
    		Assert.assertEquals(UserRegException.ExceptionType.INVALID_PHONE_NO, e.exceptionType);
    	}
    }
    @Test
    public void givenPhone_when10Digits_shouldReturnTrue() throws UserRegException {
    	boolean result = userRegistration.check_phoneNumber("91 9875463958");
    	Assert.assertEquals(true, result);
    }
    
    @Test
    public void givenPassword_whenLessThan8_shouldReturnFalse() {
    	boolean result = false;
    	try {
    		result = userRegistration.check_phoneNumber("91 98754639585");
    	}
    	catch (UserRegException e){
    		Assert.assertEquals(UserRegException.ExceptionType.INVALID_PHONE_NO, e.exceptionType);
    	}
    }
    
    @Test
    public void givenPassword_whenNoUpperCase_shouldReturnFalse() {
    	boolean result = false;
    	try {
    		result = userRegistration.check_Password("anni3#eruth");
    	}
    	catch (UserRegException e){
    		Assert.assertEquals(UserRegException.ExceptionType.INVALID_PASSWORD, e.exceptionType);
    	}
    }
    @Test
    public void givenPassword_whenNoNumeric_shouldReturnFalse() {
    	boolean result = false;
    	try {
    		result = userRegistration.check_Password("annie@Ruth");
    	}
    	catch (UserRegException e){
    		Assert.assertEquals(UserRegException.ExceptionType.INVALID_PASSWORD, e.exceptionType);
    	}
    }
    
    @Test
    public void givenPassword_whenNoSpecialCharacter_shouldReturnFalse() {
    	boolean result = false;
    	try {
    		result = userRegistration.check_Password("annieR3uthhh");
    	}
    	catch (UserRegException e){
    		Assert.assertEquals(UserRegException.ExceptionType.INVALID_PASSWORD, e.exceptionType);
    	}
    	
    }
    @Test
    public void givenPassword_whenMoreThanOneSpecialCharacter_shouldReturnFalse() {
    	boolean result = false;
    	try {
    		result = userRegistration.check_Password("annieR3uth@#$");
    	}
    	catch (UserRegException e){
    		Assert.assertEquals(UserRegException.ExceptionType.INVALID_PASSWORD, e.exceptionType);
    	}
    }
    @Test
    public void givenPassword_whenCorrect_shouldReturnTrue() throws UserRegException {
    	boolean result = userRegistration.check_Password("annieR3uth@");
    	Assert.assertEquals(true, result);
    }
    @Test
    public void givenEmail_whenInvalid_shouldReturnFalse() {
	
		boolean result = false;
		try {
			result = userRegistration.check_email("abcgmail.com");
		}
		catch (UserRegException e){
			Assert.assertEquals(UserRegException.ExceptionType.INVALID_EMAIL, e.exceptionType);
		}
    }
	@Test
    public void givenEmail_whenInvalid_shouldReturnFalse1() {
		
		boolean result = false;
		try {
			result = userRegistration.check_email("abc123@gmail.com.com");
		}
		catch (UserRegException e){
			Assert.assertEquals(UserRegException.ExceptionType.INVALID_EMAIL, e.exceptionType);
		}
	}
	@Test
    public void givenEmail_whenValid_shouldReturnTrue() throws UserRegException {
    	boolean result = userRegistration.check_email("abc_xyz123@gmail.com");
    	Assert.assertEquals(true, result);
    }
    
}
    
