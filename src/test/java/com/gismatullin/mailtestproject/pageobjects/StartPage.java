package com.gismatullin.mailtestproject.pageobjects;

import static com.gismatullin.mailtestproject.testhelper.TestHelper.getDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage {
    
    @FindBy(className = "HeadBanner-Button-Enter")
    public WebElement startLoginButton;
    @FindBy(id = "passp-field-login")
    public WebElement loginInput;
    @FindBy(id = "passp-field-passwd")
    public WebElement passwInput;

    public StartPage() {
        PageFactory.initElements(getDriver(), this);
    }

}
