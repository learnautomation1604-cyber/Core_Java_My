Feature: Search Feature
  Scenario: To Verify Positive Search Functionality
    Given User Lanc the url
    When User Enter Productname Valid
    And User Click the Search Button
    Then User Verified the Product Search Functionality

  Scenario:To Verify Negative Search Functionality
    Given User Lanch the url
    When User Enter Productname Ivalid
    And User Click the Search Button
    Then User Verified the Product Search Functionality

