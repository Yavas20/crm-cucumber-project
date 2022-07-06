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

    @FindBy(xpath = "//span[.='Checklist']")
    public WebElement checklist;

    @FindBy (xpath = "//span[@class='task-checklist-form-vpadding']//input[@type='text']")
    public WebElement checklistInputBox;

    @FindBy(xpath = "//span[@class='js-id-checklist-is-form-submit block-edit tasks-btn-apply task-field-title-ok']")
    public WebElement tickButton;

    @FindBy(xpath = "//span[@class='js-id-checklist-is-open-form task-dashed-link-inner']")
    public WebElement checklistAddButton;

    @FindBy(xpath = "//input[@class='js-id-checklist-is-i-toggle task-checklist-field-checkbox']")
    public WebElement checklistTickBox;

    @FindBy(xpath = "//span[@class='js-id-checklist-toggle-complete task-checklist-subtitle-arrow']")
    public WebElement completedMessage;

    @FindBy(xpath = "(//input[@class='task-options-inp'])[1]")
    public WebElement deadlineInputBox;

    @FindBy(linkText = "14")
    public WebElement validDeadlineTime;

    @FindBy(xpath = "//span[.='Select']")
    public WebElement selectButton;

    @FindBy(xpath = "//input[@name='ACTION[0][ARGUMENTS][data][DEADLINE]']")
    public WebElement deadlineOutput;

    @FindBy(linkText = "5")
    public WebElement invalidDeadlineTime;

    @FindBy(xpath = "//span[.='Time planning']")
    public WebElement timePlanning;

    @FindBy(xpath = "(//input[@class='task-options-inp'])[2]")
    public WebElement startTaskOn;

    @FindBy(xpath = "//a[.='14']")
    public WebElement validStartTime;

    @FindBy(xpath = "(//input[@class='task-options-inp'])[3]")
    public WebElement durationInputBox;

    @FindBy(xpath = "//span[.='days']")
    public WebElement daysButton;

    @FindBy(xpath = "(//input[@class='task-options-inp'])[4]")
    public WebElement finishTime;

    @FindBy(xpath = "//input[@name='ACTION[0][ARGUMENTS][data][END_DATE_PLAN]']")
    public WebElement finishTimeOutput;








}
