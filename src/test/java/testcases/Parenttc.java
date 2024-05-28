package testcases;

import org.testng.annotations.BeforeMethod;
import pages.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class Parenttc {
	
	public WebDriver guru99wd;
	String url ="https://demo.guru99.com/v4/";
	public Login obj_Login;
	
  @BeforeMethod
  public void initest() {
	  
    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
  	guru99wd = new ChromeDriver();
  	guru99wd.manage().window().maximize(); 	
  	guru99wd.get(url);
  	
  	obj_Login = PageFactory.initElements(guru99wd, Login.class);

  }

  @AfterMethod
  public void cleanuptest() {
	  guru99wd.quit();
  }
}
