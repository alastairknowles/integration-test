Feature: Calling Bing

  Scenario: Calling Bing
    Given A bing web page http://www.bing.com
    When I request the bing page http://www.bing.com
    Then I should get the bing response status 200
