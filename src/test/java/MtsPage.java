import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.PrivilegedAction;

public class MtsPage {
    protected static WebDriver driver;

    private final String baseURL = "https://www.mts.by/";

    @FindBy(id = "cookie-agree")
    private WebElement buttonCookieAgree;

    @FindBy(xpath = "//*[@id='pay-section']//h2")
    private WebElement blockName;

    public static void setDriver(WebDriver webDriver){
        driver = webDriver;
    }

    public MtsPage openBaseURL(){
        driver.get(baseURL);
        return this;
    }

    public String getBlockName(){
        return blockName.getText();
    }

    public MtsPage acceptCookie(){
        if(buttonCookieAgree.isDisplayed()){
            buttonCookieAgree.click();
        }
        return this;
    }
}
