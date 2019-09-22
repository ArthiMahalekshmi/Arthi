package eraildemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framedemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
	//	driver.switchTo().frame(0);
	//	WebElement inputtag = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
	//	inputtag.sendKeys("Saanvika");
	
	//	driver.switchTo().defaultContent();
		
		WebElement withinframe = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a"));
		withinframe.click();
		WebElement Parentpath = driver.findElement(By.xpath("//*[@id=\'Multiple\']/iframe"));
		driver.switchTo().frame(Parentpath);
		WebElement childpath = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(childpath);
		WebElement inputtag1 = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		inputtag1.sendKeys("Suriyasakthi");
	}

}
