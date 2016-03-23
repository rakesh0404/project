@Warehouse
Feature: Warehouse Management functions
  As a admin
  I want to create an access for Warehouse Management Functions
  So that an authorised person can keep updating related transactions.

  Scenario: create an account for warehouse person
    Given Admin is on 'User List' page
    When He/She  Choose 'Add User' option
    Then It should take to 'Add User' page.
    And should be able to fill all valid feilds<Employee ID>, <First Name>,<Middle Name>,<Last Name>,<Designation>,<User Type>,<User Name>
    When Admin choose 'Save'option
    Then 'User List' page should be updated.

  Scenario: Product order and  Inventory stock Mangement
    Given Warehouse authority person is on 'Produt Qauntity' page
    When A Dealer post a Purchase Order for perticular product
    Then 'Product Quantity' page should get calculative update.
    And Purchase Order should be smaller than 'Maximum Quantity'
    When Purchase Order is bigger than 'Maximum Quantity'
    Then Dealer should be prevented to place an order.




