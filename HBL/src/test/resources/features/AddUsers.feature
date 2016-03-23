@AddUsers
Feature: Users

  As a Admin
  I want to add,modify users
  So that i can see the updated users list

  Scenario: Updating user details

    Given I am on the User list page1
    When  I select the user that i want to change the details
    And   change the in the new Edit User window
    And   I select the update
    Then  I should see the message "User Updated Successfully"


  Scenario Outline: Adding users to the Users List

    Given I am on the Add User page
    When  I entered <"Employee Id">,<"First Name">,<"Last Name">,<"Designation">,<"User Type">,<"User Name">
    And   I select the save
    Then  I should see the message "User saved Successfully"

    Examples:
      | Employee Id | First Name | Last Name | Designation | User Type   | User Name |
      | 001         | abc        | def       | Developer   | Admin       | ab001     |
      | 002         | abcd       | defg      | QA          | Super Admin | abc02     |