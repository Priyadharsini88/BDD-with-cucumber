@TaggedHooks
Feature: Test Tagged hooks

@First
Scenario: This is the First sceanrio
  Given This is the first step
  When  This is the second step
  Then This is the third  step
  
@Second
Scenario: This is the second sceanrio
  Given This is the first step
  When  This is the second step
  Then This is the third  step
  
  @Third
Scenario: This is the THird  sceanrio
  Given This is the first step
  When  This is the second step
  Then This is the third  step
  
  

