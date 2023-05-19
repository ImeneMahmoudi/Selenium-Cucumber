@login
Feature: Je souhaite tester la page de la connexion de l'application swag labs
  ETQ utilisateur je souhaite tester la page de la connexion de l application Swag Labs 

  @login_CasPassant
  Scenario: Je souhaite tester la page connexion avec un cas passant
    Given Je me connecte a l application swag labs 
    Then Je me redirige vers la page home "Products"
    
    @login_casNonPassant
    Scenario: Je souhaite tester la page connexion avec un cas non passant
    Given Je me connecte sur l application Swag Labs
    When Je saisi le username "imen"
    When Je saisi le password "imen0212"
    When Je clique sur le bouton login
    Then Le message d'erreur s affiche "Epic sadface: Username and password do not match any user in this service"
    
    
    
    