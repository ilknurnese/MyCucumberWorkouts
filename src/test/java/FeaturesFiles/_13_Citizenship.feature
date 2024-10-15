#CitizenShip menusunun kayıt ve silme özelliğini
#(DataTable ile) 5 farklı değer seti ile çalıştırınız.

  Feature: Citizenship Functionality DataTable and Scenario Outline

    Background:
      Given Navigate to Campus
      When Enter username and password and Click login button
      Then User should login successfully

    Scenario Outline: Create and Delete Citizenships

      And Click on the Element in LeftNav
        | setup      |
        | parameters |
        | citizenships |

      And Click on the Element in Dialog
          |addButton|

      And User sending the keys in Dialog
        | nameInput | <name>  |
        | shortName | <short> |

      And Click on the Element in Dialog
        | saveButton |

      Then Success message should be displayed

      And User delete the element from dialog
        | <name> |

      Then Success message should be displayed


      Examples:
        |name | short |
        |nese1230 | 123000  |
        |nese1231| 123131 |
        |nese1232 | 1232132|