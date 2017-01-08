package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Zahid on 1/7/2017.
 */
public class TestCnnHome extends CommonAPI {

    @Test
    public void testHome(){
        clickByXpath(".//*[@id='nav']/div[2]/div[2]/a[2]");
        //driver.findElement(By.xpath(".//*[@id='nav']/div[2]/div[2]/a[2]")).click();

        //clickByXpath(".//*[@id='nav']/div[2]/div[2]/a[3]");
        //driver.findElement(By.xpath(".//*[@id='nav']/div[2]/div[2]/a[3]")).click();
    }
}
