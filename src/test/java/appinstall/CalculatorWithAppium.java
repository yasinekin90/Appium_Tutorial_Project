package appinstall;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class CalculatorWithAppium {
    public static void main(String[] args) {
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Galaxy J7 Prime");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.1.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        desiredCapabilities.setCapability("appPackage","com.sec.android.app.popupcalculator");
        desiredCapabilities.setCapability("appActivity","com.sec.android.app.popupcalculator.Calculator");

       // desiredCapabilities.setCapability(MobileCapabilityType.APP,"C:\\ApkFilesForTesting\\Apk Bilgisi_2.2.8_apkcombo.com.apk");
        AndroidDriver<AndroidElement> driver= null;
        try {
            driver = new AndroidDriver<>(new URL("http:127.0.0.1:4723/wd/hub"),desiredCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_08")).click();
        driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_06")).click();
        driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_07")).click();
        driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_add")).click();
        driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_08")).click();
        driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_06")).click();
        driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_07")).click();
        driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_equal")).click();
        String text = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/txtCalc")).getText();

        System.out.println(text);


        //driver.quit();
    }


}
