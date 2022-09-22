@movita2
Feature: Movita_02
  Scenario: User tests bayilik, demo and arrow sign

    Given user navigates to "movita"
    And scrolls down to "bayilik_basvurusu"
     And hover over verify bayilik_basvurusu's color changed to blue
Then verify bayilik_basvurusu is clickable
    Then clicks on bayilik_basvurusu
    And verify bayilik_basvurusu is displayed
    And navigate to previous page
    Then scrolls down to demo basvurusu
Then hover over and verify demo basvurusu's color does not change
    And verify demo basvurusu is clickable
    And clicks on demo basvurusu
    Then verify demo basvurusu is displayed
    Then navigate back
    And hover over and verify arrow's color changed
    Then click on arrow
    Then verify Tüm Sektörlere Hitap Eden Çözümler is displayed
