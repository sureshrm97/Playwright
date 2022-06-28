package Playwright;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BrowserContextConcept {
	
	public static void main(String[] args) {
		
		Playwright playwright=Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		BrowserContext bxct1=browser.newContext(new Browser.NewContextOptions().
				setRecordVideoDir(Paths.get("myvideos/")).setRecordVideoSize(640, 480));
		Page page1=bxct1.newPage();
		page1.navigate("https://www.orangehrm.com/orangehrm-30-day-trial/?");
		page1.fill("#Form_submitForm_Name", "Suresh Ramavath");
		System.out.println("Title of the page="+page1.title());
		
		BrowserContext bxct2=browser.newContext(new Browser.NewContextOptions().
				setRecordVideoDir(Paths.get("myvideos/")).setRecordVideoSize(640, 480));
		Page page2=bxct2.newPage();
		page2.navigate("https://www.amazon.in/");
		page2.fill("#twotabsearchtextbox", "Macbook");
		System.out.println("Title of the page="+page2.title());
		
		BrowserContext bxct3=browser.newContext(new Browser.NewContextOptions().
				setRecordVideoDir(Paths.get("myvideos/")).setRecordVideoSize(640, 480));
		Page page3=bxct3.newPage();
		page3.navigate("https://www.ebay.com/");
		//page3.fill("#twotabsearchtextbox", "Macbook");
		System.out.println("Title of the page="+page2.title());
		
		page3.close();
		bxct3.close();
		
		page2.close();
		bxct2.close();
		
		page1.close();
		bxct1.close();
		
		
		
		
	}

}
