package com.e2etest.automation.step_definitions;

import org.junit.Assert;
import com.e2etest.automation.page_objects.LoginPage;
import com.e2etest.automation.utils.ConfigFileReader;
import com.e2etest.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDefinition {

	public LoginPage loginPage;
	public ConfigFileReader configFileReader;
	private SeleniumUtils seleniumUtils;
	

	public LoginStepDefinition() {
		loginPage = new LoginPage();
		seleniumUtils = new SeleniumUtils();
	}

	@Given("Je me connecte a l application swag labs")
	public void jeMeConnecteALApplicationSwagLabs()throws InterruptedException {
		loginPage.login();
	}

	@Given("Je me connecte sur l application Swag Labs")
	public void jeMeConnecteSurLApplicationSwagLabs() {
		loginPage.connectToApp();
	}
	
	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String title) {
		String title_page = LoginPage.titlePage.getText();
		Assert.assertEquals(title_page, title);		
	}
    /*Login Outline*/

	@When("Je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
		loginPage.clickOnLogin();
	}
	
	@When("Je saisi le username {string}")
	public void jeSaisiLeUsername(String username) {
	    loginPage.fillUsername(username);
	}
	@When("Je saisi le password {string}")
	public void jeSaisiLePassword(String password) {
	    //loginPage.fillPassword(password);
		seleniumUtils.writeText(LoginPage.password, password);
	}
	@Then("Le message d'erreur s affiche {string}")
	public void leMessageDErreurSAffiche(String msgError) {
		String msg = LoginPage.msgError.getText();
		Assert.assertEquals(msg, msgError);
	}




}
