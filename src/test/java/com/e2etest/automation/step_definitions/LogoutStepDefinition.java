package com.e2etest.automation.step_definitions;

import org.junit.Assert;
import com.e2etest.automation.page_objects.LogoutPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStepDefinition {

	public LogoutPage logoutPage;

	public LogoutStepDefinition() {
		logoutPage = new LogoutPage();

	}

	@When("je clique sur le menu burger")
	public void jecliquesurLeBurguerMenuButton() {
		LogoutPage.btnBurger.click();
	}

	@When("je clique sur logout")
	public void jecliqueSurLeBoutonLogout() {
		logoutPage.clickOnLogout();

	}

	@Then("je me redirige vers la page de la connexion {string}")
	public void jeMeRedirigeVersLaPageLogin(String titleLogo) {
		String title_logo_page = LogoutPage.titlePage.getText();
		Assert.assertEquals(title_logo_page, titleLogo);
		

	}

}
