@qa

Feature: Add/remove elements

  Scenario: Add and remove element
    Given  I go to page TheInternet on Heroku
    When   I select exercise "Add/Remove Elements"
    And    I click button "Add Element"
    Then   I check if added button is visible
    And    I click button "Delete"
    And    I check if number of buttons equals 1