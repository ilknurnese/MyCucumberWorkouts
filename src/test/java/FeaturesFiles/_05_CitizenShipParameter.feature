#Senaryo
#CitizenShip sayfasına gidiniz.
#Create işlemini parameter yöntemi ile 2 farklı senaryo ile kayıt yapınız.


  Feature: Citizenship Parameter

    Background:
      Scenario:

        Given Navigate to Country
        When Enter username and password and Click login button
        Then User should login successfully
        And Navigate to CitizenShip
        When Create a CitizenShip
        Then Success message should be displayed