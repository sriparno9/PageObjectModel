package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class loginpagetitlecheck extends Parenttc {
	
  @Test
  public void loginpagetitlevaliation() {
	  
	  boolean result = obj_Login.loginpage_titlcheck(guru99wd);
	  Assert.assertTrue(result);
  }
}
