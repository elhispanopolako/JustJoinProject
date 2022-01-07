package pl.justjoindemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage {
    @FindBy(xpath = "//span[contains(text(),'Testing')]")
    private WebElement techChooseTesting;
    @FindBy(xpath = "//span[contains(text(),'More filters')]")
    private WebElement moreFilters;
    @FindBy(xpath = "//span[contains(text(),'Junior')]")
    private WebElement juniorLevel;
    @FindBy(xpath = "//span[contains(text(),'Show offers')]")
    private WebElement showOffer;
   @FindBy(xpath ="//span[text()='Sign in']")
    private WebElement signUpBtn;
   @FindBy(xpath = "//span[text()='Sign in as a developer']")
   private WebElement signUp2Btn;

    private WebDriver driver;

    public HeaderPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }
    public void setTestTech() {
        techChooseTesting.click();
    }
    public void setJuniorLevel(){
        moreFilters.click();
        juniorLevel.click();
    }
    public void setShowOffer(){
        showOffer.click();
    }
    public void setsignUp(){
        signUpBtn.click();
        signUp2Btn.click();
    }
}
