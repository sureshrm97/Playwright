package Playwright;

import com.microsoft.playwright.Playwright;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Browser.NewContextOptions;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;

public class RecordingVideo {
	
	public static void main(String[] args) {
		
		Playwright playwright=Playwright.create();
		Browser browser=playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		BrowserContext bxct=browser.
				newContext(new Browser.NewContextOptions().
						setRecordVideoDir(Paths.get("myvideos/")).setRecordVideoSize(640, 480));
		
		Page page=bxct.newPage();
		
		page.navigate("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		page.fill("//input[@id='txtUsername']", "Admin");
		page.fill("//input[@id='txtPassword']", "admin123");
		page.click("//input[@id='btnLogin']");
		
		page.click("//b[normalize-space()='Maintenance']");
		
		browser.close();
		page.close();
		playwright.close();
		
		
		
	}

}
