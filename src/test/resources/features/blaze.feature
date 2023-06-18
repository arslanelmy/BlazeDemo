Feature: Auto Register Page Functionality

  Scenario: Verify User able to Register
    Given User navigates to Register Page "https://blazedemo.com/purchase.php"
    When User provides personal information
      | fullName  | address     | city   | state | zip   | cardType | cardNumber    | expMonth | expYear | nameOnCard |
      | John Cena | 123 lost st | reston | VA    | 20155 | Visa     | 1234325431234 |       08 |    2025 | John Cena  |
		And User clicks remember me 
		And User clicks on purchase flight button
		Then User verifies success message "Thank you for your purchase today!"