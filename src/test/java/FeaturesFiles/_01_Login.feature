#login fonksiyon kontrolü
  # önce siteye git - driver get
  # sonra login bilgilerini gir - username password sendkeys
  # sonra giriş yaptığını kontrol et - verify assert


  Feature: Login Functionality

    Scenario: Login with valid username and password

      Given Navigate to Campus
      When Enter username and password and Click login button
      Then User should login successfully

