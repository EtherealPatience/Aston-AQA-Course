import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
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

    @FindBy(id = "connection-phone")
    private WebElement phoneField;

    @FindBy(id = "connection-sum")
    private WebElement sumField;

    @FindBy(id = "connection-email")
    private WebElement emailField;

    @FindBy(css = "#pay-connection > button")
    private WebElement buttonContinueRefill;

    @FindBy(css = ".bepaid-iframe")
    private WebElement iframe;

    @FindBy(xpath = "//section//div[2]/button")
    private WebElement optionList;

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

    public MtsPage setValues(String phone, String sum, String email){
        phoneField.sendKeys(phone);
        sumField.sendKeys(sum);
        emailField.sendKeys(email);
        buttonContinueRefill.click();
        return this;
    }

    public String getActualTextElementForCheck(){
        driver.switchTo().frame(iframe);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement elementForCheck = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span[contains(text(), 'или используйте карту')]")));

        return elementForCheck.getText();
    }

    public MtsPage selectOption(String optionText){
        optionList.click();
        WebElement selectedOption = driver.findElement(
                By.xpath("//option[@value='" + optionText + "']"));
        selectedOption.click();

        return this;
    }

    public List<WebElement> getFields(String optionText){
        String formID = driver.findElement(By.xpath(
                "//option[@value='"+ optionText +"']")).getAttribute("data-open");

        List<WebElement> fields = driver.findElements(By.cssSelector("#" + formID + " input[type='text'"));

        return fields;
    }
}
