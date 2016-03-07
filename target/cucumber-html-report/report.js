$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Existing User/existingUserLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Logging in to TigerText with an existing User",
  "description": "",
  "id": "logging-in-to-tigertext-with-an-existing-user",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#@loginNewUserAndlogoutNewUser"
    },
    {
      "line": 5,
      "value": "#Scenario: Register a new user"
    },
    {
      "line": 6,
      "value": "#Given I enter a new email address"
    },
    {
      "line": 7,
      "value": "#And press the Start button"
    },
    {
      "line": 8,
      "value": "#Then I enter a new Password"
    },
    {
      "line": 9,
      "value": "#Then confirm the Password"
    },
    {
      "line": 10,
      "value": "#Then I Activate the device"
    },
    {
      "line": 11,
      "value": "#Then I press Send on SMS screen"
    },
    {
      "line": 12,
      "value": "#Then I Start Messaging with new User"
    },
    {
      "line": 13,
      "value": "#And Allow Notifications"
    },
    {
      "line": 14,
      "value": "#Then I am on Inbox and need to verify email"
    },
    {
      "line": 15,
      "value": "#Then I go to the Contacts organization"
    },
    {
      "line": 16,
      "value": "#And I go to the Settings tab"
    },
    {
      "line": 17,
      "value": "#And Log out of the application"
    },
    {
      "line": 19,
      "value": "#-#Scenario: Log in with an existing user"
    },
    {
      "line": 20,
      "value": "#-#Given I enter an existing email address"
    },
    {
      "line": 21,
      "value": "#-#And press the Start button"
    },
    {
      "line": 22,
      "value": "#-#Then I enter the password"
    },
    {
      "line": 23,
      "value": "#-#Then I Activate the device"
    },
    {
      "line": 24,
      "value": "#-#Then I press Send on SMS screen"
    },
    {
      "line": 25,
      "value": "#-#Then I Start Messaging"
    },
    {
      "line": 26,
      "value": "#-#And Allow Notifications"
    },
    {
      "line": 27,
      "value": "#-#Then I go to the Settings tab"
    },
    {
      "line": 28,
      "value": "#-#And Log out of the application"
    }
  ],
  "line": 30,
  "name": "Verify phone number validation works",
  "description": "",
  "id": "logging-in-to-tigertext-with-an-existing-user;verify-phone-number-validation-works",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 31,
  "name": "I login to the TT app with phone no.",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "I log out of the app",
  "keyword": "And "
});
formatter.match({
  "location": "CommonPageSD.i_login_to_the_TT_app_with_phone_no()"
});
formatter.result({
  "duration": 76386679031,
  "error_message": "org.openqa.selenium.NoSuchElementException: An element could not be located on the page using the given search parameters. (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 61.41 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.48.2\u0027, revision: \u002741bccdd10cf2c0560f637404c2d96164b67d9d67\u0027, time: \u00272015-10-09 13:08:06\u0027\nSystem info: host: \u0027Kashifs-MacBook-Air.local\u0027, ip: \u0027192.168.0.20\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.11.3\u0027, java.version: \u00271.8.0_65\u0027\nDriver info: io.appium.java_client.ios.IOSDriver\nCapabilities [{networkConnectionEnabled\u003dfalse, warnings\u003d{}, bundleId\u003dcom.tigertext.tigertext, databaseEnabled\u003dfalse, deviceName\u003d/(^[a-z ]+$)/i, platform\u003dMAC, desired\u003d{bundleId\u003dcom.tigertext.tigertext, udid\u003d\"594c69db1eec686cd22c93071a4d05ec0addea39\", platformName\u003diOS, deviceName\u003d/(^[a-z ]+$)/i}, webStorageEnabled\u003dfalse, locationContextEnabled\u003dfalse, browserName\u003diOS, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, udid\u003d\"594c69db1eec686cd22c93071a4d05ec0addea39\", platformName\u003diOS}]\nSession ID: 583db377-9b62-4a86-94ce-9b6225c506b5\n*** Element info: {Using\u003dname, value\u003dEmail or Username}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:647)\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:42)\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\n\tat io.appium.java_client.ios.IOSDriver.execute(IOSDriver.java:1)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByName(RemoteWebDriver.java:451)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElementByName(DefaultGenericMobileDriver.java:102)\n\tat io.appium.java_client.AppiumDriver.findElementByName(AppiumDriver.java:1)\n\tat io.appium.java_client.ios.IOSDriver.findElementByName(IOSDriver.java:1)\n\tat org.openqa.selenium.By$ByName.findElement(By.java:303)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:345)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:52)\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\n\tat io.appium.java_client.ios.IOSDriver.findElement(IOSDriver.java:1)\n\tat TestCases.CommonPageSD.i_login_to_the_TT_app_with_phone_no(CommonPageSD.java:83)\n\tat ✽.Given I login to the TT app with phone no.(Existing User/existingUserLogin.feature:31)\n",
  "status": "failed"
});
formatter.match({
  "location": "CommonPageSD.i_log_out_of_the_app()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 15514594724,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 34,
      "value": "#Scenario: Send a message to a non-TT phone contact"
    },
    {
      "line": 35,
      "value": "#Given I login to the TT app  with \"T0.U0@tigertext.com\""
    },
    {
      "line": 36,
      "value": "#Then I go to the Contacts organization"
    },
    {
      "line": 37,
      "value": "#Then I compose new message"
    },
    {
      "line": 38,
      "value": "#And I enter the User name \"Con One\""
    },
    {
      "line": 39,
      "value": "#Then I pick the Contacts User"
    },
    {
      "line": 40,
      "value": "#Then I send a message to the User"
    },
    {
      "line": 41,
      "value": "#And I close out the conversation screen"
    },
    {
      "line": 42,
      "value": "#-And I log out of the app"
    }
  ],
  "line": 44,
  "name": "Send a message to a non-TT email contact",
  "description": "",
  "id": "logging-in-to-tigertext-with-an-existing-user;send-a-message-to-a-non-tt-email-contact",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 45,
      "value": "#-#Given I login to the TT app  with \"T0.U0@tigertext.com\""
    }
  ],
  "line": 46,
  "name": "I go to the Contacts organization",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "I compose new message",
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "I enter the User name \"fffg@h.bet\"",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "I hit Return button",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "I send a message to the User",
  "keyword": "Then "
});
formatter.step({
  "line": 51,
  "name": "I close out the conversation screen",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "I log out of the app",
  "keyword": "And "
});
formatter.match({
  "location": "existingUserLoginSD.i_go_to_the_Contacts_organization()"
});
formatter.result({
  "duration": 5467140178,
  "error_message": "org.openqa.selenium.NoSuchElementException: Can\u0027t locate an element by this strategy: Locator map: \n- native content: \"By.name: Contats\" \n- html content: \"by id or name \"cnts\"\"\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.48.2\u0027, revision: \u002741bccdd10cf2c0560f637404c2d96164b67d9d67\u0027, time: \u00272015-10-09 13:08:06\u0027\nSystem info: host: \u0027Kashifs-MacBook-Air.local\u0027, ip: \u0027192.168.0.20\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.11.3\u0027, java.version: \u00271.8.0_65\u0027\nDriver info: driver.version: unknown\n\tat io.appium.java_client.pagefactory.AppiumElementLocator.findElement(AppiumElementLocator.java:152)\n\tat io.appium.java_client.pagefactory.interceptors.InterceptorOfASingleElement.intercept(InterceptorOfASingleElement.java:51)\n\tat io.appium.java_client.ios.IOSElement$$EnhancerByCGLIB$$e21f936c.click(\u003cgenerated\u003e)\n\tat PageObjects.existingUser.contactsOrg(existingUser.java:69)\n\tat TestCases.existingUserLoginSD.i_go_to_the_Contacts_organization(existingUserLoginSD.java:127)\n\tat ✽.Then I go to the Contacts organization(Existing User/existingUserLogin.feature:46)\n",
  "status": "failed"
});
formatter.match({
  "location": "inboxSD.compose_new_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "fffg@h.bet",
      "offset": 23
    }
  ],
  "location": "messaging.i_enter_the_User_name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "existingUserLoginSD.i_hit_Return_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "messaging.i_send_a_message_to_the_User()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "messaging.i_close_out_the_conversation_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CommonPageSD.i_log_out_of_the_app()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 15703423787,
  "status": "passed"
});
formatter.uri("Inbox/inbox0.feature");
formatter.feature({
  "line": 1,
  "name": "Compose and sending a message",
  "description": "",
  "id": "compose-and-sending-a-message",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#-#Scenario: Receive message while in app"
    },
    {
      "line": 4,
      "value": "#-#Given I log in to the Web and send a message from Web to iOS"
    },
    {
      "line": 5,
      "value": "#-#Then I login to the TT app  with \"T0.U0@tigertext.com\""
    },
    {
      "line": 6,
      "value": "#-#And verify that I get notification"
    }
  ],
  "line": 8,
  "name": "Select Add Inbox in org menu and complete Add Inbox flow and Remove a free org in My Organizations",
  "description": "",
  "id": "compose-and-sending-a-message;select-add-inbox-in-org-menu-and-complete-add-inbox-flow-and-remove-a-free-org-in-my-organizations",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "#-#Given I login to the TT app  with \"T0.U0@tigertext.com\""
    },
    {
      "line": 10,
      "value": "#Then I go to Add Inbox"
    },
    {
      "line": 11,
      "value": "#And enter the Add Inbox email"
    },
    {
      "line": 12,
      "value": "#Then I am on Inbox and need to verify email"
    },
    {
      "line": 13,
      "value": "#Then I go to the Contacts organization"
    },
    {
      "line": 14,
      "value": "#And I go to the Settings tab"
    },
    {
      "line": 15,
      "value": "#Then I go to the Organizations section"
    },
    {
      "line": 16,
      "value": "#And select the Org I previously added"
    },
    {
      "line": 17,
      "value": "#Then I Disconnect the Account"
    }
  ],
  "line": 18,
  "name": "Log out of the application",
  "keyword": "And "
});
formatter.match({
  "location": "existingUserLoginSD.log_out_of_the_application()"
});
formatter.result({
  "duration": 1384370461,
  "error_message": "org.openqa.selenium.NoSuchElementException: Can\u0027t locate an element by this strategy: Locator map: \n- native content: \"By.name: Logout\" \n- html content: \"by id or name \"lout\"\"\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.48.2\u0027, revision: \u002741bccdd10cf2c0560f637404c2d96164b67d9d67\u0027, time: \u00272015-10-09 13:08:06\u0027\nSystem info: host: \u0027Kashifs-MacBook-Air.local\u0027, ip: \u0027192.168.0.20\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.11.3\u0027, java.version: \u00271.8.0_65\u0027\nDriver info: driver.version: unknown\n\tat io.appium.java_client.pagefactory.AppiumElementLocator.findElement(AppiumElementLocator.java:152)\n\tat io.appium.java_client.pagefactory.interceptors.InterceptorOfASingleElement.intercept(InterceptorOfASingleElement.java:51)\n\tat io.appium.java_client.ios.IOSElement$$EnhancerByCGLIB$$e21f936c.click(\u003cgenerated\u003e)\n\tat PageObjects.settingsPO.loutSettings(settingsPO.java:105)\n\tat TestCases.existingUserLoginSD.log_out_of_the_application(existingUserLoginSD.java:142)\n\tat ✽.And Log out of the application(Inbox/inbox0.feature:18)\n",
  "status": "failed"
});
formatter.after({
  "duration": 16067891822,
  "status": "passed"
});
formatter.uri("Inbox/messaging.feature");
formatter.feature({
  "line": 1,
  "name": "Messaging",
  "description": "",
  "id": "messaging",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#Scenario: Set TTL in personal/free org and send a P2P message"
    },
    {
      "line": 4,
      "value": "#Given I login to the TT app with Free Org user"
    },
    {
      "line": 5,
      "value": "#Then I compose new message"
    },
    {
      "line": 6,
      "value": "#Then I pick the User"
    },
    {
      "line": 7,
      "value": "#And I send a message to the User"
    },
    {
      "line": 8,
      "value": "#Then I verify the \"10 days left\" TTL message"
    },
    {
      "line": 9,
      "value": "#And I close the conversation screen"
    },
    {
      "line": 10,
      "value": "#And I log out of the app"
    },
    {
      "line": 12,
      "value": "#Scenario: Set TTL in paid org (in admin console) and send a P2P message"
    },
    {
      "line": 13,
      "value": "#Given I login to the TT app  with \"T0.U0@tigertext.com\""
    },
    {
      "line": 14,
      "value": "#Then I compose new message"
    },
    {
      "line": 15,
      "value": "#And I enter the User name \"Test3.User3@tigertext.com\""
    },
    {
      "line": 16,
      "value": "#Then I pick the User"
    },
    {
      "line": 17,
      "value": "#And I send a message to the User"
    },
    {
      "line": 18,
      "value": "#Then I verify the \"20 days left\" TTL message"
    },
    {
      "line": 19,
      "value": "#And I close the conversation screen"
    },
    {
      "line": 20,
      "value": "#And I log out of the app"
    },
    {
      "line": 22,
      "value": "#Scenario: Send/Receive P2P messages"
    },
    {
      "line": 23,
      "value": "#Given I login to the TT app  with \"T0.U0@tigertext.com\""
    },
    {
      "line": 24,
      "value": "#Then I compose new message"
    },
    {
      "line": 25,
      "value": "#And I enter the User name \"Test3.User3@tigertext.com\""
    },
    {
      "line": 26,
      "value": "#Then I pick the User"
    },
    {
      "line": 27,
      "value": "#Then I send a message to the User"
    },
    {
      "line": 28,
      "value": "#Then I send a photo message to the User"
    },
    {
      "line": 29,
      "value": "#Then I send an audio message to the User"
    },
    {
      "line": 30,
      "value": "#Then I send a video message to the User"
    },
    {
      "line": 31,
      "value": "#And I verify that the message status is \"Sent\""
    },
    {
      "line": 32,
      "value": "#And I close out the conversation screen"
    },
    {
      "line": 33,
      "value": "#And I log out of the app"
    },
    {
      "line": 34,
      "value": "#Then I login to the TT app with \"Test3.User3@tigertext.com\""
    },
    {
      "line": 35,
      "value": "#Then I search for \"T0 U0\""
    },
    {
      "line": 36,
      "value": "#And verify that there are \"5 Unread Messages\""
    },
    {
      "line": 37,
      "value": "#Then I open up the conversation screen"
    },
    {
      "line": 38,
      "value": "#And view the attachments"
    },
    {
      "line": 39,
      "value": "#Then I back out of the conversation screen"
    },
    {
      "line": 40,
      "value": "#Then I log out of the app"
    },
    {
      "line": 41,
      "value": "#Then I login to the TT app with \"T0.U0@tigertext.com\""
    },
    {
      "line": 42,
      "value": "#Then I search for \"Test3 User3\""
    },
    {
      "line": 43,
      "value": "#Then I open up the conversation screen"
    },
    {
      "line": 44,
      "value": "#And I verify that the message status is \"Read\""
    }
  ],
  "line": 46,
  "name": "Recall, resend and forward message",
  "description": "",
  "id": "messaging;recall,-resend-and-forward-message",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 47,
      "value": "#Given I login to the TT app  with \"T0.U0@tigertext.com\""
    }
  ],
  "line": 48,
  "name": "I compose new message",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "I enter the User name \"Test3.User3@tigertext.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "I pick the User",
  "keyword": "Then "
});
formatter.step({
  "line": 51,
  "name": "I send a message to the User",
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "I recall the message",
  "keyword": "Then "
});
formatter.step({
  "line": 53,
  "name": "I long press on the message and select \"Resend\"",
  "keyword": "Then "
});
formatter.step({
  "line": 54,
  "name": "I long press on the message and select \"Forward\"",
  "keyword": "Then "
});
formatter.step({
  "line": 55,
  "name": "I enter the User name \"Test5.User5@tigertext.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "I pick the User",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "I click on \"Forward\" button",
  "keyword": "And "
});
formatter.match({
  "location": "inboxSD.compose_new_message()"
});
formatter.result({
  "duration": 23869982998,
  "error_message": "org.openqa.selenium.NoSuchElementException: Can\u0027t locate an element by this strategy: Locator map: \n- native content: \"By.name: Comose Button\" \n- html content: \"by id or name \"newMsg\"\"\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.48.2\u0027, revision: \u002741bccdd10cf2c0560f637404c2d96164b67d9d67\u0027, time: \u00272015-10-09 13:08:06\u0027\nSystem info: host: \u0027Kashifs-MacBook-Air.local\u0027, ip: \u0027192.168.0.20\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.11.3\u0027, java.version: \u00271.8.0_65\u0027\nDriver info: driver.version: unknown\n\tat io.appium.java_client.pagefactory.AppiumElementLocator.findElement(AppiumElementLocator.java:152)\n\tat io.appium.java_client.pagefactory.interceptors.InterceptorOfASingleElement.intercept(InterceptorOfASingleElement.java:51)\n\tat io.appium.java_client.ios.IOSElement$$EnhancerByCGLIB$$e21f936c.toString(\u003cgenerated\u003e)\n\tat java.lang.String.valueOf(String.java:2994)\n\tat java.lang.StringBuilder.append(StringBuilder.java:131)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$23.toString(ExpectedConditions.java:710)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:257)\n\tat TestCases.inboxSD.compose_new_message(inboxSD.java:58)\n\tat ✽.Then I compose new message(Inbox/messaging.feature:48)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test3.User3@tigertext.com",
      "offset": 23
    }
  ],
  "location": "messaging.i_enter_the_User_name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "messaging.i_pick_a_User()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "messaging.i_send_a_message_to_the_User()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "messaging.i_resend_the_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Resend",
      "offset": 40
    }
  ],
  "location": "messaging.i_long_press_on_the_message_and_select(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Forward",
      "offset": 40
    }
  ],
  "location": "messaging.i_long_press_on_the_message_and_select(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Test5.User5@tigertext.com",
      "offset": 23
    }
  ],
  "location": "messaging.i_enter_the_User_name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "messaging.i_pick_a_User()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Forward",
      "offset": 12
    }
  ],
  "location": "messaging.i_click_on_button(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 15464540572,
  "status": "passed"
});
formatter.uri("Settings/settings0.feature");
formatter.feature({
  "line": 1,
  "name": "Settings page stuff",
  "description": "",
  "id": "settings-page-stuff",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Enable PIN Lock in admin console and verify on iOS",
  "description": "",
  "id": "settings-page-stuff;enable-pin-lock-in-admin-console-and-verify-on-ios",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I login to TigerText",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "click on Settings",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I go to the Organizations tab",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "search for \"Kashif Test 0\" Oganization",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on the Org",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "set the PIN Lock value to \"Required immediately\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I save the changes",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I log out of the website",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I login to the TT app  with \"T0.U0@tigertext.com\"",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I press OK on the PIN Notice popup",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "the Set PIN screen appears",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter the PIN",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Confirm the PIN",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I log out of the app",
  "keyword": "Then "
});
formatter.match({
  "location": "webAdmin.i_am_on_the_home_page()"
});
formatter.result({
  "duration": 2263271,
  "error_message": "org.openqa.selenium.remote.UnreachableBrowserException: Error communicating with the remote browser. It may have died.\nBuild info: version: \u00272.48.2\u0027, revision: \u002741bccdd10cf2c0560f637404c2d96164b67d9d67\u0027, time: \u00272015-10-09 13:08:06\u0027\nSystem info: host: \u0027Kashifs-MacBook-Air.local\u0027, ip: \u0027192.168.0.20\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.11.3\u0027, java.version: \u00271.8.0_65\u0027\nDriver info: driver.version: RemoteWebDriver\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:641)\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:311)\n\tat TestCases.webAdmin.i_am_on_the_home_page(webAdmin.java:29)\n\tat ✽.Given I am on the home page(Settings/settings0.feature:4)\nCaused by: org.apache.http.conn.HttpHostConnectException: Connect to 127.0.0.1:7055 [/127.0.0.1] failed: Connection refused\n\tat org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:151)\n\tat org.apache.http.impl.conn.PoolingHttpClientConnectionManager.connect(PoolingHttpClientConnectionManager.java:353)\n\tat org.apache.http.impl.execchain.MainClientExec.establishRoute(MainClientExec.java:380)\n\tat org.apache.http.impl.execchain.MainClientExec.execute(MainClientExec.java:236)\n\tat org.apache.http.impl.execchain.ProtocolExec.execute(ProtocolExec.java:184)\n\tat org.apache.http.impl.execchain.RetryExec.execute(RetryExec.java:88)\n\tat org.apache.http.impl.execchain.RedirectExec.execute(RedirectExec.java:110)\n\tat org.apache.http.impl.client.InternalHttpClient.doExecute(InternalHttpClient.java:184)\n\tat org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:71)\n\tat org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:55)\n\tat org.openqa.selenium.remote.internal.ApacheHttpClient.fallBackExecute(ApacheHttpClient.java:143)\n\tat org.openqa.selenium.remote.internal.ApacheHttpClient.execute(ApacheHttpClient.java:89)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:142)\n\tat org.openqa.selenium.firefox.internal.NewProfileExtensionConnection.execute(NewProfileExtensionConnection.java:170)\n\tat org.openqa.selenium.firefox.FirefoxDriver$LazyCommandExecutor.execute(FirefoxDriver.java:380)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:620)\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:311)\n\tat TestCases.webAdmin.i_am_on_the_home_page(webAdmin.java:29)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:497)\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:299)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:115)\n\tat org.testng.junit.JUnit4TestRunner.start(JUnit4TestRunner.java:81)\n\tat org.testng.junit.JUnit4TestRunner.run(JUnit4TestRunner.java:69)\n\tat org.testng.TestRunner$1.run(TestRunner.java:689)\n\tat org.testng.TestRunner.runWorkers(TestRunner.java:1014)\n\tat org.testng.TestRunner.privateRunJUnit(TestRunner.java:720)\n\tat org.testng.TestRunner.run(TestRunner.java:621)\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:359)\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:354)\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:312)\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:261)\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1191)\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1116)\n\tat org.testng.TestNG.run(TestNG.java:1024)\n\tat org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:132)\n\tat org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeSingleClass(TestNGDirectoryTestSuite.java:134)\n\tat org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:118)\n\tat org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)\n\tat org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:286)\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:240)\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:121)\nCaused by: java.net.ConnectException: Connection refused\n\tat java.net.PlainSocketImpl.socketConnect(Native Method)\n\tat java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)\n\tat java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)\n\tat java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)\n\tat java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)\n\tat java.net.Socket.connect(Socket.java:589)\n\tat org.apache.http.conn.socket.PlainConnectionSocketFactory.connectSocket(PlainConnectionSocketFactory.java:74)\n\tat org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:134)\n\t... 73 more\n",
  "status": "failed"
});
formatter.match({
  "location": "webAdmin.i_login_to_TigerText()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "webAdmin.click_on_Settings()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "webAdmin.i_go_to_the_Organizations_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Kashif Test 0",
      "offset": 12
    }
  ],
  "location": "webAdmin.search_for_Oganization(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "webAdmin.i_click_on_the_Org()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Required immediately",
      "offset": 27
    }
  ],
  "location": "webAdmin.set_the_PIN_Lock_value_to(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "webAdmin.i_save_the_changes()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CommonPageSD.i_log_out_of_the_website()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "T0.U0@tigertext.com",
      "offset": 29
    }
  ],
  "location": "CommonPageSD.i_login_to_TT_app_with(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "settingsSD.i_press_OK_on_the_PIN_Notice_popup()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "settingsSD.the_Set_PIN_screen_appears()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "settingsSD.i_enter_the_PIN()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "settingsSD.confirm_the_PIN()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CommonPageSD.i_log_out_of_the_app()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 16488728734,
  "status": "passed"
});
});