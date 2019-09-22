package eraildemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eraildemoname {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");

		//Find from train
		WebElement Trainfrom = driver.findElement(By.id("txtStationFrom"));
		Trainfrom.clear();
		Trainfrom.sendKeys("MAS");
		Trainfrom.sendKeys(Keys.TAB);
		
		//Find To train
		WebElement Trainto = driver.findElement(By.id("txtStationTo"));
		Trainto.clear();
		Trainto.sendKeys("COIM");
		Trainto.sendKeys(Keys.TAB);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		
		List<WebElement> listoftrian = new ArrayList<WebElement>();
		listoftrian = driver.findElements(By.xpath("//*[@id=\"divTrainsList\"]/table[1]/tbody/tr"));
		int Nooftrians = listoftrian.size();
		System.out.println("Nooftrains: " + Nooftrians);
		
		for(int i =1; i<=Nooftrians; i++)
		{
			try {
				WebElement Trainname = driver.findElement(By.xpath("//*[@id=\"divTrainsList\"]/table[1]/tbody/tr[" + i + "]/td[2]/a"));
				String Trainnamelist = Trainname.getText();
				System.out.println("List of train from Mas to Cmb: " + Trainnamelist);
			//Exception class - error handling method
			}catch (Exception a)
			{
				a.printStackTrace();
				System.out.println(a.toString());
				System.out.println(a.getMessage());
				continue;
			}
		}
		
	}

}
