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

import java.util.concurrent.TimeUnit;


public class MovitaStepDefinitions_2 {
    MovitaPage movita = new MovitaPage();
    static WebDriver driver;
    static String mainPage = Driver.getDriver().getWindowHandle();

    @Given("user navigates to {string}")
    public void userNavigatesTo(String homePage) {

        Driver.getDriver().get(ConfigurationReader.getProperty(homePage));

    }


    @And("scrolls down to {string}")
    public void scroll_down_to(String element) throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(element, Keys.PAGE_DOWN)
                .perform();
        Thread.sleep(1000);

    }

    @And("hover over verify bayilik_basvurusu's color changed to blue")
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
    public void verify_bayilik_basvurusu_is_clickable(){
        ExpectedConditions.elementToBeClickable(movita.bayi);
    }
    @Then("clicks on bayilik_basvurusu")
    public void clicks_on_bayilik_basvurusu(){
        movita.bayi.click();
    }
    @And("verify bayilik_basvurusu is displayed")
    public void verify_bayilik_basvurusu_is_displayed(){
        ReusableMethods.waitForVisibility(movita.bayi_baslik,3000);
        Assert.assertTrue("no display",movita.bayi_baslik.isDisplayed());
        try{
            Thread.sleep(5000L);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }

    }
    @And("navigate to previous page")
    public void navigate_back() {
        Driver.getDriver().navigate().back();
        try{
            Thread.sleep(5000L);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }

    }

    @Then("scrolls down to demo basvurusu")
    public void scroll_down_to_demo(){

    }
    @Then("hover over and verify demo basvurusu's color does not change")
    public void hover_over_to_demo(){
        String color_before = movita.demo.getCssValue("background-color");
        String color_b_hex = Color.fromString(color_before).asHex();

        ReusableMethods.hover(movita.demo);
        ReusableMethods.waitForVisibility(movita.demo, 5000);

        String color_after = movita.demo.getCssValue("background-color");
        String color_a_hex = Color.fromString(color_after).asHex();
        Assert.assertEquals(color_a_hex, color_b_hex);


    }
    @And("verify demo basvurusu is clickable")
public void demo_basvurusu_clickable(){
        ExpectedConditions.elementToBeClickable(movita.demo);

    }
    @And("clicks on demo basvurusu")
    public void click_on_demo_basvurusu(){
        movita.demo.click();
    }
    @Then("verify demo basvurusu is displayed")
    public void demo_basvurusu_is_displayed(){
        ReusableMethods.waitForVisibility(movita.demo_baslik,3000);
        Assert.assertTrue("no display",movita.demo_baslik.isDisplayed());
        try{
            Thread.sleep(5000L);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }


    }
    @Then("navigate back")
    public void navigate_back_to(){
        Driver.getDriver().navigate().back();
        try{
            Thread.sleep(5000L);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }

    }

}






