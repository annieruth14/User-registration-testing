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
    
}
