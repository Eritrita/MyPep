Feature: To test high level functionality of the zoo test site

Background: 

Given I am on the zoo site

Scenario: To populate the contact form

When I click on "Contact"
And I enter "Name Test" into the name field
And I enter "Address Test" into the Address field
And I enter "Postcode Test" into the Postcode field
And I enter "Email Test" into the Email field
And I submit the contact form
Then I check I am on the confirmation page
And I close the browser

