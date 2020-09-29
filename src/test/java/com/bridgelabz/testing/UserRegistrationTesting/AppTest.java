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
}
