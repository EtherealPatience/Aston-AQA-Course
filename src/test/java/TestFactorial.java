import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.testng.Assert;

public class TestFactorial {
    @ParameterizedTest(name = "Факториал {0} равен {1}")
    @DisplayName("Тест положительных чисел для факториала")
    @CsvSource(value = {
            "0, 1",
            "1, 1",
            "2, 2",
            "3, 6",
            "4, 24",
            "5, 120",
            "6, 720",
            "7, 5040",
            "8, 40320",
            "9, 362880",
            "10, 3_628_800",
            "11, 39_916_800",
            "12, 479_001_600"
    })
    public void testFactorialPositiveNumbers(int input, int expected){
        Assert.assertEquals(Factorial.getFactorial(input), expected);
    }
}
