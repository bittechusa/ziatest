package com.bit.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	FirefoxDriver dr=new FirefoxDriver();
	
	@Before
	public void start()
	{
		dr.get("http://www.bluefly.com");
		
	}
	@After
	public void end()
	{
		dr.quit();
	}

}
