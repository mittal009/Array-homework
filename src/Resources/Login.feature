Feature: user should login successfully with valid credentials

  Scenario: user should be logged in with valid credentials
    Given  user is on login page
    When user type username as "John123"
    And user enter password "jiNi089
    And user click on login button
    Then user should be logged in
    And user should be able to enter in the home page of site

    Scenario: user should not be logged in with valid username and invalid password
      Given user type user name "John123"
      When user type password "jini089"
      And click on login button
      Then user should not be logged in
      And use should see error massage "your username amd password wrong"

  Scenario: user should not be logged in with valid username and invalid password
    Given user type user name "John1234"
    When user type password "jiNi089"
    And click on login button
    Then user should not be logged in
    And use should see error massage "your username amd password wrong"

  Scenario: user should not be logged in with valid username and invalid password
    Given user type user name "John1234"
    When user type password "jinii089"
    And click on login button
    Then user should not be logged in
    And use should see error massage "your username amd password wrong"

  Scenario: user should not be logged in with valid username and invalid password
    Given user type user name "Jon1234"
    When user unable to type password
    And click on login button
    Then user should not be logged in
    And use should see error massage "your username amd password wrong"

  Scenario: user should not be logged in with valid username and invalid password
    Given user type user name "Johne1234"
    When user type password "jini056"
    And click on login button
    Then user should not be logged in
    And use should see error massage "your username amd password wrong"

  Scenario: user should not be logged in with valid username and invalid password
    Given user type user name "Johhn123"
    When user type password "JINNI089"
    And click on login button
    Then user should not be logged in
    And use should see error massage "your username amd password wrong"

  Scenario: user should not be logged in with valid username and invalid password
    Given user type user name "jhoon123"
    When user type password "jiinii089"
    And click on login button
    Then user should not be logged in
    And use should see error massage "your username amd password wrong"

  Scenario: user should not be logged in with valid username and invalid password
    Given user type user name "jhone321"
    When user type password "jiNi089"
    And click on login button
    Then user should not be logged in
    And use should see error massage "your username amd password wrong"
