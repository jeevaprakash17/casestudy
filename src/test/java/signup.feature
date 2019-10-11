Feature: casestudy
Scenario: SignUp to TestMe App
Given Open browser and proceed to TestMe App
When User enters User Name as "Jeevaprakapwiihy"
And User enters First Name as "jeeva"
And User enters Last Name as "prakash"
And User enters Password as "jeevap17"
And User enters Confirm Password as "jeevap17"
And User select gender  as "Male"
And User enters E -Mail as "edgwsg@gmail.com"
And User enters Mobile Number as "9876543210"
And User enters DOB as "10/10/2010"
And User enters Address as "YYYYYYYYY"
And User enters Answer as "on earth"
And User clicks on login button
Then Check if TestMe App login page is displayed
