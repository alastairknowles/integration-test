Feature: Calling Google

  Scenario: Calling Google
    Given A google web page http://www.google.com
    When I request the google page http://www.google.com
    Then I should get the google response status 200
