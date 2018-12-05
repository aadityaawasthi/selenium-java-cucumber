package stepdefinaction;

import org.openqa.selenium.WebDriver;


import common.Driver;
import cucumber.api.java.en.Given;
import pages.MercuryHome;

public class CommonSteps {

	@Given("Enter username$")
	public void A_Sales_Promoter_logins_to_Sassy() throws Throwable {
		
			//LoginPage TransactionTest = new LoginPage(null);
			WebDriver driver = Driver.getDriver();
			driver.get("http://newtours.demoaut.com/");
			
		MercuryHome mercuryHome = new MercuryHome(driver);
		mercuryHome.getUserName().sendKeys("mercury");

	}
}
