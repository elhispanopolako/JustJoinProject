package pl.justjoindemo.tests;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;
import pl.justjoindemo.pages.HeaderPage;
import pl.justjoindemo.pages.ResultsPage;

public class JuniorTesterTest extends BaseTest {
    @Test
    public void juniorOffersTest()  {
        HeaderPage headerPage=new HeaderPage(driver);
        headerPage.setTestTech();
        headerPage.setJuniorLevel();
        headerPage.setShowOffer();
        ResultsPage resultsPage=new ResultsPage(driver);
        resultsPage.chooseJobOffers(1);
        try {
            resultsPage.setForm("Tadeusz Woźniak", "tadeo98hiszpan@gmail.com");
            resultsPage.setCvUpload();
            resultsPage.sendApply();
        }catch (NoSuchElementException e){
            resultsPage.sendApply();
        }


    }
    @Test
    public void juniorOffersTest2()  {
        HeaderPage headerPage=new HeaderPage(driver);
        headerPage.setTestTech();
        headerPage.setJuniorLevel();
        headerPage.setShowOffer();
        ResultsPage resultsPage=new ResultsPage(driver);
        resultsPage.chooseJobOffers(2);
        try {
            resultsPage.setForm("Tadeusz Woźniak", "tadeo98hiszpan@gmail.com");
            resultsPage.setCvUpload();
            resultsPage.sendApply();
        }catch (NoSuchElementException e){
            resultsPage.sendApply();
        }


    }
}

