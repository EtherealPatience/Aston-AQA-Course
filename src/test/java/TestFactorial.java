import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.collections.OneToTwoDimArrayIterator;

public class TestFactorial {

    @DataProvider(name = "positiveNumbers")
        public Object[][] positiveNumbers(){
            return new Object[][]{
                    {1, 1},
                    {2, 2},
                    {3, 6},
                    {4, 24},
                    {5, 120},
                    {6, 720},
                    {7, 5040},
                    {8, 40320},
                    {9, 362880},
                    {10, 3_628_800},
                    {11, 39_916_800},
                    {12, 479_001_600}
            };
        }

    @Test(dataProvider = "positiveNumbers")
    public void testFactorialPositiveNumbers(int input, int expected){
        Assert.assertEquals(Factorial.getFactorial(input), expected);
    }

}
