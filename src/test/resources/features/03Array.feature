@arrays1
Feature: Array Feature


Scenario: User Validates Array Page
When The user is in homepage
And User Should be in Page "Numpy Ninja" 
When User opens the dropdown
Then user should click Array
And User should navigate to "Array" Page

 Scenario: Array Python
 When user clicks array in python
 Then user clicks on Tryhere
 Then user enters python code
 Then user clicks run button
 
 Scenario: Array using List
 When user cliks arrays using list
 Then user navigated to array using list page
 When user clicks Tryherebutton
 When user enters Code in test editor
 Then user clicks on run
 
 Scenario: Basicoperations in list
 When user click on Basicoperations in list
 Then User clcks tryhere button and enters code and run it
 
 Scenario: Application of Array
 When User clicks on Application of Array
 Then User Clicks on tryhere and in text area code shuld be enter and then run
 
 Scenario: Practice questions-Seach Array
 When user click on practice questions 
 And user is on practice page
 Then User clicks search the array
 Then User clicks run button
 And alert opens and user shold handle the alert
 
 Scenario: Practice questions-Max consecutive one
 When User clicks on maxcosecutive one
 Then user click tryheree and then run button
 Then alert should be handled
 
 Scenario: Practice Question-Find numbers with even number of digits
 When User clicks Find numbers with even number of digits 
 Then user clicks on run button
 Then user alert handle
 
 Scenario: Practice Question-Squares of sorted Array
 When User clicks Squares of sorted Array
 Then user clicks on run 
 Then Alert will come user needs to handle it
 