package Playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class TextSelector {

	public static void main(String[] args) {

		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

		Page page = browser.newPage();
		/*
		 * page.navigate("https://www.orangehrm.com/orangehrm-30-day-trial/?");
		 * //page.locator("text=Contact Sales").click(); 
		 * Locator links=page.locator("text= Privacy Policy"); System.out.println(links.count());
		 * 
		 * for(int i=0;i<links.count();i++) { // it will print all elements
		 * //System.out.println(links.nth(i).textContent()); String
		 * text=links.nth(i).textContent(); if(text.contains("Service Privacy Policy"));
		 * links.nth(i).click(); break; }
		 */

		/*page.navigate("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		String header = page.locator("div.card-body h2:has-text('New Customer')").textContent();
		System.out.println(header);
		
		//String pageheader=page.locator("'Your Store'").first().textContent();
		//String pageheader2=page.locator("text=Your Store").textContent();

		//System.out.println(pageheader);
		//System.out.println(pageheader2);
		page.locator("form button:has-text('submit')").click();*/
		
		page.navigate("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		page.locator("div.divLoginButton input:has-text('btnLogin')").click();
	}

}
