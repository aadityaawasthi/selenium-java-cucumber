package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common.Driver;

public class MercuryHome extends Driver {

	public MercuryHome(WebDriver selenium) {
		super(selenium);
		initialize(this);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath = "//input[contains( @name,\"userName\")]")
	WebElement userName;

	public WebElement getUserName(){
	       return userName;
	   } 
	
	public void setUserName(){
	       this.userName = userName;
	   } 

//	WebElement userName = selenium.findElement(By.xpath("//input[contains( @name,\"userName\")]"));
//	WebElement password = selenium.findElement(By.xpath("//input[contains(@name,\"password\")]"));

}
