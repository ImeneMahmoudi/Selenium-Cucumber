package com.e2etest.automation.page_objects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etest.automation.utils.Setup;

public class AboutPage {

	@FindBy(how = How.XPATH, using = "//a[@id='about_sidebar_link']")
	public static WebElement btnAbout;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Swag Labs')]")
	public static WebElement titlePage;

	public AboutPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	public void clickOnAbout() {
		WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(btnAbout));
		btnAbout.click();
	}
}
