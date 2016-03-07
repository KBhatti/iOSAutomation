package TestCases;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import PageObjects.inboxPO;
import PageObjects.messagingPO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class messaging extends AbstractPageSD
{
	IOSDriver<IOSElement> driver = getDriver();
	WebDriverWait wait = new WebDriverWait(driver, 30);
	
		@Then("^I enter the User name \"([^\"]*)\"$")
		public void i_enter_the_User_name(String user) throws Throwable 
		{
			inboxPO page = new inboxPO(driver);
			page.enterUser(user);
		}

		@And("^I pick the User$")
		public void i_pick_a_User() throws Throwable 
		{
			inboxPO page = new inboxPO(driver);
			page.pickUser();
		}
	
		@Then("^I send a message to the User$")
		public void i_send_a_message_to_the_User() throws Throwable 
		{
			messagingPO page = new messagingPO(driver);
			page.sendMessage(RandomStringUtils.randomAlphanumeric(2));
			page.sendMessage(RandomStringUtils.randomAlphanumeric(2));
		}

		@Then("^I send a photo message to the User$")
		public void i_send_a_photo_message_to_the_User() throws Throwable 
		{
			messagingPO page = new messagingPO(driver);
			page.attchmentBtn();
			page.phtoOrvid();
			page.capturePhoto();
	        //IOSElement element = page.uphoto;
			Thread.sleep(2000);
			page.usePhot0();
			page.sndButton.click();
		}

		@Then("^I send a video message to the User$")
		public void i_send_a_video_message_to_the_User() throws Throwable 
		{
			messagingPO page = new messagingPO(driver);
			page.attchmentBtn();
			page.phtoOrvid();
			TouchAction action = new TouchAction(driver);
			action.tap(93,490).perform();
			page.recordAndStopVideo();
			Thread.sleep(4000);
			page.recordAndStopVideo();
			Thread.sleep(2000);
			page.useVideo();
			page.sndButton.click();
		}

		@Then("^I send an audio message to the User$")
		public void i_send_an_audio_message_to_the_User() throws Throwable 
		{
			messagingPO page = new messagingPO(driver);
			page.attchmentBtn();
			page.recordAudio();
			page.tapToRecordAudio();
			Thread.sleep(3000);
			page.tapToStopRecordAudio();
			page.tapToSendAudio();
		}
 		
		@Then("^I verify the \"([^\"]*)\" TTL message$")
		public void i_verify_the_TTL_message(String TTL) throws Throwable 
		{
			IOSElement element = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[last()]/UIAStaticText[2]"));
			String text = element.getAttribute("name");
			Assert.assertEquals(TTL, text);
		}
//Ignore
		@Then("^I close out the conversation screen$")
		public void i_close_out_the_conversation_screen() throws Throwable 
		{
			messagingPO page = new messagingPO(driver);
			page.outOfConvo();
		}
		
		@Then("^view the attachments$")
		public void view_the_attachments() throws Throwable 
		{
			//driver.findElement(By.xpath("//*[contains(text(),'UIAImage[3]')]")).click();
			driver.findElement(By.name("play")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[last()]/UIAImage[3]")).click();
		}

		@Then("^I back out of the conversation screen$")
		public void i_get_out_of_the_conversation_screen() throws Throwable 
		{
			messagingPO page = new messagingPO(driver);
			page.outOfConvo();
		}
		
		@Then("^I recall the message$")
		public void i_resend_the_message() throws Throwable 
		{
			Thread.sleep(3000);
			driver.tap(1, 157, 240, 500);
			messagingPO page = new messagingPO(driver);
			page.recallConvo();
		}
		
		@Then("^I long press on the message and select \"([^\"]*)\"$")
		public void i_long_press_on_the_message_and_select(String longPressItem) throws Throwable 
		{
			driver.tap(1, 164, 477, 500);
			driver.findElement(By.name(longPressItem)).click();
		}
		
		@Then("^I click on \"([^\"]*)\" button$")
		public void i_click_on_button(String fwdButton) throws Throwable 
		{
			driver.findElement(By.name(fwdButton)).click();
		}
		
		@Then("^I verify that the message status is \"([^\"]*)\"$")
		public void i_verify_that_the_message_status_is(String msgStatus) throws Throwable 
		{
			Thread.sleep(3000);
			IOSElement element = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[last()]/UIAStaticText[4]"));
			String text = element.getText();
			Assert.assertEquals(msgStatus, text);
		}
		
}
