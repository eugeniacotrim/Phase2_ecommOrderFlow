
@tag
Feature: Place order step flow - ecomm


@cart
Scenario: Place order step flow
    Given user is on the shop page
    When user hovers the mouse over a product image
    Then user is able to click on the Add to Cart button
    When shopping bag contains at least one product
    Then user is able to click on the Checkout button
    Then user is able to add all required details in the Billing Address page
    When order contains at least one product
    Then user is able to click on the Place Order button
