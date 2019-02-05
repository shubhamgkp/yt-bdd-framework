Feature: Login into Application

Scenario: Positive test validating login
Given Intialize the browser with chrome and navigate to "https://www.youtube.com/" site 
And Click on signin button to navigate to secure login page
When User enter "shubhamcert@gmail.com" and "Skv@2580" and click on login
Then Verify that user is successfully logged in by clicking Trending option