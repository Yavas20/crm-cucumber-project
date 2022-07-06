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

  @REM-1326
  Scenario: User should be able to assign a task to more than one user (Test with adding 3 users max.)
    When user clicks on the Task
    And user enters a Task name
    And user adds at least one responsible person
    And user clicks on the send button
    Then "Task has been created" pop-up message is displayed

  @REM-1327
  Scenario: User should be able to assign a task to more than one user (Test with adding 3 users max.)
    When user clicks on the Task
    And user enters a Task name
    And user adds two responsible person
    And user clicks on the send button
    Then "Task has been created" pop-up message is displayed

  @REM-1328
  Scenario: User should be able to assign a task to more than one user (Test with adding 3 users max.)
    When user clicks on the Task
    And user enters a Task name
    And user adds three responsible person
    And user clicks on the send button
    Then "Task has been created" pop-up message is displayed

  @REM-1329
  Scenario:  When task(s) is(are) created, they can be seen on the count on the homepage under "MY TASKS" table.
    When user clicks on the Task
    And user enters a Task name
    And user adds at least one responsible person
    And user clicks on the send button
    Then The task created can be seen on the count under MY TASKS table

  @REM-1340
  Scenario: Checklist should be able to be added while creating a task.
    When user clicks on the Task
    And user clicks on checklist
    And user enters something into checklist inputbox
    And user clicks on ✓ sign or add
    And user clicks on the checkbox button shown above the checklist inputbox
    Then the "completed" message including the number of checklists inside the parentheses is displayed

  @REM-1342
  Scenario: Deadline should be able to be added while creating a task.
    When user clicks on the Task
    And user clicks on deadline inputbox
    And user enters some valid time such as "07/14/2022" and doubleclick or click on the select button
    Then the provided "07/14/2022" is displayed on the deadline input box

   @REM-1343
   Scenario: Deadline should be able to be added while creating a task.
    When user clicks on the Task
    And user clicks on deadline inputbox
    And user enters some invalid time such as "07/05/2022"
    Then user cannot doubleclick or click on the select button and the provided "07/05/2022" is not displayed on the deadline input box

  @REM-1344
  Scenario: Time planning function should be able to be used in the setting of deadline.
    When user clicks on the Task
    And user clicks on Time planning
    And user enters valid start time "07/14/2022" on the start task on inputbox
    And user enters "1" on the duration inputbox and clicks on the days
    Then the "07/15/2022" is displayed on the finish inputbox depending on the provided start time and duration type.


  @REM-1345
  Scenario: Time planning function should be able to be used in the setting of deadline.
    When user clicks on the Task
    And user clicks on Time planning
    And user enters invalid start time such as "07/05/2022" on the start task on inputbox
    Then user cannot provide invalid "07/05/2022" time and the invalid finish time "07/06/2022" is not displayed on the finish inputbox



