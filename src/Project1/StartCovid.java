package Project1;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartCovid extends mmain {
	
	
	
	protected static void battleFields() {
		
//		//battle();
//		battleStart();
//		battleCotinue();
//	    cover();
//	    battleCotinue();
//	    managemet();
//	    battleCotinue();
//	    logic();
	    
	    
	}
	
protected static void takeTheBus(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	List<String> elements = Arrays.asList("bus", "bus_timer_start", "bus_answer_1","close_correct_modal_btn","restaurant_timer_start","restaurant_answer_1","close_correct_modal_btn","start","office_answer_2","close_modal_btn_1","bus_timer_start","bus_answer_1","leaderboard_link");
	for(int i=0; i<elements.size();i++) {
		clickFn(elements.get(i),driver);
	}
	
	/*
	    bus(driver);
		busTimer();
		busAnswer();
		busNextBattle();
		start();
		restaurant1();
		busNextBattle();
		wfh();
		wfha();
		
		*/
	    
	}
	

}
