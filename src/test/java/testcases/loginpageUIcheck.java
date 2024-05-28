package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class loginpageUIcheck extends Parenttc {
	
  @Test
  public void loginpageuivalidation() {
	  
	  boolean result = obj_Login.loginpage_uicheck(guru99wd);
	  Assert.assertTrue(result);
  }
}
