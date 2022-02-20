Feature: Auto Insurance Validation

  Scenario: Quote for new auto insurance
    Given user should be on the mercury auto insurance home page 'Auto, Home, Business Insurance & More | Mercury Insurance'
    When user  move cursor onto auto insurance tab
    And user should click auto insurance button
    And user  put their zipcode
    Then user should click onto get a quote button
