Feature: RX2U
  Background: Go to Homepage
    Given I go to Homepage

  @logo
  Scenario: Validate logo
    Then I validate the logo as "Rx2U"

  @about
  Scenario: Validate About
    Then I validate About