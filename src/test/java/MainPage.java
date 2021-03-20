import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MainPage extends BaseUI {
    String currentUrlCoupons;
    String currentUrlHome;
    String expectedUrlCoupons = "https://stopandshop.com/savings/coupons/browse";
    String expectedUrlHome = "https://stopandshop.com/home";


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
        driver.findElement(Locators.BUTTON_HOMEPAGE_SIGN_IN).click();
        driver.findElement(Locators.FIELD_USERNAME_SIGN_IN).sendKeys(Data.email);
        driver.findElement(Locators.FIELD_PASSWORD_SIGN_IN).sendKeys(Data.password);
    }

}