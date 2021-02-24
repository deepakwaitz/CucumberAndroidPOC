# new feature
# Tags: optional

Feature: Registration validation

  Scenario: users
    Given empty username returns false
    Then valid username and correctly repeated password returns true
    Then username already exists returns false
    Then incorrectly confirmed password returns false
    Then empty password returns false
    Then less than 2 digit password returns false
