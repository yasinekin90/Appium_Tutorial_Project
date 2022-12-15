package appinstall;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExampleInstallAppAndroidEmulator  {
    public static void main(String[] args) throws InterruptedException {
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel3");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        desiredCapabilities.setCapability("appPackage","com.boopathy.raja.tutorial");
        desiredCapabilities.setCapability("appActivity","com.boopathy.raja.tutorial.Splash");

        AndroidDriver<AndroidElement> driver= null;
        try {
            driver = new AndroidDriver<>(new URL("http:127.0.0.1:4723/wd/hub"),desiredCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        driver.findElementById("com.android.permissioncontroller:id/continue_button").click();
        driver.findElementById("android:id/button1").click();
        driver.findElementById("android:id/home").click();

        List<AndroidElement> lists=driver.findElementsByXPath("//android.widget.ListView//android.widget.LinearLayout//android.widget.LinearLayout");

        //drag%drop
      lists.get(4).click();
      driver.findElementById("com.boopathy.raja.tutorial:id/Drag_and_Drop_Simple").click();


      WebElement drag1 =driver.findElementById("com.boopathy.raja.tutorial:id/DragDrop_Drag1");
      WebElement drop1 =driver.findElementById("com.boopathy.raja.tutorial:id/DragDrop_Drop1");
      WebElement drag2 =driver.findElementById("com.boopathy.raja.tutorial:id/DragDrop_Drag2");
      WebElement drop2 =driver.findElementById("com.boopathy.raja.tutorial:id/DragDrop_Drop2");
      WebElement drag3 =driver.findElementById("com.boopathy.raja.tutorial:id/DragDrop_Drag3");
      WebElement drop3 =driver.findElementById("com.boopathy.raja.tutorial:id/DragDrop_Drop3");
      TouchAction action=new TouchAction<>(driver);

        action.longPress(ElementOption.element(drag1)).moveTo(ElementOption.element(drop1)).release().perform();



        Thread.sleep(3000);



        // driver.quit();
    }
}
