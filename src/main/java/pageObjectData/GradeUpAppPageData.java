package pageObjectData;

public class GradeUpAppPageData {

    //Entry Screen
    public static final String SSCButtonXpath = "//*[@class = 'android.view.ViewGroup'][3]";

    //Language Popup
    public static final String EnglishRadioButtonXpath = "//*[@class='android.widget.RadioButton'][1]";

    public static final String DoneButtonXpath = "(//*[@class = 'android.widget.TextView'])[3]";

    //login or Register Screen
    public static final String RegisterButtonXpath = "//*[@class='android.widget.TextView'][5]";

    public static final String SavedAccountsPopupId = "com.google.android.gms:id/cancel";

    //Choose An account popup
    public static final String ChooseAnAccountPopupId = "com.google.android.gms:id/account_picker_container";

    //Registration screen
    public static final String EnterNameTextBoxXpath = "(//*[@class='android.widget.EditText'])[1]";

    public static final String EnterEmailTextBoxXpath = "(//*[@class='android.widget.EditText'])[2]";

    public static final String EnterPasswordTextBoxXpath = "(//*[@class='android.widget.EditText'])[3]";

    public static final String RegisterSubmitButtonXpath = "(//*[@class = 'android.widget.TextView'])[6]";

    //Mobile Number Verification Popup
    public static final String MobileNumberPopupCrossIconXpath = "(//*[@class = 'android.widget.ImageView'])[1]";

    //Home screen
    public static final String CourseDropdownIconXpath = "(//*[@class='android.widget.RelativeLayout'][1]/*[@class='android.widget.ImageView'])[2]";

    public static final String CourseHeadingXpath = "(//*[@class='android.widget.RelativeLayout'][1]/*[@class='android.widget.TextView'])[1]";

    public static final String AddCourseIconXpath = "(//*[@class = 'android.view.View'])[1]";

    public static final String CourseSearchBoxXpath = "//*[@class = 'android.widget.EditText']";

    public static final String CTETCourseIconXpath = "(//*[@class='android.view.ViewGroup']/*[@class='android.widget.TextView'])[2]/..";

    //TurnOn Popup
    public static final String TurnOnButtonID = "co.gradeup.android:id/topBtn";

    //Back Icon
    public static final String BackIconXpath = "(//*[@class = 'android.widget.ImageView'])[1]";

    //ClassRoom
    public static final String ClassRoomTabID = "co.gradeup.android:id/view_profile";

    public static final String StartTrialButtonID = "co.gradeup.android:id/startTrial";

    public static final String CourseNameXpath = "//*[@class='android.widget.LinearLayout']/*[@class='android.view.ViewGroup']/*[@class='android.widget.TextView']";

    public static final String CourseBatchPriceId = "co.gradeup.android:id/batchPrice";

}
