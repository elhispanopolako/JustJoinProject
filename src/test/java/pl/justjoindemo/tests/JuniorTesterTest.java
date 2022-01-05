package pl.justjoindemo.tests;

import org.testng.annotations.Test;
import pl.justjoindemo.pages.HeaderPage;

public class JuniorTesterTest extends BaseTest {
    @Test
    public void juniorOffersTest()  {
        HeaderPage headerPage=new HeaderPage(driver);
        headerPage.setTestTech();
        headerPage.setJuniorLevel();
        headerPage.setShowOffer();

      /*
       WebElement oferChoose=driver.findElement(By.xpath("//*[@id='root']/div[2]/div[1]/div/div[2]/div[1]/div/div/div[4]/a/div/div[2]/div[1]/div[1]/div"));
       oferChoose.click();
       Thread.sleep(1000);
       WebElement nameInput=driver.findElement(By.xpath("//*[@id='offer-apply-container']/form/div[1]/div[1]/div/div[2]/div/input"));
       nameInput.sendKeys("Tadeusz Woźniak");
       WebElement emailInput= driver.findElement(By.xpath("//*[@id='offer-apply-container']/form/div[1]/div[2]/div/div[2]/div/input"));
       emailInput.sendKeys("tadeo98hiszpan@gmail.com");
       WebElement textInput= driver.findElement(By.xpath("//*[@id='offer-apply-container']/form/div[1]/div[3]/div[2]/div/textarea[1]"));
       textInput.sendKeys("Dzień dobry, z góry prepraszam za tą aplikację jestem w trakcie nauki selenium i tą aplikację wysyłam automatycznie. Byłbym bardzo zadowolony i wdzięczny gdybym dostał od państwa odpowiedź z informacją czy doszło poprawnie oraz co poprawić w kodzie link do aktualnego testu w github-->https://github.com/elhispanopolako/Selenium-tutorial/blob/5eaa123be74e11562812b644e1084a0f91246526/src/test/java/JustJoinTest.java oraz mój linkedin-->https://www.linkedin.com/in/tadeusz-wo%C5%BAniak-3162a217a/  pozdrawiam Miłego dnia Tadeusz Woźniak");
       WebElement sendApply= driver.findElement(By.xpath("//*[@id=\"offer-apply-container\"]/form/div[3]/div[1]/button/span[1]"));
       sendApply.click();*/

    }
}

