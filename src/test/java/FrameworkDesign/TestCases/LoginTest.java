package FrameworkDesign.TestCases;

import FrameworkDesign.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void loginByUser()
    {
        driver.findElement(By.xpath(OR.getProperty("Login_button")));

    }

}
