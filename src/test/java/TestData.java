import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "registrationData")
    public Object[][] getGoogleData(){
        return new Object[][]
                {
                        {"Test Test","jft0justfortesting@gmail.com","testpassword"}

                };

    }

    @DataProvider(name = "changeExam")
    public Object[][] getYahooData(){
        return new Object[][]
                {
                        {"ctet"}
                };

    }
}
