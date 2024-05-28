package utility;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class guru99utils {
	//title validation
	public static boolean validatetitle(WebDriver driver, String exptitile) {
		
		boolean result = false;
		
		String actualtitle = driver.getTitle();
		result = exptitile.equals(actualtitle);
		return result;
	}	
	//UI VALIDATTION	
	public static boolean validateui(WebDriver driver, WebElement element, int time) {
		
		boolean result = true;
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) 
		{
			result = false;
			e.printStackTrace();
		}		
		return result = false;				
	}
}
