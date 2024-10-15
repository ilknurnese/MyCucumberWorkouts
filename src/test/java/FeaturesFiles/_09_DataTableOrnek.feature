Feature: Datatable Örnek

  Scenario: User List
    When Write username "Neşe"
    When Write username and password "neşe" and "1234"

    And Write username as DataTable
    | İsmet   |
    | Ummuhan |
    | İbrahim |
    | Neşe    |
    | Engin   |

    And Write username and password as DataTable
      | İsmet   | 12344 |
      | Ummuhan | 12345 |
      | İbrahim | 12346 |
      | Neşe    | 12347 |
      | Engin   | 12348 |

