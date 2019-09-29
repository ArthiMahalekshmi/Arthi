package Seleniumgluecode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class test {
	
	WebDriver driver;
	
@Given("^user is on homepage$")
public void user_is_on_homepage() throws Throwable {     
	System.setProperty("webdriver.chrome.driver","E:/CD/chromedriver.exe");
   driver = new ChromeDriver();
   driver.get("http://newtours.demoaut.com/ ");   
}

@When("^user enters username and Password$")

public void user_enters_username_and_Password() throws Throwable {
WebElement username = driver.findElement(By.name("userName"));
username.sendKeys("ARTHI");

}
	





