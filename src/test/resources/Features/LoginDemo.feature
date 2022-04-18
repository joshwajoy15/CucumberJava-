Feature: Test login functionality

  Scenario: Check login is successfully with valid credentials
    Given Demo: browser is open
    And Demo: user is on login page
    When Demo: user enters <username> and <password>
    And Demo: user clicks on login
    Then Demo: user is navigated to the home page
    
    Examples: 
    | username | password |
    | Joshwa | 12345 |
    | John | 12345 |
