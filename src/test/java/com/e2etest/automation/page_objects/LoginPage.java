package com.e2etest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etest.automation.utils.ConfigFileReader;
import com.e2etest.automation.utils.Setup;

public class LoginPage {
	public ConfigFileReader configFileReader;

	/* Retrieve Element */
	@FindBy(how = How.ID, using = "user-name")
	public static WebElement username;

	@FindBy(how = How.ID, using = "password")
	public static WebElement password;

	@FindBy(how = How.ID, using = "login-button")
	public static WebElement btnLogin;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Products')]")
	public static WebElement titlePage;

	@FindBy(how = How.XPATH, using = "//div[@id='login_button_container']//form//h3")
	public static WebElement msgError;

	public LoginPage() {
		configFileReader = new ConfigFileReader();
		PageFactory.initElements(Setup.getDriver(), this);
	}

	/* Methods */
	public void login() throws InterruptedException {
		Setup.getDriver().get(configFileReader.getProperties("home.url"));
		username.clear();
		username.sendKeys(configFileReader.getProperties("home.login"));
		password.clear();
		Thread.sleep(3000);
		password.sendKeys(configFileReader.getProperties("home.password"));
		btnLogin.click();
	}

	public void connectToApp() {
		Setup.getDriver().get(configFileReader.getProperties("home.url"));
	}

	public void fillUsername(String usr) {
		username.clear();
		username.sendKeys(usr);

	}

	public void fillPassword(String pswd) {
		password.clear();
		password.sendKeys(pswd);

	}

	public void clickOnLogin() {
		btnLogin.click();

	}

}
