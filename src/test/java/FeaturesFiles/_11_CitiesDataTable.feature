#Cities münüsünün kayıt , Tekrar Aynı Kayıt (Negatif test) ve sile özelliğini test ediniz.

Feature: Cities Functionality

  Background: #Before Senaryo
    Given Navigate to Campus
    When Enter username and password and Click login button
    Then User should login successfully
    And Navigate to Country

  @RegressionTest
    Scenario: Create and Delete cities

      And Click on the Element in LeftNav

        | setup      |
        | parameters |
        | cities  |

      And Click on the Element in Dialog

        | addButton      |
        | countrySelect |
        | countryOption  |

      And User sending the keys in Dialog
        | nameInput      | NeşeCities1  |

      And Click on the Element in Dialog
      | saveButton|

      Then Success message should be displayed

      And User delete the element from dialog
        | NeşeCities1      |

      Then Success message should be displayed


