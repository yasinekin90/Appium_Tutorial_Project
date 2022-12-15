package appinstall.AndroidUIPackage;

import org.testng.annotations.Test;
import static appinstall.AndroidUIPackage.LocatorsofAndroidUI.*;

public class AndroidUITest extends BaseAndroidUi {


    @Test
    public void fromDrag1toDrop1(){
     dragAndDrop(dragElement(1),dropElement(1));
    }

    @Test
    public void fromDrag2toDrop2(){
        dragAndDrop(dragElement(2),dropElement(2));
    }




}
