package appinstall.AndroidUIPackage;

import appinstall.AndroidUIPackage.BaseAndroidUi;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LocatorsofAndroidUI extends BaseAndroidUi implements AndroidUiElements {


    public static void simpleDragDrop(){
        List<AndroidElement> list=driver.findElements(listElement);
        list.get(4).click();
        AndroidElement dragandDropSimple=driver.findElement(drag_and_Drop_Simple);
        dragandDropSimple.click();
    }

    public static void dragAndDrop(WebElement drag,WebElement drop){
        TouchAction action=new TouchAction<>(driver);
        action.longPress(ElementOption.element(drag)).moveTo(ElementOption.element(drop)).release().perform();

    }

    public static WebElement dragElement(int dragNumber){
        String dragStr="com.boopathy.raja.tutorial:id/DragDrop_Drag"+dragNumber;

        return driver.findElementById(dragStr);
    }

    public static WebElement dropElement(int dropNumber){
        String dropStr="com.boopathy.raja.tutorial:id/DragDrop_Drop"+dropNumber;

        return driver.findElementById(dropStr);
    }







}
