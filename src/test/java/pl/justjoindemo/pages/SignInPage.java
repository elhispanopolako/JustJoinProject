package pl.justjoindemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
    @FindBy(name ="email")
    private WebElement emailInput;
    @FindBy(name="password")
    private WebElement passInput;
    @FindBy(xpath = "//span[@class='MuiFab-label' and text()='Sign in']")
    private WebElement signUpbtn;
    @FindBy(xpath = "//a[text()='Register']")
    private WebElement registerBtn;
    @FindBy(xpath = "//span[text()='Email is a required field' or text()='Email must be a valid email']")
    public WebElement emailAsert;
    @FindBy(xpath = "//span[text()='Password is a required field' or text()='Password must be at least 6 characters']")
    public WebElement passAsert;


    private WebDriver driver;

    public SignInPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }
    public void setSignUp(String email,String password){
        emailInput.sendKeys(email);
        passInput.sendKeys(password);
        signUpbtn.click();
    }

}
