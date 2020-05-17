import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CommonUtil {

    public AndroidDriver driver;
    /**
     * Method to handle Saved Accounts Popup
     */
    public void handleSavedAccountsPopup(AndroidDriver driver){
        try{
            sleepFor(5);
            driver.findElement(By.id("com.google.android.gms:id/cancel")).click();
        }
        catch (Exception e){
            System.out.println("Saved Accounts Popup not available");
        }

    }

    /**
     * Method to scroll the screen until text is found
     * @param visibleText
     * @return webElement
     */
    public WebElement scrollToElementWithText(AndroidDriver driver, String visibleText) {
        WebElement element = driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))");
        return element;
    }

    /**
     * Method to find element by xpath
     * @param driver
     * @param xpath
     * @return WebElement
     */
    public WebElement findElementByXpath(AndroidDriver driver, String xpath){
        WebElement element = driver.findElement(By.xpath(xpath));
        return element;
    }

    /**
     * Method to find element by ID
     * @param driver
     * @param id
     * @return WebElement
     */
    public WebElement findElementById(AndroidDriver driver, String id){
        WebElement element = driver.findElement(By.id(id));
        return element;
    }

    /**
     * Method to sleep thread
     * @param seconds
     * @throws InterruptedException
     */
    public void sleepFor (int seconds)throws InterruptedException{
        Thread.sleep(seconds*1000);
    }

 }
