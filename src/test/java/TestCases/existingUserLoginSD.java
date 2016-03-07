package TestCases;


import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObjects.existingUser;
import PageObjects.settingsPO;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class existingUserLoginSD extends AbstractPageSD
{
	IOSDriver<IOSElement> driver = getDriver();
	WebDriver wdriver = getWebDriver();

	@Given("^I enter an existing email address$")
	public void i_enter_an_existing_email_address() throws Throwable 
	{
		driver.findElement(By.name("Email or Username")).sendKeys("T0.U0@tigertext.com");
	}

	@Then("^press the Start button$")
	public void press_the_Start_button() throws Throwable 
	{
		driver.findElement(By.name("Start")).click();
	}

	@Then("^I enter the password$")
	public void i_enter_the_password() throws Throwable 
	{
		driver.findElement(By.name("Enter password")).sendKeys("Testpass1");
		driver.findElement(By.name("Login")).click();
	}

	@Then("^I Activate the device$")
	public void i_Activate_the_device() throws Throwable 
	{
		Thread.sleep(3000);
		driver.findElement(By.name("Activate This Device")).click();
	}

	@Then("^I press Send on SMS screen$")
	public void i_press_Send_on_SMS_screen() throws Throwable 
	{
		Thread.sleep(2000);
		driver.findElement(By.name("sendButton")).click();
	}

	@Then("^I Start Messaging$")
	public void i_Start_Messaging() throws Throwable 
	{
		Thread.sleep(2000);
		driver.findElement(By.name("Start Messaging")).click();
	}

	@Then("^Allow Notifications$")
	public void allow_Notifications() throws Throwable 
	{
		Thread.sleep(3000);
		driver.findElement(By.name("Allow Notifications")).click();
	}

	@Then("^I enter a new email address$")
	public void i_enter_a_new_email_address() throws Throwable 
	{
		driver.findElement(By.name("Email or Username")).sendKeys(RandomStringUtils.randomNumeric(4) + "@Tigertext.com");
	}

	@Then("^I enter a new Password$")
	public void i_enter_a_new_Password() throws Throwable 
	{
		driver.findElement(By.name("Enter password")).sendKeys("Testpass3!");
	}

	@Then("^confirm the Password$")
	public void confirm_the_Password() throws Throwable 
	{
		driver.findElement(By.name("Confirm password")).sendKeys("Testpass3!");
		driver.findElement(By.name("Next")).click();
	}

	@Then("^I Start Messaging with new User$")
	public void i_Start_Messaging_with_new_User() throws Throwable 
	{
		driver.findElement(By.name("First Name")).sendKeys("X");
		driver.findElement(By.name("Last Name")).sendKeys("Y");
		driver.findElement(By.name("Next")).click();
	}
	
	@Then("^I am on Inbox and need to verify email$")
	public void i_am_on_Inbox_and_need_to_verify_email() throws Throwable 
	{
		Thread.sleep(2000);
		IOSElement element = driver.findElement(By.name("Verify Your Work Email"));
		String txt = element.getText();
		Assert.assertEquals("Verify Your Work Email", txt);
	}
	
	@Then("^I pick the Contacts User$")
	public void i_pick_the_Contacts_User() throws Throwable 
	{
		existingUser page = new existingUser(driver);
		page.pickContactUser();
	}
	
	@Then("^I hit Return button$")
	public void i_hit_Return_button() throws Throwable 
	{
		existingUser page = new existingUser(driver);
		page.pressReturn();
	}

	
	@Given("^I go to the Contacts organization$")
	public void i_go_to_the_Contacts_organization() throws Throwable 
	{
		existingUser page = new existingUser(driver);
		page.contactsSpinnerOrg();
		page.contactsOrg();
	}

	@Then("^I go to the Settings tab$")
	public void i_go_to_the_Settings_tab() throws Throwable 
	{
		Thread.sleep(3000);
		settingsPO page = new settingsPO(driver);
		page.clickSettings();
	}

	@Then("^Log out of the application$")
	public void log_out_of_the_application() throws Throwable 
	{
		settingsPO page = new settingsPO(driver);
		page.loutSettings();
		page.lOutPopup();
	}

}


