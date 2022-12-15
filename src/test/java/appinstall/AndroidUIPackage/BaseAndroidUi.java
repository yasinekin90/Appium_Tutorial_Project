package appinstall.AndroidUIPackage;

import appinstall.ScrollWithAndroidUI;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static appinstall.AndroidUIPackage.LocatorsofAndroidUI.*;

public class BaseAndroidUi implements AndroidUiElements {

    protected static AndroidDriver<AndroidElement> driver;
    @BeforeTest
    public void beforeTest() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel3");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability("appPackage", "com.boopathy.raja.tutorial");
        desiredCapabilities.setCapability("appActivity", "com.boopathy.raja.tutorial.Splash");

        driver = null;
        try {
            driver = new AndroidDriver<>(new URL("http:127.0.0.1:4723/wd/hub"), desiredCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }



        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(continueButton).click();
        driver.findElement(button1).click();
        driver.findElement(home).click();

    }


    @AfterTest
    public void afterTest() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }




    public BaseAndroidUi listView_quickscrollbar() {
        List<AndroidElement> list = driver.findElements(listElement);
        list.get(5).click();

        return this;
    }

    public BaseAndroidUi quickScrollBar() {

        AndroidElement scrollBarButton = driver.findElement(quickScrollBar);
        scrollBarButton.click();
        return this;
    }

    public AndroidElement scrollToListItem(String str) {
        AndroidElement PermissionElement = driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"" + str + "\"))");

        return PermissionElement;
    }





}
