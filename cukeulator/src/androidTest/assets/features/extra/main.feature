# new feature
# Tags: optional

Feature: Get User List

  Scenario: User List
    Given I have Home Activity
    Then Click Button
    And Check Internet Connection
    Then If network Available Make API
    When Success Response
    And Show the Result