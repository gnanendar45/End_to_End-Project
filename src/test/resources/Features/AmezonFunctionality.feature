Feature: To validate the search Amezon application

  Background: 
    Given Launch the Amezon Application
    # When Close the popup
    Then It should Navigate to the Home pages

  @tc001
  Scenario: To validate the Amezon search functionalityes
    Given User enter the text in the search fields
    When Click the search button
    Then It should navigate to the search result page and display the relavent detailss

  # And Select the Brands
  #And select the Cellular Technology
  #And select the Display type
  @tc002
  Scenario: to validate the todays deal
    Given User to move to click on the Mobiles link
    When User curser to move to the Tv&Home entertinements
    And Move to LG and click
    Then User click an Elgible for pay on delivery checkbox
    Then It should display the search result and get the title and prices

  @tc003
  Scenario: to validate the Best Sellers
    Given User to move to click the Best Seller link
    And User to move to Electronics link
    When User should click on Computer&Accessories link
    And It should display the Bestsellers in computers&Accessories and get title and prices
    And User should click on Audio and video accseeories link
    And It should display the Bestsellers in webcam&voip Equipment and get title and prices
    Then User should click on the Hikvision 4th link

  @tc004
  Scenario: to validate the Todays Deals
    Given User should click on the Today's Deals link
    And User click on the Prime Programs under the Prime Exclusives check box
    When It Should display the prime exclusives and get title and prices
    Then User click on the Electronics link
    And User click on the Amezon device & Accessories departments and it should be display gettitle and price
    And User click on the amazonbasics brands and it should be display gettitle and price
    Then User click on the 10%ofmore checkbox prics and it should be display gettitle and price
    Then User click on Mobile link and click on the first mobilelink

  @tc005
  Scenario: to validate the fashion link
    Given User should click on the Fashion link
    And User mouise over the Women link and click on the Handlooms&Handicrafts link
    When User should click on the Home&Kitchen link and get title the under Categorys
    And User should click the checkbox in getitbytomorrow check box
    And It should be get title and prices
    And User shold move to Furniture link and click on Sofa beds link and It should get title and prices
    Then User check on the checkbox in Sofasize in threeSeats and click on fourth sofa gettitle and click and click on new window click on Buynow link
