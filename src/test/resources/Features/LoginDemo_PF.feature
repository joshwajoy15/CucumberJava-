Feature: Test login functionality

  Scenario: Check login is successfully with valid credentials
    Given Demo_PF: browser is open
    And Demo_PF: user is on login page
    When Demo_PF: user enters <username> and <password>
    And Demo_PF: user clicks on login
    Then Demo_PF: user is navigated to the home page
    
    Examples: 
    | username | password |
    | Joshwa | 12345 |
    | John | 12345 |
