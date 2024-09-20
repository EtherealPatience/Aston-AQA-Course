import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MtsPageTest extends SeleniumInitializer{
    @Test
    @DisplayName("training test")
    public void simpleTest(){
        driver.get("https://www.mts.by/");
    }
}
