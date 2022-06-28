package Playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HandlingFrames {

	public static void main(String[] args) {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

		Page page = browser.newPage();
		page.navigate("http://www.londonfreelance.org/courses/frames/index.html");

		// String
		// frame=page.frameLocator("frame[name='main']").locator("h2").textContent();
		// System.err.println(frame);

		//String frames = page.frame("main").locator("h2").textContent();
		//System.out.println(frames);
		
	}

}
