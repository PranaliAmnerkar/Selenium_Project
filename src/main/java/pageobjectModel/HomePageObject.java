package pageobjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObject {

	public WebDriver driver;
	
	private By MyAccount = By.xpath("//i[@class='fa fa-user']");
	
	private By Register = By.xpath("//a[contains(text(),'Register')]");

	private By Login = By.xpath("//a[contains(text(),'Login')]");

	public HomePageObject(WebDriver driver2)
	{
         this.driver=driver2;
}

public WebElement clickonMyAccount() {
	
	return driver.findElement(MyAccount);
}
public WebElement clickonRegister() {
	
	return driver.findElement(Register);
}
public WebElement clickonMyLogin() {
	
	return driver.findElement(Login);
}

}
	

