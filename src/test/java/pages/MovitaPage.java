package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class MovitaPage {

    public MovitaPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//div[text()=\"Kurumsal\"]")
    public WebElement kurumsalMenu;

    @FindBy(xpath = "(//ul[@class=\"sub-menu-container\"])[1]")
    public WebElement subKurumsalMenu;

    @FindBy(id = "logo")
    public WebElement movitaLogo;

    @FindBy(xpath = "//div[text()=\"Mobil Vasıta İzleme Takip Sistemi\"]")
    public WebElement mainTextTurkish;

    @FindBy(xpath = "//*[@id=\"dropdownMenuButton\"]")
    public WebElement dropdownMenubutton;

    @FindBy(xpath = "//a[@class=\"dropdown-item\"]")
    public WebElement logo_eng;

    @FindBy(xpath = "//div[@id=\"layer-713898396\"]")
    public WebElement mainTextEnglish;

    @FindBy(xpath = "//*[@href=\"/rota_optimizasyonu\"][1]")
    public WebElement rota_optimizasyon;

    @FindBy(xpath = "//*[@href=\"/uygulamalar\"]")
    public WebElement uygulamalar;

    @FindBy(xpath = "//*[@href=\"/guide\"]")
    public WebElement kilavuz;

    @FindBy(xpath = "//*[@href=\"/iletisim\"]")
    public WebElement iletisim;

    @FindBy(xpath = "//*[@href=\"/login\"]")
    public WebElement giris;

    @FindBy(xpath = "//*[@id=\"gotoTop\"]")
    public WebElement arrow;

    @FindBy(xpath = "//*[@href=\"/bayi_basvuru\"][1]")
    public WebElement bayilik_basvurusu;

    @FindBy(xpath = "//*[@class=\"button button-3d button-dark button-large \"]")
    public WebElement bayi;

    @FindBy(tagName = "h1")
    public WebElement bayi_baslik;

    @FindBy(xpath ="//*[@class=\"button button-3d button-large \"]")
            public WebElement demo;


    @FindBy(tagName = "h1")
    public WebElement demo_baslik;



}
