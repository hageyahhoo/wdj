package com.thehiro.wdj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Check the weather via Yahoo!.
 * 
 * @author Hiroyuki Ito
 */
public class WeatherChecker {

	/**
	 * Check the weekly weather information of Tokyo.
	 * 
	 * @param args Nothing special.
	 */
	public static void main(String[] args) {
		// TODO JUnit の dependency を pom.xml に追加する。

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.yahoo.co.jp");

		driver.findElement(By.className("cbysC13")).click();
		driver.findElement(By.linkText("東京")).click();
		// TODO ここから先は CSS Selector の出番
	}
}
