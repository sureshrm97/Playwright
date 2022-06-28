package Playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class MaximizeBrowser {
	
	public static void main(String[] args) {
		
		
		Playwright playwright=Playwright.create();
		Browser browser=playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		BrowserContext bxct=browser.newContext(new Browser.NewContextOptions().setViewportSize(1300, 600));
		
		Page page=bxct.newPage();
		page.navigate("https://www.amazon.in/");
		
		
	}

}
