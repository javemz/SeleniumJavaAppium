package POM;

import AutomationFramework.BaseTest;
import org.openqa.selenium.By;

public class CalculatorHome extends BaseTest {

    private By digit_1 = By.id("com.android.calculator2:id/digit_1");
    private By digit_2 = By.id("com.android.calculator2:id/digit_2");
    private By digit_3 = By.id("com.android.calculator2:id/digit_3");
    private By digit_4 = By.id("com.android.calculator2:id/digit_4");
    private By digit_5 = By.id("com.android.calculator2:id/digit_5");
    private By digit_6 = By.id("com.android.calculator2:id/digit_6");
    private By digit_7 = By.id("com.android.calculator2:id/digit_7");
    private By digit_8 = By.id("com.android.calculator2:id/digit_8");
    private By digit_9 = By.id("com.android.calculator2:id/digit_9");
    private By digit_0 = By.id("com.android.calculator2:id/digit_0");

    private By plus = By.id("com.android.calculator2:id/op_add");
    private By equalTo = By.id("com.android.calculator2:id/eq");
    private By results = By.id("com.android.calculator2:id/result");

    public CalculatorHome(){
    }


    public void tabNumber(Integer number){
        switch (number){
            case 1:
                driver.findElement(digit_1).click();
                break;
            case 2:
                driver.findElement(digit_2).click();
                break;
            case 3:
                driver.findElement(digit_3).click();
                break;
            case 4:
                driver.findElement(digit_4).click();
                break;
            case 5:
                driver.findElement(digit_5).click();
                break;
            case 6:
                driver.findElement(digit_6).click();
                break;
            case 7:
                driver.findElement(digit_7).click();
                break;
            case 8:
                driver.findElement(digit_8).click();
                break;
            case 9:
                driver.findElement(digit_9).click();
                break;
            case 0:
                driver.findElement(digit_0).click();
                break;
        }
    }

    public void tabAdd(){
        driver.findElement(plus).click();
    }

    public void tabEqual(){
        driver.findElement(equalTo).click();
    }

    public String getResults(){
        return driver.findElement(results).getText();
    }

}
