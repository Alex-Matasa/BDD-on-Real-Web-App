@Filter_products @all
Feature: Filter products

  Background:

    Given Access home page
    When Click on Shop


  Scenario Outline: Filter products by price

    And set min value <minValue>
    And set max value <maxValue>
    And clickOnApply


    Examples:
      | minValue | maxValue |
      | 20       | 50       |
      | 0        | 20       |
      | 200      | 250      |