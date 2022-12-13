package appinstall;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class phoneCallApp {
    public static void main(String[] args) throws InterruptedException {
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel3");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        desiredCapabilities.setCapability("appPackage","com.android.dialer");
        desiredCapabilities.setCapability("appActivity","com.android.dialer.app.DialtactsActivity");

       // desiredCapabilities.setCapability(MobileCapabilityType.APP,"C:\\ApkFilesForTesting\\Apk Bilgisi_2.2.8_apkcombo.com.apk");
        AndroidDriver<AndroidElement> driver= null;
        try {
            driver = new AndroidDriver<>(new URL("http:127.0.0.1:4723/wd/hub"),desiredCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


       //call by dialing a number
       /* driver.findElementById("com.android.dialer:id/fab").click();
        driver.findElementById("com.android.dialer:id/digits_container").click();
        Thread.sleep(3000);
        driver.findElementById("com.android.dialer:id/digits").sendKeys("1234567");
           driver.findElementByAccessibilityId("dial").click();
        Thread.sleep(3000);

        driver.findElementById("com.android.dialer:id/incall_end_call").click();*/


        // call with contact name
        driver.findElementById("com.android.dialer:id/contacts_tab").click();
        driver.findElementByXPath("//android.widget.QuickContactBadge[@content-desc=\"Quick contact for Abdullah Ataseven\"]").click();
        driver.findElementById("com.android.contacts:id/icon").click();
        Thread.sleep(3000);
        driver.findElementById("com.android.dialer:id/incall_end_call").click();




        //driver.quit();
    }


}
