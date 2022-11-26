Feature: This is a login feature of orange HRM
Scenario: This is login scenario
   Given  your on the  login screen
  When You enter the below crdentials 
  | Admin | admin123 |
  And clicks  the login button
  Then the user should see the  home page .