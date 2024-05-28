package pages;

import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.guru99utils;

public class Login {
	
	WebDriver driver;
	
	@FindBy(name ="uid")
	WebElement user_id;
	
	@FindBy(name ="password")
	WebElement password;
	
	@FindBy(name ="btnLogin")
	WebElement btnlogin;
	
	@FindBy(name ="btnReset")
	WebElement btnreset;
	
	public Login(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean loginpage_titlcheck(WebDriver driver) {
		
		String exptitle = "Guru99 Bank Home Page";
		boolean results = guru99utils.validatetitle(driver, exptitle);
		return results;
		
	}
	
     public boolean loginpage_uicheck(WebDriver driver) {
		
		boolean results = true;
		
		ArrayList <WebElement> list = new ArrayList();
		list.add(user_id);
		list.add(password);
		list.add(btnlogin);
		list.add(btnreset);
		
		for (int i=0; i<list.size(); i++) {
			guru99utils.validateui(driver, list.get(i), 15);
		}
		return results;		
	}
         
 public Home_page loginpagefunc(WebDriver driver) {
    	 
    	 Home_page objHome_page ;
    	 user_id.sendKeys("mngr116890");
    	 password.sendKeys("retunAj");
    	 btnlogin.click();
    	 
    	 objHome_page = PageFactory.initElements(driver, Home_page.class);
    	 
		 return objHome_page;
		
    	 
     }

}