@about
Feature: Je souhaite tester la fonctionnalite de about de l application Swag Labs
  ETQ utilisateur je souhaite tester la fonctionnalite de about de l application Swag Labs

  Background: 
    Given Je me connecte a l application swag labs
    Then Je me redirige vers la page home "Products"

  @aboutCasPassant
  Scenario: Je souhaite tester la fonctonnalite de about avec un cas passant
     When je clique sur le menu burger
    And Je clique sur le bouton About
    Then Je redirige vers la page About
