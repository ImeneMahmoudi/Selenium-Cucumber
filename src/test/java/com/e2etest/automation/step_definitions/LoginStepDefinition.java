package com.e2etest.automation.step_definitions;

import org.junit.Assert;

import com.e2etest.automation.page_objects.LoginPage;
import com.e2etest.automation.utils.ConfigFileReader;
import com.e2etest.automation.utils.Setup;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class LoginStepDefinition {

	public LoginPage loginPage;
	public ConfigFileReader configFileReader;

	public LoginStepDefinition() {
		loginPage = new LoginPage();
		configFileReader = new ConfigFileReader();
	}

	@Given("Je me connecte a l application swag labs")
	public void jeMeConnecteALApplicationSwagLabs() {
		Setup.getDriver().get(configFileReader.getProperties("home.url"));
	}

	@When("Je saisis le username {string}")
	public void jeSaisisLeUsername(String username) {
		loginPage.fillUsername(username);
	}

	@When("Je saisis le password {string}")
	public void jeSaisisLePassword(String password) {
		loginPage.fillPassword(password);
	}

	@When("Je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
		loginPage.clickOnLogin();
	}

	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String title) {
		String title_page = LoginPage.titlePage.getText();
		Assert.assertEquals(title_page, title);
			
	}

}
