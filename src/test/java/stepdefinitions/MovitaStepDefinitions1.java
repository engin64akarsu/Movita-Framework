package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import pages.MovitaPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;
public class MovitaStepDefinitions1 {
    MovitaPage movita = new MovitaPage();

    static WebDriver driver;
    static String mainPage = Driver.getDriver().getWindowHandle();


    @Given("user navigates to {string}page")

    public void user_navigates_to_page(String movita) {
        Driver.getDriver().get(ConfigurationReader.getProperty(movita));


    }


    @And("scroll down to {string}")
    // First step
    public void scroll_down_to(String element) throws InterruptedException {

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(element, Keys.PAGE_DOWN)
                .perform();
        Thread.sleep(10000);

    }

    @Given("verify neden takip sistemi is displayed")
    public void verify_neden_takip_sistemi_is_displayed()  {
        String arananKelime = "NEDEN TAKİP SİSTEMİ";
        String sonucKelime = movita.takip.getText();
        Assert.assertTrue(arananKelime.contains(sonucKelime));
        System.out.println("sonucKelime = " + arananKelime);
      //  Thread.sleep(3000);

    }

    @Given("verify tse belgeli cihazlar is displayed")
    public void verify_tse_belgeli_cihazlar_is_displayed()  {
        String arananKelime = "TSE BELGELİ CİHAZLAR";
        String sonucKelime = movita.tse_belgeli_cihaz.getText();
        Assert.assertTrue(arananKelime.contains(sonucKelime));
        System.out.println("sonucKelime = " + arananKelime);
     //   Thread.sleep(3000);


    }
    @Given("verify ücretsiz inceleyin is  displayed")
    public void verify_ucretsiz_inceleyin_is_displayed() {
        String arananKelime = "ÜCRETSİZ İNCELEYİN";
        String sonucKelime = movita.ucretsiz_incele.getText();
        Assert.assertTrue(arananKelime.contains(sonucKelime));
        System.out.println("sonucKelime = " + arananKelime);

    }

    @Given("verify yazilim ve teknolo gelistirme displayed")
    public void verifyYazilimVeTeknoloGelistirmeDisplayed() {
        String arananKelime = "Yazılım ve Teknoloji Geliştirme";
        String sonucKelime = movita.yazilim_gelistime.getText().toUpperCase();

        System.out.println("sonucKelime = " + arananKelime);


    }
    @Given("verify araç takip sistemi displayed")
    public void verify_arac_takip_sistemi_displayed() {

            String arananKelime = "ARAÇ TAKİP SİSTEMİ";
            String sonucKelime = movita.arac_takip.getText();
            Assert.assertTrue(arananKelime.contains(sonucKelime));
            System.out.println("sonucKelime = " + arananKelime);

    }
    @Given("verify öne çıkan özelliklerimiz is displayed")
    public void verify_one_cikan_ozelliklerimiz_is_displayed() {

            String arananKelime = "ÖNE ÇIKAN ÖZELLİKLERİMİZ";
            String sonucKelime = movita.one_cikan_ozellikler.getText();
            Assert.assertTrue(arananKelime.contains(sonucKelime));
            System.out.println("sonucKelime = " + arananKelime);

    }
    @Given("verify kolay erisim is displayed")
    public void verify_kolay_erisim_is_displayed() {

            String arananKelime = "KOLAY ERİŞİM";
            String sonucKelime = movita.kolay_erisim.getText();
            Assert.assertTrue(arananKelime.contains(sonucKelime));
            System.out.println("sonucKelime = " + arananKelime);
    }

    @And("verify teknik_destek is displayed")
    public void verifyTeknik_destekIsDisplayed() throws InterruptedException {
        String arananKelime = "TEKNİK DESTEK";
        String sonucKelime = movita.teknik.getText();
        Assert.assertTrue(arananKelime.contains(sonucKelime));
        System.out.println("sonucKelime = " + arananKelime);
        Thread.sleep(3000);

    }
    @Given("verify sektore yönelik cözümler is displayed")
    public void verify_sektore_yonelik_cozumler_is_displayed() {


        String arananKelime = "SEKTÖRLERE YÖNELİK ÇÖZÜMLER";
        String sonucKelime = movita.sektore_yonelik_cozumler.getText();
        Assert.assertTrue(arananKelime.contains(sonucKelime));
        System.out.println("sonucKelime = " + arananKelime);
    }


    @And("hover over and verify arrow's color changed")
    public void hoverOverAndVerifyArrowSColorChanged() {
        String color_before = movita.arrow.getCssValue("background-color");
        String color_b_hex = Color.fromString(color_before).asHex();

        ReusableMethods.hover(movita.arrow);
        ReusableMethods.waitForVisibility(movita.arrow, 5000);

        String color_after = movita.arrow.getCssValue("background-color");
        String color_a_hex = Color.fromString(color_after).asHex();
        Assert.assertNotEquals(color_a_hex, color_b_hex);



    }

    @Then("click on arrow")
    public void clickOnArrow() {
        ReusableMethods.clickWithTimeOut(movita.arrow,3000);

    }

    @Then("verify Tüm Sektörlere Hitap Eden Çözümler is displayed")
    public void verifyTümSektörlereHitapEdenÇözümlerIsDisplayed() {
        ReusableMethods.waitForVisibility(movita.tum_sektorler,10000);
        Assert.assertTrue("görünmüyor",movita.tum_sektorler.isDisplayed());
    }


}