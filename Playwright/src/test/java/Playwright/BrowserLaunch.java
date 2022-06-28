package Playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BrowserLaunch {
	
	
	public static void main(String[] args) {
		
		Playwright playwright =Playwright.create();
		Browser browser=playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		Page page=browser.newPage();
		page.navigate("https://www.amazon.in/");
		page.click("//a[normalize-space()='Electronics']");
		
	}

}
