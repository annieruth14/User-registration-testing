package com.bridgelabz.testing.UserRegistrationTesting;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

public class AppTest 
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
    public void whenStartCapital_shouldReturnTrue() {
    	boolean result = userRegistration.check_firstName("Annie");
    	Assert.assertTrue(result);
    }
    @Test
    public void whenStartNotCapital_shouldReturnFalse() {
    	boolean result = userRegistration.check_firstName("annie");
    	Assert.assertFalse(result);
    }
    @Test
    public void whenMinThreeAlphabets_shouldReturnTrue() {
    	boolean result = userRegistration.check_firstName("Ann");
    	Assert.assertTrue(result);
    }
    @Test
    public void whenLessThanThreeAlphabets_shouldReturnFalse() {
    	boolean result = userRegistration.check_firstName("An");
    	Assert.assertFalse(result);
    }
    @Test
    public void whenStartCapital_shouldReturnTrue1() {
    	boolean result = userRegistration.check_lastName("Minj");
    	Assert.assertEquals(true, result);
    }
    @Test
    public void whenStartNotCapital_shouldReturnFalse1() {
    	boolean result = userRegistration.check_lastName("M");
    	Assert.assertEquals(false, result);
    }
    @Test
    public void givenMessage_whenNoAtTheRate_shouldReturnFalse(){
    	boolean result = userRegistration.check_email("anniegmail.com");
    	Assert.assertFalse(result);
    }
    @Test
    public void givenMessage_whenAtTheRate_shouldReturnTrue(){
    	boolean result = userRegistration.check_email("annie@gmail.com");
    	Assert.assertTrue(result);
    }
    @Test
    public void givenMessage_whenTwoDots_shouldReturnFalse(){
    	boolean result = userRegistration.check_email("annie..minj@gmail.com");
    	Assert.assertFalse(result);
    }
    @Test
    public void whenNoSpace_shouldReturnFalse() {
    	boolean result = userRegistration.check_phoneNumber("919875463958");
    	Assert.assertEquals(false, result);
    }
    @Test
    public void whenGreaterThan10_shouldReturnFalse() {
    	boolean result = userRegistration.check_phoneNumber("91 98754639585");
    	Assert.assertEquals(false, result);
    }
    @Test
    public void when10Digits_shouldReturnTrue() {
    	boolean result = userRegistration.check_phoneNumber("91 9875463958");
    	Assert.assertEquals(true, result);
    }
    @Test
    public void when8Characters_shouldReturnTrue() {
    	boolean result = userRegistration.check_Password("annierut");
    	Assert.assertEquals(true, result);
    }
    @Test
    public void whenLessThan8Characters_shouldReturnTrue() {
    	boolean result = userRegistration.check_Password("annie");
    	Assert.assertEquals(false, result);
    }
    @Test
    public void whenAtleast1UpperCase_shouldReturnTrue() {
    	boolean result = userRegistration.check_Password1("annieRuth");
    	Assert.assertEquals(true, result);
    }
    @Test
    public void whenNoUpperCase_shouldReturnFalse() {
    	boolean result = userRegistration.check_Password1("annieruth");
    	Assert.assertEquals(false, result);
    }
    @Test
    public void whenNoNumeric_shouldReturnFalse() {
    	boolean result = userRegistration.check_Password2("annieRuth");
    	Assert.assertEquals(false, result);
    }
    @Test
    public void whenNumeric_shouldReturnTrue() {
    	boolean result = userRegistration.check_Password2("annieR3uth");
    	Assert.assertEquals(true, result);
    }
    @Test
    public void whenExactlyOneSpecialCharacter_shouldReturnTrue() {
    	boolean result = userRegistration.check_Password3("annieR3uth@");
    	Assert.assertEquals(true, result);
    }
    @Test
    public void whenNoSpecialCharacter_shouldReturnFalse() {
    	boolean result = userRegistration.check_Password3("annieR3uthhh");
    	Assert.assertEquals(false, result);
    }
    @Test
    public void whenMoreThanOneSpecialCharacter_shouldReturnFalse() {
    	boolean result = userRegistration.check_Password3("annieR3uth@#$");
    	Assert.assertEquals(false, result);
    }
}
