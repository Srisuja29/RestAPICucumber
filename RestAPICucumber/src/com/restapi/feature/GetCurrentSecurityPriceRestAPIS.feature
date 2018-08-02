Feature: Get Current Security Price From Rest API

Scenario Outline: Get current Security Price from bloomberg by calling security price service
Given pass CUSIP
When Get security price for given CUSIP
Then Status code shd be 200
Then Return price details
|200|
|400|


Examples: 
|URL|
|http://services.groupkt.com/state/get/IND/UP|

    