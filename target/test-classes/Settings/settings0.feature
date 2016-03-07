Feature: Settings page stuff

Scenario: Enable PIN Lock in admin console and verify on iOS
Given I am on the home page
Then I login to TigerText
And click on Settings
Then I go to the Organizations tab
And search for "Kashif Test 0" Oganization
Then I click on the Org
And set the PIN Lock value to "Required immediately"
Then I save the changes
Then I log out of the website
Then I login to the TT app  with "T0.U0@tigertext.com"
Then I press OK on the PIN Notice popup
And the Set PIN screen appears
Then I enter the PIN
And Confirm the PIN
Then I log out of the app

#Scenario: Disable PIN Lock in admin console and verify on iOS
#Given I am on the home page
#Then I login to TigerText
#And click on Settings
#Then I go to the Organizations tab
#And search for "Kashif Test 0" Oganization
#Then I click on the Org
#And set the PIN Lock value to "Required immediately"
#Then set the PIN Lock value to "Not required"
#Then I save the changes
#Then I log out of the website
#Then I login to the TT app  with "T0.U0@tigertext.com"
#Then I log out of the app

#Scenario: Change password in Settings tab
#Given I login to the TT app  with "T0.U0@tigertext.com"
#Then I go to the Settings tab
#And I click on "Change Password"
#Then I enter the Current Password
#And I enter the Enter New Password
#And I enter the Re-enter New Password
#Then I press the Back button
#Then I log out of the app

#Scenario: change User status and verify on Web
#Given I login to the TT app  with "T0.U0@tigertext.com"
#Then I go to the Settings tab
#And I edit the User status
#Then I am on the home page
#Then I login to TigerText with another User
#And search for the original User
#And send a message to the User
#Then I should see the updated status of that User
#Then I log out of the website
#And I log out of the app  

#Scenario: change Display Name and verify 
#Given I login to the TT app  with "T0.U0@tigertext.com"
#Then I go to the Settings tab
#Then I go to the User settings
#And I update the User Name
#Then I save the update
#And I log out of the app  

#Scenario: change Title and verify
#Given I login to the TT app  with "T0.U0@tigertext.com"
#Then I go to the Settings tab
#Then I go to the User settings
#And I update the User Title
#Then I save the update
#And I log out of the app 

#Scenario: change Department and verify
#Given I login to the TT app  with "T0.U0@tigertext.com"
#Then I go to the Settings tab
#Then I go to the User settings
#And I update the User Department
#Then I save the update
#And I log out of the app 
#Then I login to the TT app with "T0.U0@tigertext.com"
#And I go to the Settings tab
#Then I go to the User settings
#And I verify that the Name was successfully updated
#And I verify that the Title was successfully updated
#And I verify that the Department was successfully updated
#And I update the settings to their original state and save again
#And I log out of the app 

#Scenario: change avatar
#Given I login to the TT app  with "T0.U0@tigertext.com"
#Then I go to the Settings tab
#Then I go to the User settings
#Then I change the avatar by taking a picture
#And I save the new avatar
#And I log out of the app  

#Scenario: View FAQs in Help
#Given I login to the TT app  with "T0.U0@tigertext.com"
#Then I go to the Settings tab
#Then I go to "Help" section
#And I go to "FAQs" section
#Then I verify that the FAQ page loads

#Scenario: View Privacy Policy in About
#Given I login to the TT app  with "T0.U0@tigertext.com"
#Then I go to the Settings tab
#Then I go to "About" section
#And I go to "Privacy Policy" section
#Then I verify that the Privacy Policy page loads
