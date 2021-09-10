package Testology;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class WaitConcepts {
    private WebDriver driver;
    private String baseUrl;
    private WebElement TechLift_Test,Login_button,email_textbox,password_textbox,login_button,signup_button,forgot_button;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() throws Exception
    {
        System.setProperty("webdriver.gecko.driver","src/test/src/geckodriver.exe");
        driver=new FirefoxDriver();
        baseUrl="https://Test.techlift.in";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void TestTitle()
    {
        Date objDate =new Date();
        System.out.println(objDate.toString());
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("AFter 30 sec wait  "+objDate.toString());
        // xpath of search text bar= //div[@class="RNNXgb"]
        login_button= driver.findElement(By.xpath("//a[@href='login']"));

        /*element1= driver.findElement(By.xpath("//div[@class='RNNXgb']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("element1")));
        element1.sendKeys("Automation testing");*/
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("login_button")));
        System.out.println(objDate);
    }


}
