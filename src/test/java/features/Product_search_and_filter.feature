@SearchAndFilter @all

Feature: Product Search and Filter

  Background:
    Given Access home page

  Scenario Outline: User searches for a category
    When the user searches for <product>
    Then the search results should display products related to <expectedProduct>

    Examples:
      | product | expectedProduct |
      | strings | string          |
      | piano   | pian            |
      | synths  | synth           |

