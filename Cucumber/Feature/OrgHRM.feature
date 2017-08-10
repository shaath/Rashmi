Feature: Orangehrm Login and Logout Test

      Scenario: Login Test
      		Given Launching the bowser navigate to url
      		When User enters user name and password
      		And clicks on login
      		Then Welcome message displayed
      Scenario: Logout
      		When Tester Clicks on welcome admin link
      		And also clicks on logout
      		Then Login page displayed		