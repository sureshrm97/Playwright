package Playwright;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LocatorConcept {
	
	public static void main(String[] args) {
		
		Playwright playwright=Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		BrowserContext brxt=browser.newContext();
		Page page=brxt.newPage();
		
		/*page.navigate("https://www.orangehrm.com/contact-sales/");
		Locator contactsale=page.locator("text=Contact Sales");
		contactsale.hover();
		contactsale.click();*/
		
		/*page.navigate("https://academy.naveenautomationlabs.com/");
		Locator login=page.locator("text=Login");
		int totallogin=login.count();
		System.out.println(totallogin);
		login.first().click();*/
		
		page.navigate("https://www.orangehrm.com/hris-hr-software-demo/");
		Locator countryOptions=page.locator("select#Form_submitForm_Country");
		System.out.println(countryOptions.count());
		
		
		//approcah 1
		/*for(int i=0;i<countryOptions.count();i++) {
			String text=countryOptions.nth(i).textContent();
			System.out.println(text);
		}*/
		
		//approcah 2

		List<String> optionTextList=countryOptions.allTextContents();
		/*for(String e:optionTextList) {
			System.out.println(e);
		}*/
		optionTextList.forEach(ele -> System.out.println(ele));
		
	}

}
