package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.resources.BaseClass;

import pageobjectModel.HomePageObject;
import pageobjectModel.LoginPageObject;

public class LoginTstCases extends BaseClass {
	@Test
	public void verifyLogin() throws IOException, InterruptedException {
		Thread.sleep(2000);
		
		HomePageObject hop=new HomePageObject(driver);
		hop.clickonMyAccount().click();
		hop.clickonMyLogin().click();
		
		
		LoginPageObject lop = new LoginPageObject(driver);
        lop.enteremailAddress().sendKeys(RegisterTestCases.randomEmail);
		lop.enterpassword().sendKeys("pranali");
		lop.clickonLogin().click();

	}
}
