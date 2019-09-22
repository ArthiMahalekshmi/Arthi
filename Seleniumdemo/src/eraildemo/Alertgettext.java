package eraildemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertgettext {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		
		//WebElement alertpromptboxclick = driver.findElement(By.cssSelector("button:contains('Click for Prompt Box')"));
		//WebElement alertpromptboxclick = driver.findElement(By.cssSelector("CSS=.btn btn-default btn-lg:contains('Click for Prompt Box')"));
		//WebElement alertpromptboxclick = driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg'][1]"));
		
		//https://www.softwaretestinghelp.com/css-selector-selenium-locator-selenium-tutorial-6/
		//http://learn-automation.com/write-dynamic-css-selector-in-selenium/
		
		
		WebElement alertpromptboxclick = driver.findElement(By.cssSelector("css=button:contains('Click for Prompt Box')"));
		alertpromptboxclick.click();
		Alert alertpromptbox = driver.switchTo().alert();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		alertpromptbox.accept();

	}

}
