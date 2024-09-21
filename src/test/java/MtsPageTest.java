import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MtsPageTest extends SeleniumInitializer{

    @Test
    @DisplayName("Проверка названия блока")
    public void checkNameBlock(){
        mtsPage.openBaseURL().acceptCookie();
        Assertions.assertEquals("Онлайн пополнение\nбез комиссии", mtsPage.getBlockName());
    }

    @Test
    @DisplayName("Проверка наличия логотипов платежных систем")
    public void checkLogoDisplay(){
        mtsPage.openBaseURL().acceptCookie();
        List<WebElement> logoList = mtsPage.getLogoList();
        for(WebElement logo : logoList){
            Assertions.assertTrue(logo.isDisplayed(), "Логотип не отобразился, alt:" + logo.getAttribute("alt"));
        }
    }

    @Test
    @DisplayName("Проверка работы ссылки")
    public void checkLinkWork(){
        String expectedTitle = "Порядок оплаты и безопасность интернет платежей";
        mtsPage.openBaseURL().acceptCookie();
        Assertions.assertNotNull(mtsPage.getServiceLink());
        Assertions.assertEquals(true, mtsPage.getServiceLink().isDisplayed());
        mtsPage.clickServiceLink();
        Assertions.assertEquals(expectedTitle, driver.getTitle());
    }

    @Test
    @DisplayName("Проверка работоспособности кнопки")
    public void checkButtonWork(){
        String phone = "297777777";
        String sum = "100";
        String email = "testing@mail.com";
        String expectedText = "или используйте карту";

        mtsPage.openBaseURL().acceptCookie().setValues(phone, sum, email);
        Assertions.assertEquals(expectedText, mtsPage.getActualTextElementForCheck());
        driver.switchTo().defaultContent();
    }
}
