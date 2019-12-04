package Test;

import AutomationFramework.BaseTest;
import POM.CalculatorHome;
import org.testng.annotations.Test;

public class FirsTestCase extends BaseTest {

    CalculatorHome calculatorHome = new CalculatorHome();

    @Test
    public void testCal() throws Exception {
        calculatorHome.tabNumber(2);
        calculatorHome.tabAdd();
        calculatorHome.tabNumber(8);
        calculatorHome.tabEqual();

        assert calculatorHome.getResults().equals("10"):"Actual value is: "+ calculatorHome.getResults() +" did not match with expected value: 10" ;
    }

}
