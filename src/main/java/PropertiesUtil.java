import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
    /**
     * Method to load property files
     */
    public void loadProperties(){
        Properties prop = new Properties();
        InputStream input = null;
        try {
            input = new FileInputStream("config.properties");
            // load a properties file
            prop.load(input);
            String platformName = prop.getProperty("platformName");
            System.setProperty("platformName", platformName);
            String platformVersion = prop.getProperty("platformVersion");
            System.setProperty("platformVersion", platformVersion);
            String deviceName = prop.getProperty("deviceName");
            System.setProperty("deviceName", deviceName);
            String automationName = prop.getProperty("automationName");
            System.setProperty("automationName", automationName);
            String appPackage = prop.getProperty("appPackage");
            System.setProperty("appPackage", appPackage);
            String appActivity = prop.getProperty("appActivity");
            System.setProperty("appActivity", appActivity);
            String implicitWaitTimeoutSeconds = prop.getProperty("implicitWaitTimeoutSeconds");
            System.setProperty("implicitWaitTimeoutSeconds", implicitWaitTimeoutSeconds);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * Method to get Platform name
     * @return
     */
    public String getPlatformName(){
        String property = System.getProperty("platformName");
        return property;
    }

    /**
     * Method to get Platform version
     * @return
     */
    public String getPlatformVersion(){
        String property = System.getProperty("platformVersion");
        return property;
    }

    /**
     * Method to get Device Name
     * @return
     */
    public String getDeviceName(){
        String property = System.getProperty("deviceName");
        return property;
    }

    /**
     * Method to get Automation Name
     * @return
     */
    public String getAutomationName(){
        String property = System.getProperty("automationName");
        return property;
    }

    /**
     * Method to get App Package
     * @return
     */
    public String getAppPackage(){
        String property = System.getProperty("appPackage");
        return property;
    }

    /**
     * Method to get App Activity
     * @return
     */
    public String getAppActivity(){
        String property = System.getProperty("appActivity");
        return property;
    }
    /**
     * Method to get Implicit Wait Timeout
     * @return
     */
    public int getImplicitWaitTimeoutSeconds(){
        int property = Integer.parseInt(System.getProperty("implicitWaitTimeoutSeconds"));
        return property;
    }

}
