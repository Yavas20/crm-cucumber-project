package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.sql.rowset.WebRowSet;

public class HomePage extends BasePage{

    @FindBy(xpath = "(//span[.='Task'])[2]")
    public WebElement taskModule;

    @FindBy(xpath = "//input[@data-bx-id='task-edit-title']")
    public WebElement thingsToDoPart;

    @FindBy(id = "tasks-task-priority-cb")
    public WebElement highPriorityCheckBox;


    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;

    @FindBy (id = "blogPostEditCreateTaskPopup_content")
    public WebElement taskCreatedMessage;

    @FindBy (xpath = "//div[.='The task name is not specified.']")
    public WebElement errorMessage;

    @FindBy(xpath = "(//span[@title='Cancel selection'])[1]")
    public WebElement deleteIcon;

    @FindBy(xpath = "(//div[@class='task-message-label error'])[2]")
    public WebElement errorMessage2;

}
