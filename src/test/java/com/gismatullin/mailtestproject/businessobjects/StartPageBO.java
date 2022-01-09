package com.gismatullin.mailtestproject.businessobjects;

import com.gismatullin.mailtestproject.pageobjects.StartPage;
import com.gismatullin.mailtestproject.testhelper.TestHelper;

import org.openqa.selenium.Keys;

public class StartPageBO {

    private StartPage page = new StartPage();

    public MailBoxPageBO login(String login, String password) {
        page.startLoginButton.click();
        page.loginInput.sendKeys(TestHelper.LOGIN + Keys.RETURN);
        page.passwInput.sendKeys(TestHelper.PASSW + Keys.RETURN);
        // Utils.waitOpeningPage(driver); //waiting for mail box page loading
        return new MailBoxPageBO();
    }
    
}
