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
}
