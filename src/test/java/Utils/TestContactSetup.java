package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;

public class TestContactSetup {
	public WebDriver driver;
	public TestBase testBase;
	public PageObjectManager pageobjectmanager;

	
	public TestContactSetup() throws IOException
	{
		testBase = new TestBase();
		pageobjectmanager = new PageObjectManager(testBase.WebDriverManager());
		
		
		
		

	}
}
