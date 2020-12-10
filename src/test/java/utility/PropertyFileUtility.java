package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class PropertyFileUtility {

    protected static Properties browserProperties;
    protected static Properties loginCredentialsProperties;
    protected static Properties UserMgmntProperties;

    public static void initializeBrowserProperties() throws IOException {
        browserProperties = new Properties();
        File file = new File("src//test//resources//BrowserConfig.Properties");
        FileInputStream fis = new FileInputStream(file);
        browserProperties.load(fis);
    }

    public static void initializeLoginCredentialProperties() throws IOException {
        loginCredentialsProperties = new Properties();
        File file = new File("src/test/resources/LoginTestData.properties");
        FileInputStream fis = new FileInputStream(file);
        loginCredentialsProperties.load(fis);
    }


    public static String getBrowser() {
        return browserProperties.getProperty("Browser");
    }

    public static String getBrowserProperties() {
        return browserProperties.getProperty("ChromeProp");
    }

    public static String getBrowserDriverPath() {
        return browserProperties.getProperty("ChromePath");
    }

    public static String getUserEmail() {
        return loginCredentialsProperties.getProperty("email");
    }

    public static String getUserPassword() {
        return loginCredentialsProperties.getProperty("password");
    }

    public static String getTestRunLocation() {
        return browserProperties.getProperty("Location");
    }

}
