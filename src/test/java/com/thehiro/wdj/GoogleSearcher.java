package com.thehiro.wdj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * PageObject class for Google Search.
 * 
 * @author Hiroyuki Ito
 */
public class GoogleSearcher {

	/**
	 * Search web pages with Google.
	 * 
	 * @param args nothing special.
	 */
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		GoogleSearchPageObject googleSearchPageObject = PageFactory.initElements(driver, GoogleSearchPageObject.class);
		googleSearchPageObject.search("Ninja Slayer");
	}
}
