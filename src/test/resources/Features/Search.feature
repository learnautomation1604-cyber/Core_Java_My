@Regression
Feature: Search Feature
  @Search-01    @smoke
  Scenario: To Verify Positive Search Functionality
    Given User Lanc the url
    When User Enter Pr oductname Valid
    And User Click the Search Button
    Then User Verified the Product Search Functionality
  @Search-02    @Sanity
  Scenario:To Verify Negative Search Functionality
    Given User Lanc the url
    When User Enter Productname Ivalid
    And User Click the Search Button
    Then User Verified the Product Search Functionality

  @Search-03    @smoke
  Scenario: To Verify the Empty Search
    Given User Lanc the url
    When User Make The Empty Search
    And User Click the Search Button
    Then  User Verfy the Empty Search

  @AllInOne
  Scenario Outline: To Verify the product Search
    Given User Lanc the url
    When User Enter the Productname "<productname>"
    And User Click the Search Button
    Then  User Verify the search Results
    Examples:
    | productname |
    | iPhone      |
    | GF*&%y      |
    | samsung      |
    | Sony        |
    | moto        |
    | 76576576    |
    | IUGJGH*&%*&*&|
