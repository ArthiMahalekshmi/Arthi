package eraildemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popups {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		
		//WebElement alertboxclick = driver.findElement(By.cssSelector("button[class='btn btn-default']"));
		//alertboxclick.click();
		//Alert alertbox = driver.switchTo().alert();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//alertbox.accept();
		
		
		//driver.navigate().refresh();
		
		WebElement confirmboxclick = driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']"));
		confirmboxclick.click();
		Alert confirmboxok = driver.switchTo().alert();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		confirmboxok.accept();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.navigate().refresh();
		confirmboxclick.click();
		Alert confirmboxcancel = driver.switchTo().alert();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		confirmboxcancel.dismiss();
		
		
	}

}