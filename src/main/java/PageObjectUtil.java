import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import pageObjectData.GradeUpAppPageData;

public class PageObjectUtil extends GradeUpAppPageData {

    public CommonUtil common = new CommonUtil();


    public WebElement SSCButton(AndroidDriver driver) {
        WebElement element = common.findElementByXpath(driver, SSCButtonXpath);
        return element;
    }

    public WebElement EnglishRadioButton(AndroidDriver driver) {
        WebElement element = common.findElementByXpath(driver, EnglishRadioButtonXpath);
        return element;
    }

    public WebElement DoneButton(AndroidDriver driver) {
        WebElement element = common.findElementByXpath(driver, DoneButtonXpath);
        return element;
    }

    public WebElement RegisterButton(AndroidDriver driver) {
        WebElement element = common.findElementByXpath(driver, RegisterButtonXpath);
        return element;
    }

    public WebElement SavedAccountsPopup(AndroidDriver driver) {
        WebElement element = common.findElementById(driver, SavedAccountsPopupId);
        return element;
    }

    public WebElement ChooseAnAccountPopup(AndroidDriver driver) {
        WebElement element = common.findElementById(driver, ChooseAnAccountPopupId);
        return element;
    }

    public WebElement EnterNameTextBox(AndroidDriver driver) {
        WebElement element = common.findElementByXpath(driver, EnterNameTextBoxXpath);
        return element;
    }

    public WebElement EnterEmailTextBox(AndroidDriver driver) {
        WebElement element = common.findElementByXpath(driver, EnterEmailTextBoxXpath);
        return element;
    }

    public WebElement EnterPasswordTextBox(AndroidDriver driver) {
        WebElement element = common.findElementByXpath(driver, EnterPasswordTextBoxXpath);
        return element;
    }

    public WebElement RegisterSubmitButton(AndroidDriver driver) {
        WebElement element = common.findElementByXpath(driver, RegisterSubmitButtonXpath);
        return element;
    }

    public WebElement MobileNumberPopupCrossIcon(AndroidDriver driver) {
        WebElement element = common.findElementByXpath(driver, MobileNumberPopupCrossIconXpath);
        return element;
    }

    public WebElement CourseDropdownIcon(AndroidDriver driver) {
        WebElement element = common.findElementByXpath(driver, CourseDropdownIconXpath);
        return element;
    }

    public WebElement CourseHeading(AndroidDriver driver) {
        WebElement element = common.findElementByXpath(driver, CourseHeadingXpath);
        return element;
    }

    public WebElement AddCourseIcon(AndroidDriver driver) {
        WebElement element = common.findElementByXpath(driver, AddCourseIconXpath);
        return element;
    }

    public WebElement CourseSearchBox(AndroidDriver driver) {
        WebElement element = common.findElementByXpath(driver, CourseSearchBoxXpath);
        return element;
    }

    public WebElement CTETCourseIcon(AndroidDriver driver) {
        WebElement element = common.findElementByXpath(driver, CTETCourseIconXpath);
        return element;
    }

    public WebElement TurnOnButton(AndroidDriver driver) {
        WebElement element = common.findElementById(driver, TurnOnButtonID);
        return element;
    }

    public WebElement BackIcon(AndroidDriver driver) {
        WebElement element = common.findElementByXpath(driver, BackIconXpath);
        return element;
    }

    public WebElement ClassRoomTab(AndroidDriver driver) {
        WebElement element = common.findElementById(driver, ClassRoomTabID);
        return element;
    }

    public WebElement StartTrialButton(AndroidDriver driver) {
        WebElement element = common.findElementById(driver, StartTrialButtonID);
        return element;
    }

    public WebElement CourseName(AndroidDriver driver) {
        WebElement element = common.findElementByXpath(driver, CourseNameXpath);
        return element;
    }

    public WebElement CourseBatchPrice(AndroidDriver driver) {
        WebElement element = common.findElementById(driver, CourseBatchPriceId);
        return element;
    }

}