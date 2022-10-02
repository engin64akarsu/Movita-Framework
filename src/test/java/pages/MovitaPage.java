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

    @FindBy(xpath = "//a[@src=\"/app-assets/images/lang/turkFlag.png\"]")
    public WebElement logo_turk;

    @FindBy(xpath = "//div[@id=\"layer-126085703\"]")
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


    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div[3]/div[1]/div/div[2]/h3")
    public WebElement takip;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div[3]/div[2]/div/div[2]/h3")
    public WebElement tse_belgeli_cihaz;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div[3]/div[3]/div/div[2]/h3")
    public WebElement ucretsiz_incele;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div[3]/div[4]/div/div[2]/h3")
    public WebElement yazilim_gelistime;


    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div[3]/div[5]/div/div[2]/h3")
    public WebElement arac_takip;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div[3]/div[6]/div/div[2]/h3")
    public WebElement one_cikan_ozellikler;


    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div[3]/div[7]/div/div[2]/h3")
    public WebElement kolay_erisim;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div[3]/div[8]/div/div[2]/h3")
    public WebElement teknik;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div[3]/div[9]/div/div[2]/h3")
    public WebElement sektore_yonelik_cozumler;




    @FindBy(xpath = "//i[@class=\"icon-wrench1\"]")
    public WebElement teknik_destek_icon;
    @FindBy(xpath = "//div[text()=\"Tüm Sektörlere Hitap Eden Çözümler\"][1]")
    public WebElement tum_sektorler;
}




