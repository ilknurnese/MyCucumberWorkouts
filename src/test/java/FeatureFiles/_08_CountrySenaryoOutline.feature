# TODO : Country menusu create,update,delete olarak,
#  Senaryo outline şeklinde 5 kez çalıştırınız


#https://test.mersys.io/

  Feature: Country Senaryo Outline

    Background: #Before Senaryo
      Given Navigate to Campus
      When Enter username and password and click login button
      Then User should login successfully
      And Navigate to Country

      Scenario Outline: Country with Parameter
        When Create a country name as "<name>" code as "<code>"
        Then Success message should be displayed
        When Create a country name as "<name>" code as "<code>"
        Then Already exist message should be displayed
        When user delete name as "<name>"
        Then Success message should be displayed



        Examples:       | name    | code    |
        | iis71m22CS1 | iis71mCS1shor1t |
        | iis71m22CS2 | iis71mCS2shor1t |
        | iis71m22CS3 | iis71mCS3shor1t |
        | iis71m22CS4 | iis71mCS4shor1t |
        | iis71m22CS5 | iis71mCS5shor1t |
