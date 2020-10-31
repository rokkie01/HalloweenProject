package com.cybertek.tests.day11_utils_review_actions;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_17 {

//1.Go	to	https://demos.telerik.com/kendo-ui/dragdrop/index
// 2.Drag	and	drop	the	small	circle	to	bigger	circle.
// 3.Assert:	-Text	in	big	circle	changed to:	“You	did	great!

    @Test
    public void drag_drop(){
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement smallCircle = Driver.getDriver().findElement
                (By.id("draggable"));
        WebElement targetCircle = Driver.getDriver().findElement
                (By.id("droptarget"));

      Actions actions = new Actions(Driver.getDriver());

      actions.dragAndDrop(smallCircle, targetCircle).perform();
      
      Assert.assertTrue(targetCircle.getText().equals("You did great!"));

    }
}
