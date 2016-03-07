package TestCases;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import PageObjects.existingUser;
import PageObjects.inboxPO;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class inboxSD extends AbstractPageSD
{
	IOSDriver<IOSElement> driver = getDriver();
	WebDriverWait wait = new WebDriverWait(driver, 20);


	@Then("^I go to Add Inbox$")
	public void i_go_to_Add_Inbox() throws Throwable 
	{
		existingUser page = new existingUser(driver);
		page.contactsSpinnerOrg();
		page.addInbox();
	}

	@Then("^enter the Add Inbox email$")
	public void enter_the_Add_Inbox_email() throws Throwable 
	{
		Thread.sleep(2000);
		existingUser page = new existingUser(driver);
		page.enterUser("T0.U0@bnn.com");
		page.startButton();
	}
	
	@Then("^verify that I get notification$")
	public void verify_that_I_get_notification() throws Throwable 
	{

	}
	
	@When("^I compose new message$")
	public void compose_new_message() throws Throwable 
	{
		inboxPO page = new inboxPO(driver);
		IOSElement element = page.newMsg;
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		//page.newMessage();		
	}

	@Then("^I search for \"([^\"]*)\"$")
	public void i_search_for(String username) throws Throwable 
	{
		inboxPO page = new inboxPO(driver);
		page.searchUser(username);
	}

	@Then("^verify that there are \"([^\"]*)\"$")
	public void verify_that_there_are(String unreadMsgCount) throws Throwable 
	{
		inboxPO page = new inboxPO(driver);
		IOSElement element = page.unrdCnt;
		String text = element.getText();
		Assert.assertEquals(unreadMsgCount, text);
	}

	@Then("^I open up the conversation screen$")
	public void i_open_up_the_conversation_screen() throws Throwable 
	{
		inboxPO page = new inboxPO(driver);
		page.userConvo();
	}
	


}

