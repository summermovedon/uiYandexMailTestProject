package com.gismatullin.mailtestproject.businessobjects;

import static com.gismatullin.mailtestproject.testhelper.TestHelper.EMAIL_THEME;
import static com.gismatullin.mailtestproject.testhelper.TestHelper.LOGIN;
import static com.gismatullin.mailtestproject.testhelper.TestHelper.SEARCH_QUERY;
import static com.gismatullin.mailtestproject.testhelper.TestHelper.getDriver;

import com.gismatullin.mailtestproject.pageobjects.MailBoxPage;

import org.openqa.selenium.Keys;

public class MailBoxPageBO {

    private MailBoxPage page = new MailBoxPage();

    public void sendTestEmail(String body) {
        page.composeButton.click();
        page.addressRow.sendKeys(LOGIN);
        page.themeRow.sendKeys(EMAIL_THEME);
        page.messageBody.click(); // focus to message body form
        page.messageBody.sendKeys(body);
        page.sendButton.click(); // send test email
        page.doneLink.click();
    }

    public int countTestEmails() {
        String searchQuery = SEARCH_QUERY + "\"" + EMAIL_THEME + "\"";
        page.searchInput.clear();
        page.searchInput.sendKeys(searchQuery + Keys.ENTER);
        if (!page.searchResult.isDisplayed()) {
            String msg = "No search results are found";
            System.err.println(msg);
            throw new RuntimeException(msg);
        }
        return getDriver().findElements(page.testEmailsThemeBy).size(); // return count of found emails
    }

    public void logout() {
        page.userPic.click();
        page.logoutRow.click();
    }
    
}
