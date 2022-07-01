Feature: Task functionality
  As a HR user, I should be able to assign tasks under Quick Navigate Menu .

  Background:
    Given User is on the homepage

  @REM-1323
  Scenario: User should be able to create a "High priority" tasks with the mandatory fields.
    When user clicks on the Task
    And  user enters a Task name
    And user adds at least one responsible person
    And user clicks on High Priority checkbox button
    And user clicks on the send button
    Then "Task has been created" pop-up message is displayed

  @REM-1324
  Scenario:User should be able to create a "High priority" tasks with the mandatory fields.
    When user clicks on the Task
    And user adds at least one responsible person
    And user clicks on High Priority checkbox button
    And user clicks on the send button
    Then "The task name is not specified" error message is displayed

  @REM-1325
  Scenario:User should be able to create a "High priority" tasks with the mandatory fields.
    When user clicks on the Task
    And  user enters a Task name
    And user clicks the responsible person button
    And user clicks on High Priority checkbox button
    And user clicks on the send button
    Then  "A user specified in the field Responsible Person was not found." errorPerson message is displayed



