Feature: Login to Credmudra Website

Scenario Outline: Successful login with valid credentials
  Given User is on login page
  When The user enters phone number "<PhoneNo>"
  And User login to the application
  Then The user enters the otp "<OTP>"
  And User verify the OTP

Examples:
  | PhoneNo     | OTP    |
  | 9201997399  | 123456 |
        