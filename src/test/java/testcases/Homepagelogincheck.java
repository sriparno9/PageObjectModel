package testcases;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Home_page;

public class Homepagelogincheck extends Parenttc {
	
	Home_page obj_Home_page;
  @Test
  public void homepagetitlrvalid() {
	  
	  obj_Home_page = obj_Login.loginpagefunc(guru99wd);
	  
	  try {
          Alert alert = guru99wd.switchTo().alert();
          alert.dismiss();
      } catch (Exception e) {
          // If no alert is present, continue with the test
      }
	  boolean results = obj_Home_page.homepagetitilecheck(guru99wd);
	  Assert.assertTrue(results);
  }
}
