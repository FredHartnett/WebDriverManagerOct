import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {
    private WebDriver driver;

    @BeforeClass
    public static void setupClass() {
//       System.setProperty("webdriver.chrome.driver","/Users/fredhartnett/ChromeDriverFile/chromedriver");
//        System.setProperty("webdriver.chrome.driver","/Users/fredhartnett/ChromeDriverFile/chromedriver");
//       WebDriverManager.chromedriver().cachePath("/Users/fredhartnett/ChromeDriverFile").avoidOutputTree().setup();
      WebDriverManager.chromedriver().cachePath("/Users/fredhartnett/ChromeDriverFile").avoidOutputTree().forceDownload().setup();


    }

    @Before
    public void setupTest() {
        driver = new ChromeDriver();
    }

    @After
    public void teardown() {
        if(driver != null) {
            driver.quit();
        }
    }

    @Test
    public void test() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(usernameLocator).sendKeys("Admin");
        driver.findElement(passwordLocator).sendKeys("admin123");

        try{
            Thread.sleep(2000); }
        catch(InterruptedException ie){ }

        driver.findElement(loginButtonLocator).click();

        try{
            Thread.sleep(2000); }
        catch(InterruptedException ie){ }
    }


    private final By usernameLocator = By.id("txtUsername");
    private final By passwordLocator = By.id("txtPassword");
    private final By loginButtonLocator = By.id("btnLogin");
}
