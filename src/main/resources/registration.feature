Feature: Registration

  Scenario Outline: customer new Registration
    Given customer on navigative Registration page
    When customer select "<Gender>"
    And customer enter "<Firstname>" and "<Lastname>"
    When I am select Date of Birth "<Day>" and "<Month>"and "<Year>"
    And I enter "<Email>" and  "<Newsletters>" check box
    When I enter "<Companyname>" and "<password>" and "<Confirmpassword>"
    When I press on Register
    Then I should be able to see a message "<Message>"

    Examples:
      | Gender | Firstname | Lastname | Day | Month | Year | Email      | Newsletters | Companyname | password | Confirmpassword | Message                     |
      | male   | rayen     | bond     | 12  | March | 1957 | @gmail.com | true        | tesco       | tesco123 | tesco123        | Your registration completed |
      | male   | run       | walk     | 16  | July  | 1987 | @gmail.com | fales       | runwalk     | run123   | run123          | Your registration completed |
