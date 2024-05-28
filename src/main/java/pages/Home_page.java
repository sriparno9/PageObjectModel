package pages;

import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.guru99utils;

public class Home_page {
	
	@FindBy(linkText   ="Manager")
	WebElement mgr;
	
	@FindBy(linkText = "New Customer")
	WebElement newcust;
	
public boolean homepagetitilecheck(WebDriver driver) {
		
		String exptitle = "Guru99 Bank Manager HomePage";
		boolean results = guru99utils.validatetitle(driver, exptitle);
		return results;		
	}

public boolean homepageuicheck(WebDriver driver) {
		
	boolean results = true;
	
	ArrayList <WebElement> list = new ArrayList();
	list.add(mgr);
	list.add(newcust);
	
	for (int i=0; i<list.size(); i++) {
		guru99utils.validateui(driver, list.get(i), 15);
	}
	return results;
	
}

}
