Feature: open google.com feature
Scenario: open google website and search
         Given user is entering google.co.in
   When user clicks the search box 
   And types the search term as "Madurai"
   Then the user should see the search results for Madurai
