package com.gismatullin.mailtestproject.tests;

import static com.gismatullin.mailtestproject.testhelper.TestHelper.LOGIN;
import static com.gismatullin.mailtestproject.testhelper.TestHelper.PASSW;
import static com.gismatullin.mailtestproject.testhelper.TestHelper.clean;
import static com.gismatullin.mailtestproject.testhelper.TestHelper.setup;
import static org.testng.Assert.assertEquals;

import com.gismatullin.mailtestproject.businessobjects.MailBoxPageBO;
import com.gismatullin.mailtestproject.businessobjects.StartPageBO;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MainTest {

    @BeforeClass
    public void tearUp() {
        setup();
    }

    @Test
    public void sendingTestEmail() {
        MailBoxPageBO mailBoxPageBO = new StartPageBO().login(LOGIN, PASSW);
        int testEmailsNumber = mailBoxPageBO.countTestEmails();
        mailBoxPageBO.sendTestEmail("test emails number : " + testEmailsNumber);
        int newTestEmailsNumber = mailBoxPageBO.countTestEmails();
        int actual = newTestEmailsNumber - testEmailsNumber;
        mailBoxPageBO.logout();
        assertEquals(actual, 1);
    }

    @AfterClass
    public void tearDown() {
        clean();
    }
}
