import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends GradeUpTestCore {

    public CommonUtil common = new CommonUtil();
    PageObjectUtil pageObject = new PageObjectUtil();


    @Test(enabled = true, priority = 1, description = "Launch Gradeup main app and select SSC & Railway")
    public void step1() {

        //Ignore saved account
        common.handleSavedAccountsPopup(driver);

        //Tap on the SSC & railway Button
        pageObject.SSCButton(driver).click();

        //Tap on English Radio Button
        pageObject.EnglishRadioButton(driver).click();

        //Tap on Done button
        pageObject.DoneButton(driver).click();
    }

    @Test(enabled = true, dataProvider = "registrationData", dataProviderClass = TestData.class, priority = 2, description = "Register using email.")
    public void step2(String name, String email, String password) throws InterruptedException {
        //Tap on register button
        pageObject.RegisterButton(driver).click();
        common.sleepFor(5);

        //Go to the back screen for registration form if choose an account popup is displayed
        if (pageObject.ChooseAnAccountPopup(driver).isDisplayed()) {
            driver.pressKey(new KeyEvent(AndroidKey.BACK));
        }

        //Enter Name
        pageObject.EnterNameTextBox(driver).sendKeys(name);

        //Enter Email
        pageObject.EnterEmailTextBox(driver).sendKeys(email);

        //Enter Password
        pageObject.EnterPasswordTextBox(driver).sendKeys(password);

        //Tab Register button
        pageObject.RegisterSubmitButton(driver).click();

        //Click on cross icon for mobile number verification
        try {
            common.sleepFor(5);
            pageObject.MobileNumberPopupCrossIcon(driver).click();
        } catch (Exception e) {
            System.out.println("Mobile Verification Modal not available");
        }
    }

    @Test(priority = 3, dataProvider = "changeExam", dataProviderClass = TestData.class, description = "Change exam to CTET & Teaching jobs")
    public void step3(String changeExam) throws InterruptedException {
        //Tap on Course Dropdown
        pageObject.CourseDropdownIcon(driver).click();

        //Tap on Plus icon
        pageObject.AddCourseIcon(driver).click();

        //Enter value in SearchBox
        pageObject.CourseSearchBox(driver).sendKeys(changeExam);

        //Select CTET value
        pageObject.CTETCourseIcon(driver).click();
    }

    @Test(priority = 4, description = "Click Turn On button from Are you preparing for CTET & Teaching jobs")
    public void step4() throws InterruptedException {
        //Tap on Turn on
        pageObject.TurnOnButton(driver).click();

        //Navigate to home screen
        pageObject.BackIcon(driver).click();
        common.sleepFor(2);
        pageObject.BackIcon(driver).click();
    }

    @Test(priority = 5, dataProvider = "changeExam", dataProviderClass = TestData.class, description = "Verify Top heading on page")
    public void step5(String examName) throws InterruptedException {
        //Get text from Heading
        common.sleepFor(4);
        String actualHeading = pageObject.CourseHeading(driver).getText();
        boolean isHeadingCorrect = actualHeading.toLowerCase().contains(examName);
        System.out.println(actualHeading);
        Assert.assertTrue(isHeadingCorrect);
    }

    @Test(priority = 6, description = "Click on Classroom page from bottom page selection icons")
    public void step6() throws InterruptedException {
        //Tap on Classroom
        pageObject.ClassRoomTab(driver).click();
    }

    @Test(priority = 7, description = "Click on VIEW COURSE for the second course")
    public void step7() throws InterruptedException {
        //Scroll to second course
        WebElement element = common.scrollToElementWithText(driver, "Weekly Assessments");
        //Scroll to View Course
        element = common.scrollToElementWithText(driver, "VIEW COURSE");
        element.click();
    }

    @Test(priority = 8, description = "Click on Start free trial")
    public void step8() throws InterruptedException {
        //Tap on start free trial if available
        try {
            pageObject.StartTrialButton(driver).click();
        } catch (Exception e) {
            //If Start Free Trial is not available
            System.out.println("Start Free Trial not available for this course.");
            Assert.assertTrue(false, "Start Free Trial not available for this course.");
        }
    }

    @Test(priority = 9, description = "Print the name of course and price on console")
    public void step9() throws InterruptedException {
        //Get text from course name
        String courseName = pageObject.CourseName(driver).getText();
        String batchPrice = pageObject.CourseBatchPrice(driver).getText();
        System.out.println("Course name: " + courseName + " Batch Price: " + batchPrice);
    }

}