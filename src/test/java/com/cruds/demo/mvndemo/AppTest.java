package com.cruds.demo.mvndemo;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
   @Test
   public void testGreeting(){
	   App obj = new App();
	   assertNotNull(obj.getGreeting());
   }
}
