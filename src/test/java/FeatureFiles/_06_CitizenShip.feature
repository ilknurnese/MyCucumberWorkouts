#Senaryo
#Senaryo
#CitizenShip sayfasına gidiniz.
#Create işlemini parameter yöntemi ile yapınız. (Senaryo 1)
#Daha sonra aynı bilgilerle tekrar Create yapılamadığını doğrulayınız. (negatif test) (Senaryo 2)
#Ayrı sebaryoda girilen bilgiyi silme işlemini doğrulayınız
# (Senaryo 3)

Feature: Citizenship Functionality

  Background: #Before Senaryo
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to CitizenShip

    @RegressionTest @SmokeTest
  Scenario: Create a Citizenship with parameter
    When Create a CitizenShip name as "ism12CS121" shortKod as "ic2sk12100"
    Then Success message should be displayed

      @RegressionTest
  Scenario: Create a Citizenship with parameter Negatif
    When Create a CitizenShip name as "ism12CS12100" shortKod as "ic2sk12111"
    Then Already exist message should be displayed

        @RegressionTest
    Scenario: Delete CitizenShip
    When user delete name as "ic2sk12100"
    Then Success message should be displayed










