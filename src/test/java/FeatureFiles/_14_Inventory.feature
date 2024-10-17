#Senaryo :
#Inventory Bölümündeki
#Item Categories Çalışmasını test ediniz
#girişi yapıp , sonrasında silmesini yapınız
#5 farklı değer için senaryoyu test ediniz

  Feature: Inventory Functionality

    Background:
      Given Navigate to Campus
      When Enter username and password and click login button
      Then User should login successfully

    Scenario: Inventory