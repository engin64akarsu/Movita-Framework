package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.MovitaPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class MovitaStepDefinitions_2 {
    MovitaPage movita = new MovitaPage();
    static WebDriver driver;
    static String mainPage = Driver.getDriver().getWindowHandle();

    @Given("user navigates to {string}")
    // this is pre-condition, being on the page.
    public void userNavigatesTo(String homePage) {

        Driver.getDriver().get(ConfigurationReader.getProperty(homePage));

    }


    @And("scrolls down to {string}")
    // First step
    public void scroll_down_to(String element) throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(element, Keys.PAGE_DOWN)
                .perform();
        Thread.sleep(1000);

    }

    @And("hover over verify bayilik_basvurusu's color changed to blue")
    // 2th step
    public void hover_over_bayi() throws InterruptedException {
        String color_before = movita.bayi.getCssValue("background-color");
        String color_b_hex = Color.fromString(color_before).asHex();

        ReusableMethods.hover(movita.bayi);
        ReusableMethods.waitForVisibility(movita.bayi, 5000);

        String color_after = movita.bayi.getCssValue("background-color");
        String color_a_hex = Color.fromString(color_after).asHex();
        Assert.assertNotEquals(color_a_hex, color_b_hex);

    }

    @Then("verify bayilik_basvurusu is clickable")
    //3th step
    public void verify_bayilik_basvurusu_is_clickable() {
        ExpectedConditions.elementToBeClickable(movita.bayi);
    }

    @Then("clicks on bayilik_basvurusu")
    //4th step
    public void clicks_on_bayilik_basvurusu() {
        movita.bayi.click();
    }

    @And("verify bayilik_basvurusu is displayed")
    // 5 th step
    public void verify_bayilik_basvurusu_is_displayed() {
        ReusableMethods.waitForVisibility(movita.bayi_baslik, 3000);
        Assert.assertTrue("no display", movita.bayi_baslik.isDisplayed());
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }

    @And("navigate to previous page")
    //6th step
    public void navigate_back() {
        Driver.getDriver().navigate().back();
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }

    @Then("scrolls down to demo basvurusu")
    //7th step
    public void scroll_down_to_demo() {

    }

    @Then("hover over and verify demo basvurusu's color does not change")
    //8 th step
    public void hover_over_to_demo() {
        String color_before = movita.demo.getCssValue("background-color");
        String color_b_hex = Color.fromString(color_before).asHex();

        ReusableMethods.hover(movita.demo);
        ReusableMethods.waitForVisibility(movita.demo, 5000);

        String color_after = movita.demo.getCssValue("background-color");
        String color_a_hex = Color.fromString(color_after).asHex();
        Assert.assertEquals(color_a_hex, color_b_hex);


    }

    @And("verify demo basvurusu is clickable")
    //9th step
    public void demo_basvurusu_clickable() {
        ExpectedConditions.elementToBeClickable(movita.demo);

    }

    @And("clicks on demo basvurusu")
    // 10th step
    public void click_on_demo_basvurusu() {
        movita.demo.click();
    }


    @Then("verify demo basvurusu is displayed")
    //11th step
    public void demo_basvurusu_is_displayed() {
        ReusableMethods.waitForVisibility(movita.demo_baslik, 3000);
        Assert.assertTrue("no display", movita.demo_baslik.isDisplayed());
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }


    }

    @Then("navigate back")
    //12th step
    public void navigate_back_to() {
        Driver.getDriver().navigate().back();
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }

    @And("hover over and verify arrow's color changed")
    //8 th step
    public void hover_over_to_arrow() {
        String color_before = movita.arrow.getCssValue("background-color");
        String color_b_hex = Color.fromString(color_before).asHex();

        ReusableMethods.hover(movita.arrow);
        ReusableMethods.waitForVisibility(movita.arrow, 5000);

        String color_after = movita.arrow.getCssValue("background-color");
        String color_a_hex = Color.fromString(color_after).asHex();
        Assert.assertNotEquals(color_a_hex, color_b_hex);
    }
@Then("click on arrow")
public void click_on_the_element(){
    ReusableMethods.clickWithTimeOut(movita.arrow,3000);

}

@Then("verify Tüm Sektörlere Hitap Eden Çözümler is displayed")
public void is_string_displayed() throws IOException {
        ReusableMethods.waitForVisibility(movita.tum_sektorler,10000);
    Assert.assertTrue("görünmüyor",movita.tum_sektorler.isDisplayed());



}

}






