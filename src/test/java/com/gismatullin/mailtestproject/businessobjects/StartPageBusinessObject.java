package com.gismatullin.mailtestproject.businessobjects;

import com.gismatullin.mailtestproject.pageobjects.StartPage;
import com.gismatullin.mailtestproject.testhelper.TestHelper;

import org.openqa.selenium.Keys;

public class StartPageBusinessObject {

    private StartPage page = new StartPage();

    public MailBoxPageBusinessObject login(String login, String password) {
        page.startLoginButton.click();
        page.loginInput.sendKeys(TestHelper.login + Keys.RETURN);
        page.passwInput.sendKeys(TestHelper.passw + Keys.RETURN);
        return new MailBoxPageBusinessObject();
    }
    
}
