package pl.justjoindemo.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.justjoindemo.pages.HeaderPage;
import pl.justjoindemo.pages.SignInPage;

import java.util.List;
import java.util.Set;

public class SignUpTest extends BaseTest{

    @Test
public void signUpWithoutDataTest(){
        HeaderPage headerPage=new HeaderPage(driver);
        headerPage.setsignUp();
        SignInPage signInPage=new SignInPage(driver);
        signInPage.setSignUp(" ","");
        Assert.assertEquals(signInPage.emailAsert.getText(),"Email is a required field");
        Assert.assertEquals(signInPage.passAsert.getText(),"Password is a required field");

    }
}




