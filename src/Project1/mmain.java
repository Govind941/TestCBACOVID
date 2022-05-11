package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class mmain {
	 //static WebDriver driver = new ChromeDriver();
	 //System.setProperty("webdriver.chrome.driver","/Users/crc/Chrome/chromedriver");
	
	protected static void clickFn(String elem,WebDriver driver) {
		 WebElement  bus =  driver.findElement(By.id(elem));
		 bus.click();
	
	 }

//	 protected static void battleStart() {
//		 WebDriver driver = new ChromeDriver();
//		 System.setProperty("webdriver.chrome.driver","/Users/crc/Chrome/chromedriver");
//		 WebElement  start =  driver.findElement(By.id("start"));
//		 start.click();
//	
//	 }
//	 protected static void battleCotinue() {
//		 WebDriver driver = new ChromeDriver();
//		 System.setProperty("webdriver.chrome.driver","/Users/crc/Chrome/chromedriver");
//		 WebElement  cnt =  driver.findElement(By.id("continue"));
//		 cnt.click();
//	
//	 }
//	 protected static void cover() {
//		 WebDriver driver = new ChromeDriver();
//		 System.setProperty("webdriver.chrome.driver","/Users/crc/Chrome/chromedriver");
//		 WebElement  cvr =  driver.findElement(By.id("answer_1"));
//		 cvr.click();
//	
//	 }
//	 protected static void managemet() {
//		 WebDriver driver = new ChromeDriver();
//		 System.setProperty("webdriver.chrome.driver","/Users/crc/Chrome/chromedriver");
//		 WebElement  mgnt =  driver.findElement(By.id("answer_2"));
//		 mgnt.click();
//	
//	 }
//	 protected static void logic() {
//		 WebDriver driver = new ChromeDriver();
//		 System.setProperty("webdriver.chrome.driver","/Users/crc/Chrome/chromedriver");
//		 WebElement  lg =  driver.findElement(By.id("answer_2"));
//		 lg.click();
//	
//	 }
//	 
//	 protected static void busTimer() {
//		 WebDriver driver = new ChromeDriver();
//		 System.setProperty("webdriver.chrome.driver","/Users/crc/Chrome/chromedriver");
//		 WebElement  busTimer =  driver.findElement(By.id("bus_timer_start"));
//		 busTimer.click();
//	
//	 }
//	 protected static void busAnswer() {
//		 WebDriver driver = new ChromeDriver();
//		 System.setProperty("webdriver.chrome.driver","/Users/crc/Chrome/chromedriver");
//		 WebElement  busAnswer =  driver.findElement(By.id("bus_answer_1"));
//		 busAnswer.click();
//	
//	 }
//	 protected static void busNextBattle() {
//		 WebDriver driver = new ChromeDriver();
//		 System.setProperty("webdriver.chrome.driver","/Users/crc/Chrome/chromedriver");
//		 WebElement  busclose =  driver.findElement(By.id("close_correct_modal_btn"));
//		 busclose.click();
//	
//	 }
//	 protected static void start() {
//		 WebDriver driver = new ChromeDriver();
//		 System.setProperty("webdriver.chrome.driver","/Users/crc/Chrome/chromedriver");
//		 WebElement  rt =  driver.findElement(By.id("restaurant_timer_start"));
//		 rt.click();
//	
//	 }
//	 protected static void restaurant1() {
//		 WebDriver driver = new ChromeDriver();
//		 System.setProperty("webdriver.chrome.driver","/Users/crc/Chrome/chromedriver");
//		 WebElement  st =  driver.findElement(By.id("restaurant_answer_1"));
//		 st.click();
//	
//	 }
//	 protected static void wfh() {
//		 WebDriver driver = new ChromeDriver();
//		 System.setProperty("webdriver.chrome.driver","/Users/crc/Chrome/chromedriver");
//		 WebElement  start =  driver.findElement(By.id("start"));
//		 start.click();
//	
//	 }
//	 protected static void wfha() {
//		 WebDriver driver = new ChromeDriver();
//		 System.setProperty("webdriver.chrome.driver","/Users/crc/Chrome/chromedriver");
//		 WebElement  ma =  driver.findElement(By.id("office_answer_2"));
//		 ma.click();
//	
//	 }
//	 protected static void ldboard() {
//		 WebDriver driver = new ChromeDriver();
//		 System.setProperty("webdriver.chrome.driver","/Users/crc/Chrome/chromedriver");
//		 WebElement  ld =  driver.findElement(By.linkText("Go to the leaderboard and check your score."));
//		 ld.click();
//	 }
//	 protected static void webframe() {
//		 WebDriver driver = new ChromeDriver();
//		 System.setProperty("webdriver.chrome.driver","/Users/crc/Chrome/chromedriver");
//		 WebElement  ld =  driver.findElement(By.id("restaurant"));
//		 ld.click();
//	 }
	 
}
