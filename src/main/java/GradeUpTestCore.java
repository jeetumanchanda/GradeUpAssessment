import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class GradeUpTestCore {

    public AndroidDriver driver;
    public PropertiesUtil properties = new PropertiesUtil();

    @BeforeTest
    /**
     * Method to setUp Android driver with desired capabilities
     */
    public void setUp() throws MalformedURLException {
        properties.loadProperties();
        String appiumServerURL = "http://127.0.0.1:4723/wd/hub";
        //Desired Capabilities
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", properties.getPlatformName());
        dc.setCapability("platformVersion", properties.getPlatformVersion());
        dc.setCapability("deviceName", properties.getDeviceName());
        dc.setCapability("automationName", properties.getAutomationName());
        dc.setCapability("appPackage", properties.getAppPackage());
        dc.setCapability("appActivity", properties.getAppActivity());
        System.out.println(dc);
        //Driver
        driver = new AndroidDriver(new URL(appiumServerURL), dc);
        driver.manage().timeouts().implicitlyWait(properties.getImplicitWaitTimeoutSeconds(), TimeUnit.SECONDS);
    }

    @AfterTest
    /**
     * Method to close the app
     */
    public void closeApp() {
        driver.closeApp();
    }
}
