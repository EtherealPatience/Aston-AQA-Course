import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MtsPage {
    protected static WebDriver driver;

    private final String baseURL = "https://www.mts.by/";

    @FindBy(id = "cookie-agree")
    private WebElement buttonCookieAgree;

    @FindBy(xpath = "//*[@id='pay-section']//h2")
    private WebElement blockName;

    @FindBy(linkText = "Подробнее о сервисе")
    private WebElement serviceLink;

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

    public List<WebElement> getLogoList(){
        List<WebElement> logoList = driver.findElements(By.cssSelector(" .pay__partners ul li img"));
        return  logoList;
    }

    public WebElement getServiceLink(){
        return serviceLink;
    }

    public MtsPage clickServiceLink(){
        serviceLink.click();
        return this;
    }
}
