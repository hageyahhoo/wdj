package com.thehiro.wdj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * PageObject class for Google Search.
 * 
 * @author Hiroyuki Ito
 */
public class GoogleSearchPageObject {

	private WebDriver driver;

	@FindBy(how=How.ID, using="lst-ib")
	private WebElement keyword;

	@FindBy(how=How.NAME, using="btnK")
	private WebElement search;


	public GoogleSearchPageObject(WebDriver driver) {
		this.driver = driver;
		this.driver.get("http://www.google.com");
	}

	/**
	 * Search with Google.
	 * 
	 * @param keyword keyword to search
	 */
	public void search(String keywordToSearch) {
		keyword.sendKeys(keywordToSearch);
		search.click();
	}
}
