import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MtsPageTest extends SeleniumInitializer{

    @Test
    @DisplayName("Проверка названия блока")
    public void checkBlockName(){
        mtsPage.openBaseURL();
        Assertions.assertEquals("Онлайн пополнение\nбез комиссии", mtsPage.getBlockName());
    }
}
