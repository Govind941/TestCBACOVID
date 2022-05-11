package Project1;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CbaCovid extends StartCovid {
	
	 
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","/Users/crc/Chrome/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://responsivefight.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement reg =  driver.findElement(By.id("rego"));
		WebElement userName =  driver.findElement(By.id("uname"));
		WebElement pass =  driver.findElement(By.id("pwd"));
		WebElement rePass =  driver.findElement(By.id("psw-repeat"));
		WebElement sigup =  driver.findElement(By.id("signupbtn"));
		//WebElement start = driver.findElement(By.id("Start your journey cba2"));
		reg.click();
		Random rand = new Random();
		userName.sendKeys("cbatea"+rand.nextInt(20));
		pass.sendKeys("Password0!");	
		rePass.sendKeys("Password0!");
		sigup.click();
		WebElement uname =  driver.findElement(By.id("worrior_username"));
		WebElement Pwd =  driver.findElement(By.id("worrior_pwd"));
		WebElement LoginWarrior =  driver.findElement(By.id("warrior"));
   
		Pwd.sendKeys("Password0!");
		LoginWarrior.click();
		WebElement start = driver.findElement(By.xpath("//*[@id=\"start\"]"));
		start.click();
		takeTheBus(driver);
		driver.quit();
	

	}
	
	
}