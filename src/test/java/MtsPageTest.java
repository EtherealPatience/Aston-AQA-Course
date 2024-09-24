import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

public class MtsPageTest extends SeleniumInitializer{

    String phone = "297777777";
    String sum = "100";
    String email = "testing@mail.com";

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
        String expectedText = "или используйте карту";

        mtsPage.openBaseURL().acceptCookie().setValues(phone, sum, email);
        Assertions.assertEquals(expectedText, mtsPage.getActualTextElementForCheck());
        mtsPage.switchToDefaultContent();
    }

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

    @Test
    @DisplayName("Проверка корректности отображения суммы")
    public void checkCorrectDisplaySum(){
        String expectedText = sum + ".00 BYN";

        mtsPage.openBaseURL().acceptCookie().setValues(phone, sum, email);
        Assertions.assertEquals(expectedText, mtsPage.getActualSumText());
        mtsPage.switchToDefaultContent();
    }

    @Test
    @DisplayName("Проверка корректности отображения суммы на кнопке")
    public void checkCorrectDisplaySumButton(){
        String expectedText = "Оплатить " + sum + ".00 BYN";

        mtsPage.openBaseURL().acceptCookie().setValues(phone, sum, email);
        Assertions.assertEquals(expectedText, mtsPage.getActualSumButtonText());
        mtsPage.switchToDefaultContent();
    }

    @Test
    @DisplayName("Проверка корректности отображения номера телефона")
    public void checkCorrectDisplayPhone(){
        String expectedText = "Оплата: Услуги связи Номер:375" + phone;

        mtsPage.openBaseURL().acceptCookie().setValues(phone, sum, email);
        Assertions.assertEquals(expectedText, mtsPage.getActualPhoneText());
        mtsPage.switchToDefaultContent();
    }

    @ParameterizedTest(name = "Надпись в незаполненном поле {0} корректно отображается")
    @DisplayName("Проверка корректности надписей в незаполненных полях в iframe")
    @CsvSource({
            "Номер карты", "Срок действия", "CVC", "Имя держателя (как на карте)"
    })
    public void checkIframeFields(String expectedField){

        mtsPage.openBaseURL().acceptCookie().setValues(phone, sum, email);
        Assertions.assertEquals(expectedField, mtsPage.getIframeField(expectedField).getText());
        mtsPage.switchToDefaultContent();
    }

    @Test
    @DisplayName("Проверка наличия иконок платежных систем")
    public void checkIconsPaymentDisplay(){
        mtsPage.openBaseURL().acceptCookie().setValues(phone, sum, email);

        Assertions.assertTrue(mtsPage.isIconsVisible());

        mtsPage.switchToDefaultContent();
    }

}
