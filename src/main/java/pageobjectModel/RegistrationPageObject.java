package pageobjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPageObject {

	public WebDriver driver;
	private By firstname=By.xpath("//input[@name='firstname']");
	
	private By lastname=By.xpath("//input[@name='lastname']");

    private By email =By.xpath("//input[@name='email']");
	
    private By Telephone =By.xpath("//input[@name='telephone']");
	
    private By Password =By.xpath("//input[@name='password']");
	
    private By ConfirmPassword =By.xpath("//input[@name='confirm']");
	
    private By subscribe =By.xpath("(//input[@name='newsletter'])[2]");
	
    private By PrivacyPolicy =By.xpath("//input[@name='agree']");
	
    private By ContinueButton =By.xpath("//input[@value='Continue']");
    
    private By FirstNameErrorMsg =By.xpath("(//div[@class='text-danger'])[1]");
    
    private By LastNameErrorMsg =By.xpath("(//div[@class='text-danger'])[2]");
	
public RegistrationPageObject(WebDriver driver2) {
	
	this.driver=driver2;
}

public WebElement enterfirstname() {

	return driver.findElement(firstname);
}
public WebElement enterlastname() {

	return driver.findElement(lastname);
}
public WebElement enteremail() {

	return driver.findElement(email);
}
public WebElement enterTelephone() {

	return driver.findElement(Telephone);
}
public WebElement enterPassword() {

	return driver.findElement(Password);
}
public WebElement enterConfirmPassword() {

	return driver.findElement(ConfirmPassword);
}
public WebElement ClickOnsubscribe() {

	return driver.findElement(subscribe);
}
public WebElement AcceptPrivacyPolicy() {

	return driver.findElement(PrivacyPolicy);
}
public WebElement ClickOnContinueButton() {

	return driver.findElement(ContinueButton);
}
public WebElement CaptureFirstNameErrorMsg() {

	return driver.findElement(FirstNameErrorMsg);
}
public WebElement CaptureLastNameErrorMsg() {

	return driver.findElement(LastNameErrorMsg);
}

}



