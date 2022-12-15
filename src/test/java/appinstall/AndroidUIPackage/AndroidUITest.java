package appinstall.AndroidUIPackage;

import org.testng.annotations.Test;
import static appinstall.AndroidUIPackage.LocatorsofAndroidUI.*;

public class AndroidUITest extends BaseAndroidUi {


    @Test(priority = 1)
    public void fromDrag1toDrop1(){
        simpleDragDrop();
     dragAndDrop(dragElement(1),dropElement(1));
    }

    @Test(priority = 2)
    public void fromDrag2toDrop2(){
        dragAndDrop(dragElement(2),dropElement(2));
    }




}
