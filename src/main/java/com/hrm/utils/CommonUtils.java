package com.hrm.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.hrm.configuration.BaseConfiguration;

/**
 * @author Assassin author Shortcut ( Shift + Alt +J ) Pretty Printer Ctrl +
 *         Shift + F
 * 
 *         We Will Write all the Common ReUseable Methods Like:-- Select
 *         Elements From DropDown , Clicking a Button, Entering the Text in the
 *         TextBox.!!
 *
 */

public class CommonUtils extends BaseConfiguration {

	/**
	 * @author Shiva
	 * @param identifiedBy for type of locator(xpath, css, id, class, name, link)
	 * @param locator      for locator address as per type of locator(xpath, css,
	 *                     id, class, name, link)
	 * 
	 * 
	 *
	 */
	public static void clickButton(String identifiedBy, String locator) {

		if (identifiedBy.equalsIgnoreCase("id")) {
			driver.findElement(By.id(locator)).click();
		} else if (identifiedBy.equalsIgnoreCase("css")) {
			driver.findElement(By.cssSelector(locator)).click();
		} else if (identifiedBy.equalsIgnoreCase("name")) {
			driver.findElement(By.className(locator)).click();
		} else if (identifiedBy.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(locator)).click();
		} else if (identifiedBy.equalsIgnoreCase("link")) {
			driver.findElement(By.linkText(locator)).click();
		} else if (identifiedBy.equalsIgnoreCase("class")) {
			driver.findElement(By.className(locator)).click();
		}
	}

	public static void enterTextinTextBox(String identifiedBy, String locator, String value) {

		if (identifiedBy.equalsIgnoreCase("id")) {
			driver.findElement(By.id(locator)).sendKeys(value);
		} else if (identifiedBy.equalsIgnoreCase("css")) {
			driver.findElement(By.cssSelector(locator)).sendKeys(value);
		} else if (identifiedBy.equalsIgnoreCase("name")) {
			driver.findElement(By.className(locator)).sendKeys(value);
		} else if (identifiedBy.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(locator)).sendKeys(value);
		}
	}

	public void mouseHoverElemet(String identifiedBy, String locator) {

		if (identifiedBy.equalsIgnoreCase("id")) {
			WebElement element = driver.findElement(By.id(locator));
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();

		} else if (identifiedBy.equalsIgnoreCase("css")) {

			WebElement element = driver.findElement(By.cssSelector(locator));
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();
		} else if (identifiedBy.equalsIgnoreCase("name")) {

			WebElement element = driver.findElement(By.name(locator));
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();
		} else if (identifiedBy.equalsIgnoreCase("xpath")) {

			WebElement element = driver.findElement(By.xpath(locator));
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();
		} else if (identifiedBy.equalsIgnoreCase("link")) {

			WebElement element = driver.findElement(By.linkText(locator));
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();
		} else if (identifiedBy.equalsIgnoreCase("class")) {

			WebElement element = driver.findElement(By.className(locator));
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();
		}
	}

}
