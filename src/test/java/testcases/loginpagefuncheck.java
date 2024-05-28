package testcases;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Home_page;

public class loginpagefuncheck extends Parenttc{
	
	Home_page obj_Home_page;
	
  @Test
  public void loginpagefuncvalidation() {
	  
	  obj_Home_page = obj_Login.loginpagefunc(guru99wd);
	  
	  try {
          Alert alert = guru99wd.switchTo().alert();
          String alertText = alert.getText();
          alert.dismiss();
          System.out.println("Alert dismissed with message: " + alertText);
      } catch (Exception e) {
          // If no alert is present, continue with the test
          System.out.println("No alert present");
      }
	  
	  boolean result =obj_Home_page.homepagetitilecheck(guru99wd);
	  Assert.assertTrue(result);	  
  }
}