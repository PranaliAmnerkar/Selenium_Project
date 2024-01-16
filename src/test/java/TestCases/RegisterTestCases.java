package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.resources.BaseClass;
import com.resources.Constant;
import com.resources.commonMethod;

import pageobjectModel.HomePageObject;
import pageobjectModel.RegistrationPageObject;

public class RegisterTestCases extends BaseClass {
	

	public static String randomEmail="";
	
	@Test
	public void verifyRegistration() throws IOException, InterruptedException{
       
       HomePageObject hop=new HomePageObject(driver);
       
		commonMethod.putExplicitWait(driver, 10, hop.clickonMyAccount());

       hop.clickonMyAccount().click();
       
       hop.clickonRegister().click();
       
       RegistrationPageObject rop = new RegistrationPageObject(driver);
	    rop.enterfirstname().clear();
	    rop.enterfirstname().sendKeys("");
	   
	    rop.enterlastname().clear();
        rop.enterlastname().sendKeys("");
	   
        rop.enteremail().clear();
        rop.enteremail().sendKeys("");
    	rop.enterTelephone().sendKeys("");
    	
    	rop.enterPassword().sendKeys("");
    	
    	rop.enterConfirmPassword().sendKeys("");
    	
    	rop.ClickOnsubscribe().click();
    	
    	rop.AcceptPrivacyPolicy().click();
    	
    	rop.ClickOnContinueButton().click();

		commonMethod.handleAssertions(rop.CaptureFirstNameErrorMsg().getText(), Constant.FirstNameErrorMsg);

		commonMethod.handleAssertions(rop.CaptureLastNameErrorMsg().getText(), Constant.LastNameErrorMsg);


	}
	
	public String generateRandomEmail() {
		return System.currentTimeMillis()+"@gmail.com";
	}
@Test

public void verifyregistrationwithvaliddata() throws IOException, InterruptedException{
Thread.sleep(2000);
randomEmail=generateRandomEmail();
	RegistrationPageObject rop = new RegistrationPageObject(driver);
   
	commonMethod.putExplicitWait(driver, 10, rop.enterfirstname());

    rop.enterfirstname().clear();

    rop.enterfirstname().sendKeys(Constant.firstname);
    rop.enterlastname().clear();

	rop.enterlastname().sendKeys(Constant.lastname);
    rop.enteremail().clear();

//	rop.enteremail().sendKeys("rani123@gmail.com");
    
	rop.enteremail().sendKeys(generateRandomEmail());
	
	rop.enterTelephone().sendKeys(Constant.Telephone);
	
	rop.enterPassword().sendKeys(Constant.Password);
	
	rop.enterConfirmPassword().sendKeys(Constant.ConfirmPassword);
	
	rop.ClickOnsubscribe().click();
	
	rop.ClickOnContinueButton().click();

	commonMethod.handleAssertions(driver.getCurrentUrl(), Constant.successURL);

	
}
}