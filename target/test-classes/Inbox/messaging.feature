Feature: Messaging

#Scenario: Set TTL in personal/free org and send a P2P message  
#Given I login to the TT app with Free Org user
#Then I compose new message
#Then I pick the User
#And I send a message to the User
#Then I verify the "10 days left" TTL message
#And I close the conversation screen
#And I log out of the app 
 
#Scenario: Set TTL in paid org (in admin console) and send a P2P message  
#Given I login to the TT app  with "T0.U0@tigertext.com"
#Then I compose new message
#And I enter the User name "Test3.User3@tigertext.com"
#Then I pick the User
#And I send a message to the User
#Then I verify the "20 days left" TTL message
#And I close the conversation screen
#And I log out of the app 

#Scenario: Send/Receive P2P messages
#Given I login to the TT app  with "T0.U0@tigertext.com"
#Then I compose new message
#And I enter the User name "Test3.User3@tigertext.com"
#Then I pick the User
#Then I send a message to the User
#Then I send a photo message to the User
#Then I send an audio message to the User
#Then I send a video message to the User
#And I verify that the message status is "Sent"
#And I close out the conversation screen
#And I log out of the app
#Then I login to the TT app with "Test3.User3@tigertext.com"
#Then I search for "T0 U0"
#And verify that there are "5 Unread Messages"
#Then I open up the conversation screen
#And view the attachments
#Then I back out of the conversation screen
#Then I log out of the app 
#Then I login to the TT app with "T0.U0@tigertext.com"
#Then I search for "Test3 User3"
#Then I open up the conversation screen
#And I verify that the message status is "Read"

Scenario: Recall, resend and forward message
#Given I login to the TT app  with "T0.U0@tigertext.com"
Then I compose new message
And I enter the User name "Test3.User3@tigertext.com"
Then I pick the User
Then I send a message to the User
Then I recall the message
Then I long press on the message and select "Resend"
Then I long press on the message and select "Forward"
And I enter the User name "Test5.User5@tigertext.com"
Then I pick the User
And I click on "Forward" button


