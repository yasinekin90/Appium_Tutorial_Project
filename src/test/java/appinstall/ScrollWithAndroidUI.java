package appinstall;

import appinstall.AndroidUIPackage.BaseAndroidUi;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.Test;

import java.util.List;

public class ScrollWithAndroidUI extends BaseAndroidUi {



    @Test
    public void scrollTest() {
        listView_quickscrollbar()
                .quickScrollBar()
                .scrollToListItem("Bhutan")
                .click();
    }



}