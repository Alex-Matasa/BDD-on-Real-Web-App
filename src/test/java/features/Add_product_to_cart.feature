@Add_product_to_cart @all

Feature: Add product to cart

  Scenario:Add a product to cart
    Given Access home page
    When Click on Shop
    And Click on first product from the list
    And Click on Add to cart button at the top
    And Click on View cart button
    Then The added product is visible on Shopping cart page






