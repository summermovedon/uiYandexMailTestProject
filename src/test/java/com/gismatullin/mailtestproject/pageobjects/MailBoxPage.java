package com.gismatullin.mailtestproject.pageobjects;

import static com.gismatullin.mailtestproject.testhelper.TestHelper.getDriver;
import static com.gismatullin.mailtestproject.testhelper.TestHelper.EMAIL_THEME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailBoxPage {

    @FindBy(className = "mail-ComposeButton-Text")
    public WebElement composeButton;
    @FindBy(className = "ComposePopup-Content")
    public WebElement composeForm;
    @FindBy(className = "composeYabbles")
    public WebElement addressRow;
    @FindBy(className = "ComposeSubject-TextField")
    public WebElement themeRow;
    @FindBy(className = "cke_wysiwyg_div")
    public WebElement messageBody;
    @FindBy(css = "div.ComposeSendButton button")
    public WebElement sendButton;
    @FindBy(className = "textinput__control")
    public WebElement searchInput;
    @FindBy(className = "mail-MessagesSearchInfo-Title")
    public WebElement searchResult;
    @FindBy(css = "button.search-input__narrow-close-button")
    public WebElement clearSearchQuery;
    @FindBy(css = "a.ComposeDoneScreen-Link")
    public WebElement doneLink;
    @FindBy(className = "mail-ComposeButton-Refresh")
    public WebElement refreshButton;
    @FindBy(css = "div.mail-Toolbar-Item_delete")
    public WebElement deleteMailButton;
    @FindBy(className = "legouser__current-account")
    public WebElement userPic;
    @FindBy(className = "legouser__menu-item_action_exit")
    public WebElement logoutRow;
    // Using By because @FindBy attribute must be constant
    public final By testEmailsThemeBy = By.xpath(
        String.format("//span[@title='%s']", EMAIL_THEME));

    public MailBoxPage() {
        PageFactory.initElements(getDriver(), this);
    }

}
