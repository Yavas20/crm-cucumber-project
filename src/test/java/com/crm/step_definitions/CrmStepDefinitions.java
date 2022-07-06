package com.crm.step_definitions;

import com.crm.pages.HomePage;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.velocity.runtime.directive.Parse;
import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.interactions.Actions;

public class CrmStepDefinitions {

    HomePage homePage = new HomePage();

    @Given("User is on the homepage")
    public void user_is_on_the_homepage() {
        //homePage.login();

        Driver.getDriver().get(ConfigurationReader.getProperty("crm.url"));

        homePage.login();

       /* homePage.usernameInput.clear();
        homePage.usernameInput.sendKeys(ConfigurationReader.getProperty("crm.username"));
        homePage.passwordInput.clear();
        homePage.passwordInput.sendKeys(ConfigurationReader.getProperty("crm.pw"));
        homePage.loginButton.click();*/
    }

    @When("user clicks on the Task")
    public void user_clicks_on_the_task() {

        homePage.taskModule.click();

    }

    @When("user enters a Task name")
    public void user_enters_a_task_name() {

        homePage.thingsToDoPart.sendKeys("My Task");

    }

    @When("user adds at least one responsible person")
    public void user_adds_at_least_one_responsible_person() {


    }

    @When("user clicks on High Priority checkbox button")
    public void user_clicks_on_high_priority_checkbox_button() {

        homePage.highPriorityCheckBox.click();

    }

    @When("user clicks on the send button")
    public void user_clicks_on_the_send_button() {

        homePage.sendButton.click();

    }

    @Then("{string} pop-up message is displayed")
    public void pop_up_message_is_displayed(String message) {

        Assert.assertTrue(homePage.taskCreatedMessage.getText().contains(message));

    }


    @Then("{string} error message is displayed")
    public void errorMessageIsDisplayed(String message) {

        Assert.assertTrue(homePage.errorMessage.getText().contains(message));

    }


    @Then("{string} errorPerson message is displayed")
    public void errorpersonMessageIsDisplayed(String message) {

        Assert.assertTrue(homePage.errorMessage2.isDisplayed());
    }

    @And("user clicks the responsible person button")
    public void userClicksTheResponsiblePersonButton() {

        homePage.deleteIcon.click();

    }

    @And("user adds two responsible person")
    public void userAddsTwoResponsiblePerson() {

        homePage.addButton.click();
        homePage.morePersonal.click();

    }

    @And("user adds three responsible person")
    public void userAddsThreeResponsiblePerson() {
        homePage.addButton.click();
        homePage.morePersonal.click();
        homePage.moreMorePersonal.click();

    }

    @Then("The task created can be seen on the count under MY TASKS table")
    public void theTaskCreatedCanBeSeenOnTheCountUnderMYTASKSTable() {

        int expectedTask = 72;

        try{
            int actualTask = Integer.parseInt(homePage.ongoingTest.getText());

            System.out.println(actualTask);

            Assert.assertEquals(expectedTask, actualTask);
        } catch(StaleElementReferenceException e){
            e.printStackTrace();
        }


    }

    @When("user clicks on checklist")
    public void user_clicks_on_checklist() {

        homePage.checklist.click();

    }

    @When("user enters something into checklist inputbox")
    public void user_enters_something_into_checklist_inputbox() {

        homePage.checklistInputBox.sendKeys("Test");

    }

    @When("user clicks on ✓ sign or add")
    public void user_clicks_on_sign_or_add() {

        //homePage.tickButton.click();
        homePage.addButton.click();

    }

    @When("user clicks on the checkbox button shown above the checklist inputbox")
    public void user_clicks_on_the_checkbox_button_shown_above_the_checklist_inputbox() {

        homePage.checklistAddButton.click();

    }

