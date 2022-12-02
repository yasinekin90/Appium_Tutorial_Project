package appinstall;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ExampleInstallAppAndroidRealDevice {
    public static void main(String[] args) {
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Galaxy J7 Prime");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.1.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        /*desiredCapabilities.setCapability("autoGrantPermission","true");
        desiredCapabilities.setCapability("noReset","true");*/

        desiredCapabilities.setCapability(MobileCapabilityType.APP,"C:\\ApkFilesForTesting\\apidemos.apk");
        AndroidDriver<AndroidElement> driver= null;
        try {
            driver = new AndroidDriver<>(new URL("http:127.0.0.1:4723/wd/hub"),desiredCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.quit();
    }
}
