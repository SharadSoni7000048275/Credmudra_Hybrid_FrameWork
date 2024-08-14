package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
    public WebDriver driver;
    public LoginPage loginpage;
    

    public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}
    
    public LoginPage getLoginPage() {
    	loginpage =new LoginPage(driver);
		return loginpage;
    	
    }

}
