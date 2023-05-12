@login
Feature: Je souhaite tester la page de la connexion de l'application swag labs
  ETQ utilisateur je souhaite tester la page de la connexion de l application Swag Labs 

  @login_CasPassant
  Scenario: Je souhaite tester la page connexion avec un cas passant
    Given Je me connecte a l application swag labs 
    When Je saisis le username "standard_user"
    And Je saisis le password "secret_sauce"
    And Je clique sur le bouton login
    Then Je me redirige vers la page home "Products"