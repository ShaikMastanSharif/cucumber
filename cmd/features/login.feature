Feature: User Login

  Scenario: Successful login
    Given the user is on the opencart login
    When the user enter the login credentials (username:"shaiksharifms@gmail.com",password="Shaik@123")
    And the user clicks on the button
