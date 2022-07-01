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

    @FindBy(xpath = "//div[@class='task-message-label error']")
    public WebElement errorMessage2;

    @FindBy (partialLinkText = "Add more" )
    public WebElement addButton;

    @FindBy(xpath = "//div[.='Cristopher Debua']")
    public WebElement morePersonal;

    @FindBy(xpath = "//div[.='helpdesk22@cybertekschool.com']")
    public WebElement moreMorePersonal;

    @FindBy (xpath = "(//span[@class='task-item-index'])[1]")
    public WebElement ongoingTest;



}
