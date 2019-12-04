package AutomationFramework;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.URL;

public class BaseTest {

    public static AppiumDriver<MobileElement> driver;

    @BeforeClass
    public void setUp() throws Exception {
        //Set up desired capabilities and pass the Android app-activity and app-package to Appium
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("noReset", "true");
        capabilities.setCapability("fullReset", "false");
        capabilities.setCapability("deviceName","Android Emulator");
        capabilities.setCapability("platformVersion","7.1.1");
        capabilities.setCapability("platformName","Android");

        capabilities.setCapability("appPackage", "com.android.calculator2");
        capabilities.setCapability("appActivity","com.android.calculator2.Calculator");
        driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @AfterClass
    public void teardown(){
        //close the app
        driver.quit();
    }
}
