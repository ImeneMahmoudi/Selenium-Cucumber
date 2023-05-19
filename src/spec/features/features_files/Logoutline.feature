@logoutline
Feature: Je souhaite me connecter a l application avec plusieurs comptes

  Scenario Outline: Je souhaite me connecter a l application avec plusieurs comptes
    Given je me connecte a l application
    When je saisi le username "<username>"
    When je saisi le password "<password>"
    And je clique sur le bouton login
    Then je me redirige vers la page home"Products"

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
