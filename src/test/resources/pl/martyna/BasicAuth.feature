@qa

Feature: Basic authorization (user and pass: admin)

  Scenario Outline: Login tests: wrong login, wrong password and both
    Given  I go to page TheInternet on Heroku
    When   I select exercise "Basic Auth"
    And    I enter login "<login>"
    And    I enter password "<password>"
    And    I click button "Login"

    # for happy path:
    Then   I can see welcome page with message "Congratulations!"

    Examples:
      | login      | password      |
      | admin      | wrongpassword |
      | wronglogin | admin         |
      | wronglogin | wrongpassword |