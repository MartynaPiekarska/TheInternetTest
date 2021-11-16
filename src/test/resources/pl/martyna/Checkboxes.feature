@qa

  Feature: Select and unselect checkboxes

    Background:
      Given  I go to page TheInternet on Heroku
      When   I select exercise "Checkboxes"

    Scenario: Select checkbox 1
      And    I select checkbox 1
      Then   I check if checkbox 1 is selected

    Scenario: Unselect checkbox 2
      And    I select checkbox 2
      Then   I check if checkbox 2 is not selected
