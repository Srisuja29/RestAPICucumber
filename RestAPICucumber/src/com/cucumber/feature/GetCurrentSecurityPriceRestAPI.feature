Feature: Auto API


Scenario Outline: Post call to create Landlords
Given API are up and running "<URL>"
When Perform Post 
Then Status cod
|200|
|400|

Scenario Outline: Get all info
Given API are up and running "<URL>"
When Get all info
Then verify response time

Scenario Outline: Get all info
Given API are up and running "<URL>"
When Get all info
Then Verify Status cod
Then close



Examples: 
|URL|
|http://services.groupkt.com/state/get/IND/UP|

    