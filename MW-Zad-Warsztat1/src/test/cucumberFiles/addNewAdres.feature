Feature: Logowanie

  Scenario Outline: user can login in.

    Given an open browser with mystore-testlab.coderslab.pl, user have an account
    When user click on Sign in
    And user fills login: "<loginIn>" password: "<passwordIn>" and submit
    When user click "add first address"
    And user fills cells "<Alias>" "<Address>" "<Zip/postalCode>" "<City>" "<Phone>" and click the country
    And Click save Button to add new address
    #Then test poprawnosci danych
    Then checkCorrect "<Alias>" "<Address>" "<Zip/postalCode>" "<City>" "<Phone>"
    And close browser;

    Examples:
      |loginIn                  | passwordIn          |Address      |Zip/postalCode      |City      |Phone    |Alias|
      |MikeMyStoreTest@gmail.com|hasloTestMyStore1234 |adres1 test  |40-666              |Katowice  |123123123|dom  |