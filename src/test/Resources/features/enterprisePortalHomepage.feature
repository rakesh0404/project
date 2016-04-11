@enterprisehomepage
Feature: As an System Admin
  I want to go to Enterprise Admin homepage
  So that i can check the available options there

  Scenario: go to Enterprise Homepage
    Given I am on System Admin Homepage
    When I select an enterpirse
    And go to the Enterprise
    Then i successfully see the Enterprise Homepage

  Scenario: Enterpirse Homepage
    Given I am on Enterprie Homepage
    When I open Security Groups, Enterpirse Configureation and Reprots
    Then I can successfully open all the pages.