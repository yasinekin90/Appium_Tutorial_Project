package appinstall.AndroidUIPackage;

import org.openqa.selenium.By;

public interface AndroidUiElements {

    By continueButton= By.id("com.android.permissioncontroller:id/continue_button");
    By button1= By.id("android:id/button1");
    By home= By.id("android:id/home");
    By listElement=By.xpath("//android.widget.ListView//android.widget.LinearLayout//android.widget.LinearLayout");
    By drag_and_Drop_Simple=By.id("com.boopathy.raja.tutorial:id/Drag_and_Drop_Simple");
    By quickScrollBar=By.id("com.boopathy.raja.tutorial:id/List_ScrollQuick");

}
