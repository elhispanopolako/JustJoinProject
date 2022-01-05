package pl.justjoindemo.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pl.justjoindemo.utils.DriverFactory;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = DriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        driver.get("https://justjoin.it/");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/button/span[1]")).click();
    }
    /*@AfterMethod
    public void tearDown() {driver.quit();}*/
}


