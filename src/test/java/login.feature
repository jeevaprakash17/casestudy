Feature: logging in
Scenario Outline: Login
Given user not logged in
When user performs login using "<username>" and "<password>"
Then logged in Successfully
Examples: 
|username| |password|
|lalitha| |Password123|

