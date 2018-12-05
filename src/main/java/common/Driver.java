package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class Driver {

    protected static WebDriver selenium;

    
    public Driver(WebDriver selenium) {
    	Driver.selenium = selenium;

    }


    public void initialize(Object o) {

        PageFactory.initElements(selenium, o);

    }


    public synchronized static WebDriver getDriver() throws IOException {
    	
    	if (selenium == null) {
    		System.setProperty("webdriver.chrome.driver", "webDriver\\chromedriver.exe");
            selenium = new ChromeDriver();
            selenium.manage().window().maximize();

        }
        return selenium;
    }
}
