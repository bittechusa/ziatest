package com.bit.test;

import org.junit.Test;
import org.openqa.selenium.By;

public class SmokeTest extends BaseTest
{
	
	@Test
	public void womenlink()
	{
		dr.findElement(By.xpath("//li[@id='main-nav-woman']/a")).click();
		dr.findElement(By.xpath("//div[@id='departmentLeftNaviContainer']/div[1]/ul/li[1]/a/strong")).click();
		
	}    
	
	

}
