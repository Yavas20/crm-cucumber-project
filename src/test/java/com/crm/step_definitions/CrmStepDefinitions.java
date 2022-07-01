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

        int expectedTask = 66;

        try{
            int actualTask = Integer.parseInt(homePage.ongoingTest.getText());

            System.out.println(actualTask);

            Assert.assertEquals(expectedTask, actualTask);
        } catch(StaleElementReferenceException e){
            e.printStackTrace();
        }


    }
}
