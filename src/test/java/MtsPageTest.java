import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

public class MtsPageTest extends SeleniumInitializer{

    @Disabled
    @Test
    @DisplayName("Проверка названия блока")
    public void checkNameBlock(){
        mtsPage.openBaseURL().acceptCookie();
        Assertions.assertEquals("Онлайн пополнение\nбез комиссии", mtsPage.getBlockName());
    }

    @Disabled
    @Test
    @DisplayName("Проверка наличия логотипов платежных систем")
    public void checkLogoDisplay(){
        mtsPage.openBaseURL().acceptCookie();
        List<WebElement> logoList = mtsPage.getLogoList();
        for(WebElement logo : logoList){
            Assertions.assertTrue(logo.isDisplayed(), "Логотип не отобразился, alt:" + logo.getAttribute("alt"));
        }
    }

    @Disabled
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

    @Disabled
    @Test
    @DisplayName("Проверка работоспособности кнопки")
    public void checkButtonWork(){
        String phone = "297777777";
        String sum = "100";
        String email = "testing@mail.com";
        String expectedText = "или используйте карту";

        mtsPage.openBaseURL().acceptCookie().setValues(phone, sum, email);
        Assertions.assertEquals(expectedText, mtsPage.getActualTextElementForCheck());
        mtsPage.switchToDefaultContent();
    }

    @Disabled
    @ParameterizedTest(name = "У элемента списка {0} присутствуют плейсхолдеры {1}, {2}, {3}")
    @DisplayName("Проверка плейсхолдеров")
    @CsvSource({
            "Услуги связи, Номер телефона, Сумма, E-mail для отправки чека",
            "Домашний интернет, Номер абонента, Сумма, E-mail для отправки чека",
            "Рассрочка, Номер счета на 44, Сумма, E-mail для отправки чека",
            "Задолженность, Номер счета на 2073, Сумма, E-mail для отправки чека"
    })
    public void checkPlaceholders(String optionText, String numberText, String sumText, String emailText){
        int numberIndex = 0;
        int sumIndex = 1;
        int emailIndex = 2;
        mtsPage.openBaseURL().acceptCookie().selectOption(optionText);
        List<WebElement> fields = mtsPage.getFields(optionText);

        Assertions.assertEquals(fields.get(numberIndex).getAttribute("placeholder"), numberText);
        Assertions.assertEquals(fields.get(sumIndex).getAttribute("placeholder"), sumText);
        Assertions.assertEquals(fields.get(emailIndex).getAttribute("placeholder"), emailText);
    }

    @Disabled
    @Test
    @DisplayName("Проверка корректности отображения суммы")
    public void checkCorrectDisplaySum(){
        String phone = "297777777";
        String sum = "100";
        String email = "testing@mail.com";

        mtsPage.openBaseURL().acceptCookie().setValues(phone, sum, email);
        Assertions.assertEquals(sum + ".00 BYN", mtsPage.getActualSumText());
        mtsPage.switchToDefaultContent();
    }

}
