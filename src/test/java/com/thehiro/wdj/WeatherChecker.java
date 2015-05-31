package com.thehiro.wdj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Check the weather via Yahoo!
 * 
 * @author Hiroyuki Ito
 */
public class WeatherChecker {

	/**
	 * 工事中
	 * 
	 * @param args Nothing special.
	 */
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.yahoo.co.jp");
	}
}
