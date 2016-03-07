Feature: Logging in to TigerText with an existing User


#@loginNewUserAndlogoutNewUser
#Scenario: Register a new user  
#Given I enter a new email address
#And press the Start button
#Then I enter a new Password
#Then confirm the Password
#Then I Activate the device
#Then I press Send on SMS screen
#Then I Start Messaging with new User
#And Allow Notifications
#Then I am on Inbox and need to verify email
#Then I go to the Contacts organization
#And I go to the Settings tab
#And Log out of the application

#-#Scenario: Log in with an existing user  
#-#Given I enter an existing email address
#-#And press the Start button
#-#Then I enter the password
#-#Then I Activate the device
#-#Then I press Send on SMS screen
#-#Then I Start Messaging
#-#And Allow Notifications
#-#Then I go to the Settings tab
#-#And Log out of the application

Scenario: Verify phone number validation works  
Given I login to the TT app with phone no.
And I log out of the app

#Scenario: Send a message to a non-TT phone contact
#Given I login to the TT app  with "T0.U0@tigertext.com"
#Then I go to the Contacts organization
#Then I compose new message
#And I enter the User name "Con One"
#Then I pick the Contacts User
#Then I send a message to the User
#And I close out the conversation screen
#-And I log out of the app 

Scenario: Send a message to a non-TT email contact
#-#Given I login to the TT app  with "T0.U0@tigertext.com"
Then I go to the Contacts organization
Then I compose new message
And I enter the User name "fffg@h.bet"
Then I hit Return button
Then I send a message to the User
And I close out the conversation screen
And I log out of the app 





