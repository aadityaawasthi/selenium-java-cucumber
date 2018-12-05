package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/java/resources/*.feature"},
glue={"stepdefinaction"},
format = {"html:target/TestResults/html/cucumber-html-report","json:target/TestResults/json/accountHolder_Secondary.json" }
)
public class Runner extends AbstractTestNGCucumberTests{

}
