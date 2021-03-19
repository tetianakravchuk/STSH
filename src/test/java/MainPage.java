import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPage {
    String mainUrl = "https://stopandshop.com/";
    WebDriver driver;
    String currentUrlCoupons;
    String currentUrlHome;
    String expectedUrlCoupons = "https://stopandshop.com/savings/coupons/browse";
    String expectedUrlHome = "https://stopandshop.com/home";
    By LINK_HOMEPAGE_COUPONS = By.xpath("//a[@id = 'nav-coupons']");
    By LINK_HOMEPAGE_LOGO = By.xpath("//div[@class ='vector-icon-sns-logo']");
    By LINK_HOMEPAGE_WELCOME_CLOSE = By.xpath("//div[@class = 'modal_close-icon']");
    By LINK_HOMEPAGE_WELCOME_HELP_CLOSE = By.xpath("//div[@class ='pdl-shop-mode-help-panel_close-icon-bar']//button[@aria-label='close dialog']");
    By BUTTON_HOMEPAGE_SIGN_IN = By.xpath("//button[@class = 'button button--prime button-width--full st_button']");
    By FIELD_USERNAME_SIGN_IN = By.xpath("//input[@id = 'login-username']");
    By FIELD_PASSWORD_SIGN_IN = By.xpath("//input[@id = 'login-password']");
    By BUTTON_SIGN_IN_WELCOME_TO_STOP_AND_SHOP = By.xpath("//button[@id = 'sign-in-button']");

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/tetianakravchuk/Documents/JavaProjects/com.stopandshop/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(mainUrl);
        //driver.findElement(LINK_HOMEPAGE_WELCOME_CLOSE).click();
       // driver.findElement(LINK_HOMEPAGE_WELCOME_HELP_CLOSE).click();

    }

//    @Test
//    public void testHomePage() {
//        driver.findElement(LINK_HOMEPAGE_LOGO).click();
//        currentUrlHome = driver.getCurrentUrl();
//        System.out.println(currentUrlHome);
//        Assert.assertEquals(currentUrlHome, expectedUrlHome);
//        driver.findElement(LINK_HOMEPAGE_COUPONS).click();
//        currentUrlCoupons = driver.getCurrentUrl();
//        System.out.println(currentUrlCoupons);
//        Assert.assertEquals(currentUrlCoupons, expectedUrlCoupons);
//    }

    @Test
    public void testSignIn() throws InterruptedException {
        //driver.findElement(LINK_HOMEPAGE_LOGO).click();
        //currentUrlHome = driver.getCurrentUrl();
       // System.out.println(currentUrlHome);
       // Assert.assertEquals(currentUrlHome, expectedUrlHome);
        driver.findElement(BUTTON_HOMEPAGE_SIGN_IN).click();
        driver.findElement(FIELD_USERNAME_SIGN_IN).sendKeys("gomybills@gmail.com");
        driver.findElement(FIELD_PASSWORD_SIGN_IN).sendKeys("Love2018");
    }

    @AfterMethod
    public void afterAction() {
        driver.quit();
    }
}