    @Then("the {string} message including the number of checklists inside the parentheses is displayed")
    public void the_message_including_the_number_of_checklists_inside_the_parentheses_is_displayed(String message) {

        Assert.assertTrue(message.contains(homePage.completedMessage.getText().toLowerCase()));

    }

    @When("user clicks on deadline inputbox")
    public void user_clicks_on_deadline_inputbox() {

        homePage.deadlineInputBox.click();

    }

    @And("user enters some valid time such as {string} and doubleclick or click on the select button")
    public void userEntersSomeValidTimeSuchAsAndDoubleclickOrClickOnTheSelectButton(String deadline) {

        Actions actions = new Actions( Driver.getDriver());
        actions.doubleClick(homePage.validDeadlineTime).perform();
        //homePage.validDeadlineTime.click();
        //homePage.selectButton.click();
    }

    @Then("the provided {string} is displayed on the deadline input box")
    public void theProvidedIsDisplayedOnTheDeadlineInputBox(String deadline) {

        System.out.println("Hellooooooooooo");

        System.out.println(homePage.deadlineOutput.getAttribute("value"));

        Assert.assertTrue(homePage.deadlineOutput.getAttribute("value").contains(deadline));


    }

    @And("user enters some invalid time such as {string}")
    public void userEntersSomeInvalidTimeSuchAs(String invalidDeadline) {

        homePage.invalidDeadlineTime.click();
        homePage.selectButton.click();

    }

    @Then("user cannot doubleclick or click on the select button and the provided {string} is not displayed on the deadline input box")
    public void userCannotDoubleclickOrClickOnTheSelectButtonAndTheProvidedIsNotDisplayedOnTheDeadlineInputBox(String invalidDeadline) {

        System.out.println(homePage.deadlineOutput.getAttribute("value"));

        Assert.assertFalse(homePage.deadlineOutput.getAttribute("value").contains(invalidDeadline));

    }


    @And("user clicks on Time planning")
    public void userClicksOnTimePlanning() {

        homePage.timePlanning.click();
        homePage.timePlanning.click();
    }

    @And("user enters valid start time {string} on the start task on inputbox")
    public void userEntersValidStartTimeOnTheStartTaskOnInputbox(String startTime) {
        homePage.startTaskOn.click();

        Actions actions = new Actions( Driver.getDriver());
        actions.doubleClick(homePage.validStartTime).perform();

    }

    @And("user enters {string} on the duration inputbox and clicks on the days")
    public void userEntersOnTheDurationInputboxAndClicksOnTheDays(String duration) {

        homePage.durationInputBox.sendKeys(1+"");
        homePage.daysButton.click();
    }



    @Then("the {string} is displayed on the finish inputbox depending on the provided start time and duration type.")
    public void theIsDisplayedOnTheFinishInputboxDependingOnTheProvidedStartTimeAndDurationType(String finish) {

        System.out.println(homePage.finishTimeOutput.getAttribute("value"));

        Assert.assertTrue(homePage.finishTimeOutput.getAttribute("value").contains(finish));

    }


    @And("user enters invalid start time such as {string} on the start task on inputbox")
    public void userEntersInvalidStartTimeSuchAsOnTheStartTaskOnInputbox(String invalidStartTime) {

        homePage.startTaskOn.click();

        Actions actions = new Actions( Driver.getDriver());
        actions.doubleClick(homePage.invalidDeadlineTime).perform();
        homePage.durationInputBox.sendKeys(1+"");
        homePage.daysButton.click();
    }

    @Then("user cannot provide invalid {string} time and the invalid finish time {string} is not displayed on the finish inputbox")
    public void userCannotProvideInvalidTimeAndTheInvalidFinishTimeIsNotDisplayedOnTheFinishInputbox(String invalidStartTime, String invalidFinishTime) {

        System.out.println(homePage.finishTimeOutput.getAttribute("value"));

        Assert.assertFalse(homePage.finishTimeOutput.getAttribute("value").contains(invalidFinishTime));

    }
}
