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
    	result = userRegistration.check_firstName.message("Annie");
    	Assert.assertTrue(result);	
		
    }
    @Test
    public void givenMessage_whenStartNotCapital_shouldReturnFalse() {
    	boolean result = false;
    	
    	result = userRegistration.check_firstName.message("annie");
    	Assert.assertFalse(result);	
    }
    @Test
    public void givenMessage_whenMoreThanThreeAlphabets_shouldReturnTrue() {
    	boolean result = userRegistration.check_firstName.message("Ann");
    	Assert.assertTrue(result);
    }
    @Test
    public void givenMessage_whenEmpty_shouldReturnFalse() {
    	boolean result = userRegistration.check_firstName.message(" ");
    	Assert.assertFalse(result);
    }
    @Test
    public void givenMessage_whenLessThanThreeAlphabets_shouldReturnFalse() {
    	boolean result = false;
    	result = userRegistration.check_firstName.message("An");
    	System.out.println(UserRegException.ExceptionType.INVALID_NAME);
		Assert.assertFalse(result);
		//Assert.assertEquals("INVALID_NAME" , UserRegException.ExceptionType.INVALID_NAME);
    	
    	//System.out.println(e.exceptionType);
		//System.out.println(e.getMessage());
    	//System.out.println(UserRegException.ExceptionType.INVALID_NAME);
   		//Assert.assertEquals(UserRegException.ExceptionType.INVALID_NAME, e.exceptionType);
    
    }
    
    @Test
    public void givenPhone_whenNoSpace_shouldReturnFalse() {
    	boolean result = userRegistration.check_phoneNumber.message("919875463958");
    	Assert.assertEquals(false, result);
    }
    @Test
    public void givenPhone_whenGreaterThan10_shouldReturnFalse() {
    	boolean result = false;
    	result = userRegistration.check_phoneNumber.message("919875463958");
    	Assert.assertFalse(result);
    }
    @Test
    public void givenPhone_when10Digits_shouldReturnTrue() {
    	boolean result = false;
    	result = userRegistration.check_phoneNumber.message("91 9875463958");
    	Assert.assertTrue(result);
    }
    

    
    @Test
    public void givenPassword_whenLessThan8_shouldReturnFalse() {
    	boolean result = false;
    	result = userRegistration.check_Password.message("An!2k");
    	Assert.assertFalse(result);
    }
    @Test
    public void givenPassword_whenNoUpperCase_shouldReturnFalse(){
    	boolean result = false;
    	result = userRegistration.check_Password.message("anni3#eruth");
    	Assert.assertFalse(result);
    }
    @Test
    public void givenPassword_whenNoNumeric_shouldReturnFalse() {
    	boolean result = false;
    	result = userRegistration.check_Password.message("annie@Ruth");
    	Assert.assertFalse(result);
    }
    @Test
    public void givenPassword_whenNoSpecialCharacter_shouldReturnFalse() {
    	boolean result = false;
    	result = userRegistration.check_Password.message("annieR3uthhh");
    	Assert.assertFalse(result);
    }
   
    @Test
    public void givenPassword_whenMoreThanOneSpecialCharacter_shouldReturnFalse() {
    	boolean result = false;
    	result = userRegistration.check_Password.message("annieR3uth@#$");
    	Assert.assertFalse(result);
    }
    @Test
    public void givenPassword_whenCorrect_shouldReturnTrue() {
    	boolean result = userRegistration.check_Password.message("annieR3uth@");
    	Assert.assertEquals(true, result);
    }
    @Test
    public void givenEmail_whenInvalid_shouldReturnFalse() {
    	boolean result = userRegistration.check_email.message("abcgmail.com");
    	Assert.assertEquals(false, result);
    }
	@Test
    public void givenEmail_whenInvalid_shouldReturnFalse1() {
		boolean result = userRegistration.check_email.message("abc123@gmail.com.c");
		Assert.assertFalse(result);
	}
	@Test
    public void givenEmail_whenValid_shouldReturnTrue() {
    	boolean result = userRegistration.check_email.message("abc_xyz123@gmail.com");
    	Assert.assertEquals(true, result);
    }
    
}
    
