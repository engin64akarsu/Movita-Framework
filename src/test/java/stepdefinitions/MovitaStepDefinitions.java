package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import pages.MovitaPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Objects;


public class MovitaStepDefinitions {

    MovitaPage movita = new MovitaPage();
    WebElement dropdownMenubutton;
    Select select;


    @Given("User navigates to {string} page")
    public void user_navigates_to_page(String homePage) {
        Driver.getDriver().get(ConfigurationReader.getProperty(homePage));
    }

    @When("clicks on movita logo")
    public void clicks_on_movita_logo() {
        movita.movitaLogo.click();
    }

    @Then("User should navigate to homepage")
    public void user_should_navigate_to_homepage() {
        String expectedUrl = "https://movita.com.tr/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("Urls are not matched.User can't navigate to homepage", expectedUrl, actualUrl);
    }

    @Then("Verify if Mobil Vasıta İzleme Takip Sistemi displayed")
    public void verify_if_mobil_vasita_izleme_takip_sistemi_displayed() {
        ReusableMethods.waitForVisibility(movita.mainTextTurkish, 10);
        Assert.assertTrue(movita.mainTextTurkish.isDisplayed());
    }

    //

    @And("User hover over Dropdown on the right corner to switch language")
    public void user_clicks_forEnglish() {
        ReusableMethods.hover(movita.dropdownMenubutton);


    }



    @And("clicks on the language button")
    public void user_clicks_on_the_Language_Button() {
        movita.dropdownMenubutton.click();

    }

    @Then("clicks on English on the dropdown menu")
    public void user_clicks_on_english_button() {
        ReusableMethods.waitForVisibility(movita.logo_eng, 5);
        movita.logo_eng.click();

    }
    @And("Verify if Mobile Vehicle Traking System is displayed")
    public void verify_if_mobile_vehivle_traking_system_displayed(){

        ReusableMethods.waitForVisibility(movita.mainTextEnglish, 5);
        Assert.assertTrue(movita.mainTextEnglish.isDisplayed());
    }

    @Then("clicks on Turkish on the dropdown menu")
    public void clicksOnTurkishOnButton() {
        ReusableMethods.waitForVisibility(movita.logo_turk,5);
        movita.logo_turk.click();
    }
    @Then("user hovers over rota_optimizasyon and verifies color change")
    public void hover_over_rota_optimizasyon(){
        String color_before= movita.rota_optimizasyon.getCssValue("color");
        String color_b_hex=Color.fromString(color_before).asHex();

        ReusableMethods.hover(movita.rota_optimizasyon);

        String color_after=movita.rota_optimizasyon.getCssValue("color");
        String color_a_hex=Color.fromString(color_after).asHex();

        Assert.assertFalse(Objects.equals(color_a_hex, color_b_hex));


    }
    @And("verifies rota_optimizasyon clickable")
    public void clickable(){
        ExpectedConditions.elementToBeClickable(movita.rota_optimizasyon);

    }
    @Then("user verifies rota string")
    public void verify_string(){
        String expected_rota_text="ROTA OPTIMIZASYONU";
        String s=movita.rota_optimizasyon.getText();
        Assert.assertEquals(expected_rota_text,s);

    }
    @Then("user hovers over uygulamalar and verifies color change")
    public void verify_color(){
        String color_before= movita.uygulamalar.getCssValue("color");
        String color_b_hex=Color.fromString(color_before).asHex();
        ReusableMethods.hover(movita.uygulamalar);
        String color_after=movita.uygulamalar.getCssValue("color");
        String color_a_hex=Color.fromString(color_after).asHex();
        Assert.assertFalse(Objects.equals(color_a_hex, color_b_hex));
    }
    @And("verifies uygulamalar clickable")
    public void clickable_uygulamalar(){
        ExpectedConditions.elementToBeClickable(movita.uygulamalar);


    }
    @Then("verify uygulamalar string")
    public void verify_uygulamalar_string(){
        String expected="UYGULAMALAR";
        String actual=movita.uygulamalar.getText();
        Assert.assertEquals(expected,actual);

    }

    @Then("user hovers over kilavuz and verifies color change")
    public void user_hovers_over_kilavuz_and_verifies_color_change() {
        String color_before= movita.kilavuz.getCssValue("color");
        String color_b_hex=Color.fromString(color_before).asHex();
        ReusableMethods.hover(movita.kilavuz);
        String color_after=movita.kilavuz.getCssValue("color");
        String color_a_hex=Color.fromString(color_after).asHex();
        Assert.assertFalse(Objects.equals(color_a_hex, color_b_hex));

    }
    @Then("user verifies kilavuz clickable")
    public void user_verifies_kilavuz_clickable() {
        ExpectedConditions.elementToBeClickable(movita.kilavuz);
    }
    @Then("verifies kilavuz string")
    public void verify_kilavuz_string() {
        String expected="KILAVUZ";
        String actual=movita.kilavuz.getText();
        Assert.assertEquals(expected,actual);

    }
    @Then("user hovers over iletisim and verifies color change")
    public void user_hovers_over_iletisim_and_verifies_color_change() {
        String color_before= movita.iletisim.getCssValue("color");
        String color_b_hex=Color.fromString(color_before).asHex();
        ReusableMethods.hover(movita.iletisim);
        String color_after=movita.iletisim.getCssValue("color");
        String color_a_hex=Color.fromString(color_after).asHex();
        Assert.assertFalse(Objects.equals(color_a_hex, color_b_hex));

    }
    @Then("user verifies iletisim clickable")
    public void user_verifies_iletisim_clickable() {
        ExpectedConditions.elementToBeClickable(movita.iletisim);

    }
    @Then("verify iletisim string")
    public void verify_iletisim_string() {
        String expected="İLETİŞİM";
        String actual=movita.iletisim.getText();
        Assert.assertEquals(expected,actual);

    }
    @Then("user hovers over giris and verifies color change")
    public void user_hovers_over_giris_and_verifies_color_change() {
        String color_before= movita.giris.getCssValue("color");
        String color_b_hex=Color.fromString(color_before).asHex();
        ReusableMethods.hover(movita.giris);
        String color_after=movita.giris.getCssValue("color");
        String color_a_hex=Color.fromString(color_after).asHex();
        Assert.assertFalse(Objects.equals(color_a_hex, color_b_hex));

    }
    @Then("user verifies giris clickable")
    public void user_verifies_giris_clickable() {
        ExpectedConditions.elementToBeClickable(movita.giris);

    }
    @Then("verify giris string")
    public void verify_giris_string() {
        String expected="GİRİŞ YAP";
        String actual=movita.giris.getText();
        Assert.assertEquals(expected,actual);

    }


    @Then("some_wait")
    public void some_wait() {
        ReusableMethods.waitFor(3);
    }


    @And("User hover over Dropdown on the right corner to switch languagetr")
        public void user_clicks_forTurkish() {
        ReusableMethods.hover(movita.logo_turk);


    }
}