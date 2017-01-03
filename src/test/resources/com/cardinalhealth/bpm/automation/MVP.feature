Feature: MVP

  

  Scenario: Create POC1
    Given I am at OE Login Page
    When I enter OE username
    And I enter OE password
    And I click on Sign in
    And I enter CIN
    And I click on Find Product
    And I click on Cart
    #And I click on Add to Cart on the dialog box
    #And I note the default Order Number
    And I enter qty
    And I click on Submit Order
    And I click on ok button on the dialog box
    And I click on Submit Order on the Vendor Information dialog box
    Then I should see Order Acknowledgement dialog box
    And I click on close button
    And I clicked on Home
    #And I see order number under Todays web order