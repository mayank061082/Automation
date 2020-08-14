Feature: Gmail Validations

Background: User Logged In
Given I navigate to the gmail login page
When I enter username as "mailfortesting086@gmail.com"
And click on next button
And enter password as "Ma!l4testing"
And click on next button

Scenario: to fetch the subject and body of unread mail and print in excel
Given I am on gmail home page
When I read first unread mail
Then I should able to write subject and mailbody to the excel file
And I close the browser

@Scenario
Scenario: to compose a mail and send email with attachment to recipient
Given I am on gmail home page
When i compose a mail
And Add "recipient1" mail id from property file
And Add Subject as "Word Document Attachment"
And attach a file
And  click on send button
Then should able to send the mail
And I close the browser