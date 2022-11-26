Feature: This is a login feature of orange HRM
Scenario: This is login scenario
   Given  user navigates to  login screen
  When the user enters the valid  credentials "Admin"  and "admin123"
  And clicks the login button
  Then the user should see the home page .