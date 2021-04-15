import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseUI {
    WebDriver driver;
    WebDriverWait wait;
    String mainUrl = "https://stopandshop.com/";

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/tetianakravchuk/Documents/JavaProjects/com.stopandshop/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(mainUrl);
        //driver.findElement(LINK_HOMEPAGE_WELCOME_CLOSE).click();
        // driver.findElement(LINK_HOMEPAGE_WELCOME_HELP_CLOSE).click();

    }

    @AfterMethod
    public void afterAction() {
        driver.quit();
    }
}

