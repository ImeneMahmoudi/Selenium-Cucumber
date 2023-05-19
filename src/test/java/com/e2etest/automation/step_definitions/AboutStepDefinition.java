package com.e2etest.automation.step_definitions;

import com.e2etest.automation.page_objects.AboutPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class AboutStepDefinition {
	
	public AboutPage aboutPage;
	
	public AboutStepDefinition() {
		aboutPage = new AboutPage();
		
	}
	
	@Given("Je clique sur le bouton About")
	public void je_clique_sur_le_bouton_about() {
		aboutPage.clickOnAbout();
	
	    
	}
	@Then("Je redirige vers la page About")
	public void je_me_redirige_vers_la_page_about() {
	
	    
	}



}
