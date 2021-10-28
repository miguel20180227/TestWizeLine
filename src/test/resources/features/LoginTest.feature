Feature: As a user, I want to create credentials

  @ValidCase @SomeTags
  Scenario Outline: Successful login using valid account
    Given user is in testapp Home Page
    And user click on Login button
    And user enter <userName> and <password>
    When user click on Second Login button
    Then Success login to home page

    Examples:
      | userName             |  password |
      | testuser@example.com |  test123  |
