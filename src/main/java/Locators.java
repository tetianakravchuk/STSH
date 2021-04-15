import org.openqa.selenium.By;

public class Locators {
    // HOME PAGE
    public static final By LINK_HOMEPAGE_COUPONS = By.xpath("//a[@id = 'nav-coupons']");
    public static final By LINK_HOMEPAGE_LOGO = By.xpath("//div[@class ='vector-icon-sns-logo']");
    public static final By LINK_HOMEPAGE_WELCOME_CLOSE = By.xpath("//div[@class = 'modal_close-icon']");
    public static final By LINK_HOMEPAGE_WELCOME_HELP_CLOSE = By.xpath("//div[@class ='pdl-shop-mode-help-panel_close-icon-bar']//button[@aria-label='close dialog']");
    public static final By BUTTON_HOMEPAGE_SIGN_IN = By.xpath("//button[@class = 'button button--prime button-width--full st_button']");
    // SIGN IN
    public static final By FIELD_USERNAME_SIGN_IN = By.xpath("//input[@id = 'login-username']");
    public static final By FIELD_PASSWORD_SIGN_IN = By.xpath("//input[@id = 'login-password']");
    public static final By BUTTON_SIGN_IN_WELCOME_TO_STOP_AND_SHOP = By.xpath("//button[@id = 'sign-in-button']");
}
