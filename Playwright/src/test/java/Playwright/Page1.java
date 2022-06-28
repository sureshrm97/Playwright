package Playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Page1 {

	public static void main(String[] args) {

		Playwright playwright = Playwright.create();
		Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));

		Page page =browser.newPage();
		page.navigate("http://automationpractice.com/index.php");
		
		page.click("text=Sign in");
		
	}

}
