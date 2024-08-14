package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By Enter_Number=By.name("contactNo");
	By Login_Button=By.cssSelector("button[type='submit']");
	By OTP_No=By.cssSelector("input[placeholder='-'][aria-label='Please enter OTP character 1']");
	By Verify_button=By.cssSelector("button[type='submit']");
	
	public void Enter_phone_number(String phoneNo) {
		driver.findElement(Enter_Number).sendKeys(phoneNo);
		
	}
	public void Click_on_LoginButton() {	
		driver.findElement(Login_Button).click(); 
		
	}

	public void OTP_Verify(String OTP) {
		driver.findElement(OTP_No).sendKeys(OTP);
        
	}
	public void Click_on_VerifyButton() {
		
        driver.findElement(Verify_button).click();
	}

}
