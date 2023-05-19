@Logout
Feature: Je souhaite tester la deconnexion de l application Swag Labs
    ETQ utilisateur je veux pouvoire me deconnecter de l application Swag Labs

  Background: 
    Given Je me connecte a l application swag labs
    Then Je me redirige vers la page home "Products"

  @Logout
  Scenario: Je souhaite tester la page deconnexion
    When je clique sur le menu burger
    And je clique sur logout
    Then je me redirige vers la page de la connexion "swag labs"
