import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeMethod;
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
    public void testSignIn() {
        //driver.findElement(LINK_HOMEPAGE_LOGO).click();
        //currentUrlHome = driver.getCurrentUrl();
        // System.out.println(currentUrlHome);
        // Assert.assertEquals(currentUrlHome, expectedUrlHome);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_HOMEPAGE_SIGN_IN));
        driver.findElement(Locators.BUTTON_HOMEPAGE_SIGN_IN).click();
        driver.findElement(Locators.FIELD_USERNAME_SIGN_IN).sendKeys(Data.email);
        driver.findElement(Locators.FIELD_PASSWORD_SIGN_IN).sendKeys(Data.password);
    }

    @Test
    public void testAdIFrame() throws InterruptedException{
        Thread.sleep(500);
        driver.findElement(Locators.LINK_HOMEPAGE_LOGO);
        WebElement iframeElement = driver.findElement(By.xpath("//iframe[@src = 'https://77ebf0bf01b4ad95c6da4b59ed4bdcb1.safeframe.googlesyndication.com/safeframe/1-0-38/html/container.html']"));
        iframeElement.click();
        driver.switchTo().frame(iframeElement);
        driver.switchTo().frame("fm");



    }


}