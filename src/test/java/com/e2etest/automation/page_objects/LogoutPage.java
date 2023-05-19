package com.e2etest.automation.page_objects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etest.automation.utils.Setup;

public class LogoutPage {
	/* Retrieve Element */
	@FindBy(how=How.XPATH,using="//*[@id=\"react-burger-menu-btn\"]")
	public static WebElement btnBurger;

	@FindBy(how=How.ID,using="logout_sidebar_link")
	public static WebElement btnLogout;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Swag Labs')]")
	public static WebElement titlePage;

	public LogoutPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	/* Methods */
	public void clickOnBtnBurger() {
		WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(btnBurger));
		btnBurger.click();
	}

	public void clickOnLogout() {
		WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(btnLogout));
		btnLogout.click();

	}

}
