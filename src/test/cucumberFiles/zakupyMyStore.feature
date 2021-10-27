Feature: making a purchase on MyStore

  Scenario Outline: Registered user make a purchase and confirm with screenshot

  Given user is on site and proceed to login in site
    And user login in
    When user click clothes
    And user chose item
    And user chose "<size>" "<count>"
    When click addToCart
    And proceed to Checkout
    And sell details
    Then make Screenshot

    Examples:
    |size |count    |
    |  L  |  5      |