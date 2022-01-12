package pl.justjoindemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;


public class ResultsPage {
    @FindBy(xpath="//div[contains(text(),'Tester') or contains(text(),'Q')]")
    private List<WebElement> jobOffers;
    @FindBy(xpath ="//*[@id='offer-apply-container']/form/div[1]/div[1]/div/div[2]/div/input" )
    private WebElement nameInput;
    @FindBy(xpath ="//*[@id='offer-apply-container']/form/div[1]/div[2]/div/div[2]/div/input" )
    private WebElement emailInput;
    @FindBy(xpath ="//*[@id='offer-apply-container']/form/div[1]/div[3]/div[2]/div/textarea[1]" )
    private WebElement textInput;
    @FindBy(xpath = "//*[@id='offer-apply-container']/form/div[1]/div[4]/div/div[2]//input")
    private WebElement cvUpload;
    @FindBy(xpath ="//span[text()='Apply']")
    private WebElement sendApply;



    public ResultsPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void chooseJobOffers(int number){
        jobOffers.get(number).click();
    }
    public void setForm(String name,String email){
        nameInput.sendKeys(name);
        emailInput.sendKeys(email);
    }
    public void setCvUpload(){

        cvUpload.sendKeys("C:\\Users\\Toshiba\\Downloads\\CVUA1.pdf");
    }

    public boolean setTextInput() {
        textInput.isEnabled();
        return false;
    }

    public void sendApply(){
        sendApply.isDisplayed();
    }
}
