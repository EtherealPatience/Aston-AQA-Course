import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class SeleniumInitializer {
    protected WebDriver driver;
    protected MtsPage mtsPage;

    @BeforeEach
    public void setUp(){
        WebDriverManager.chromedriver().clearDriverCache().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MtsPage.setDriver(driver);
        mtsPage = PageFactory.initElements(driver, MtsPage.class);
    }

    @AfterEach
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
