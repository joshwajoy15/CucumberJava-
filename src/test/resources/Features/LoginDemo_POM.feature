Feature: Test login functionality

  Scenario: Check login is successfully with valid credentials
    Given Demo_POM: browser is open
    And Demo_POM: user is on login page
    When Demo_POM: user enters <username> and <password>
    And Demo_POM: user clicks on login
    Then Demo_POM: user is navigated to the home page
    
    Examples: 
    | username | password |
    | Joshwa | 12345 |
    | John | 12345 |
