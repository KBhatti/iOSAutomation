package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObjects.settingsPO;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class settingsSD extends AbstractPageSD
{
	IOSDriver<IOSElement> driver = getDriver();
	WebDriver wdriver = getWebDriver();

	
	@Then("^I press OK on the PIN Notice popup$")
	public void i_press_OK_on_the_PIN_Notice_popup() throws Throwable 
	{
		settingsPO page = new settingsPO(driver);
		page.pinPopup();
	}

	@Then("^the Set PIN screen appears$")
	public void the_Set_PIN_screen_appears() throws Throwable 
	{
		IOSElement element = driver.findElement(By.name("Set PIN"));
		String text = element.getAttribute("name");
		Assert.assertEquals("Set PIN", text);
	}

	@Then("^I enter the PIN$")
	public void i_enter_the_PIN() throws Throwable
	{
		driver.findElement(By.name("Button 0")).click();
		driver.findElement(By.name("Button 0")).click();
		driver.findElement(By.name("Button 0")).click();
		driver.findElement(By.name("Button 0")).click();
	}

	@Then("^Confirm the PIN$")
	public void confirm_the_PIN() throws Throwable
	{
		driver.findElement(By.name("Button 0")).click();
		driver.findElement(By.name("Button 0")).click();
		driver.findElement(By.name("Button 0")).click();
		driver.findElement(By.name("Button 0")).click();
	}

	@Then("^I change the avatar by taking a picture$")
	public void i_change_the_avatar_by_taking_a_picture() throws Throwable 
	{
		settingsPO page = new settingsPO(driver);
		page.changeAvatar();
		page.takeNewPic();
		page.capturePic();
		Thread.sleep(3000);
		page.usePhoto();
	}
	
	@Then("^I save the new avatar$")
	public void i_save_the_new_avatar() throws Throwable 
	{
		settingsPO page = new settingsPO(driver);
		page.saveAvatar();
	}
	
	@Then("^I click on \"([^\"]*)\"$")
	public void i_click_on(String settingsSection) throws Throwable 
	{
		driver.findElement(By.name(settingsSection)).click();
	}

	@Then("^I enter the Current Password$")
	public void i_enter_the_Current_Password() throws Throwable 
	{
		settingsPO page = new settingsPO(driver);
		page.currentPassword();
	}

	@Then("^I enter the Enter New Password$")
	public void i_enter_the_Enter_New_Password() throws Throwable 
	{
		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIASecureTextField[2]")).sendKeys("Testpass0");
	}

	@Then("^I enter the Re-enter New Password$")
	public void i_enter_the_Re_enter_New_Password() throws Throwable 
	{
		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIASecureTextField[3]")).sendKeys("Testpass0");
	}
	
	@Then("^I press the Back button$")
	public void i_press_the_Back_button() throws Throwable 
	{
		settingsPO page = new settingsPO(driver);
		page.backButton();
	}
	
	@Then("^I go to \"([^\"]*)\" section$")
	public void i_go_to_section(String helpAbout) throws Throwable 
	{
		driver.findElement(By.name(helpAbout)).click();
	}

	@Then("^I verify that the FAQ page loads$")
	public void i_verify_that_the_FAQ_page_loads() throws Throwable 
	{
		IOSElement element = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]"));
		String txt = element.getText();
		Assert.assertFalse(txt.contains("iOS – FAQs"));
	}

	@Then("^I verify that the Privacy Policy page loads$")
	public void i_verify_that_the_Privacy_Policy_page_loads() throws Throwable 
	{	
		IOSElement element = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIAScrollView[1]/UIAScrollView[1]/UIAWebView[1]"));
		String txt = element.getText();
		Assert.assertFalse(txt.contains("Privacy Policy"));
	}
	
	@Then("^I edit the User status$")
	public void i_edit_the_User_status() throws Throwable 
	{	
		settingsPO page = new settingsPO(driver);
		page.updateStatus("editingStatus");
		driver.findElement(By.name("Done")).click();
	}
	
	@Then("^I go to the Organizations section$")
	public void i_go_to_the_Organizations_section() throws Throwable 
	{
		settingsPO page = new settingsPO(driver);
		page.organizations();
	}

	@Then("^select the Org I previously added$")
	public void select_the_Org_I_previously_added() throws Throwable 
	{
		settingsPO page = new settingsPO(driver);
		page.createdOrg();
	}

	@Then("^I Disconnect the Account$")
	public void i_Disconnect_the_Account() throws Throwable 
	{
		settingsPO page = new settingsPO(driver);
		page.disconnOrg();
		page.yesDisconnect();
	}

	@Then("^verify that the org no longer appears in the list$")
	public void verify_that_the_org_no_longer_appears_in_the_list() throws Throwable
	{
		IOSElement element = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]"));
		String txt = element.getText();
		Assert.assertFalse(txt.contains("Kashif Test 0"));
	}
	
	@Then("^I get back to the Settings tab$")
	public void i_get_back_to_the_Settings_tab() throws Throwable
	{
		settingsPO page = new settingsPO(driver);
		page.backButton();
	}
	
	@Then("^I go to the User settings$")
	public void i_go_to_the_User_settings() throws Throwable 
	{
		settingsPO page = new settingsPO(driver);
		page.name();
	}

	@Then("^I update the User Name$")
	public void i_update_the_User_Name() throws Throwable 
	{
		settingsPO page = new settingsPO(driver);
		page.updateName("Name being updated");
	}

	@Then("^I update the User Title$")
	public void i_update_the_User_Title() throws Throwable 
	{
		settingsPO page = new settingsPO(driver);
		page.updateTitle("Title being updated");
	}

	@Then("^I update the User Department$")
	public void i_update_the_User_Department() throws Throwable 
	{
		settingsPO page = new settingsPO(driver);
		page.updateDepartment("Department being updated");
	}

	@Then("^I save the update$") 
	public void i_save_the_update() throws Throwable 
	{
		settingsPO page = new settingsPO(driver);
		page.saveButton();
	}
	
	@Then("^I verify that the Name was successfully updated$")
	public void i_verify_that_the_Name_was_successfully_updated() throws Throwable 
	{
		settingsPO page = new settingsPO(driver);
		String text = page.nm.getText();
		Assert.assertEquals("Name being updated", text);
	}

	@Then("^I verify that the Title was successfully updated$")
	public void i_verify_that_the_Title_was_successfully_updated() throws Throwable 
	{
		settingsPO page = new settingsPO(driver);
		String text = page.ttle.getText();
		Assert.assertEquals("Title being updated", text);
	}

	@Then("^I verify that the Department was successfully updated$")
	public void i_verify_that_the_Department_was_successfully_updated() throws Throwable 
	{
		settingsPO page = new settingsPO(driver);
		String text = page.dpt.getText();
		Assert.assertEquals("Department being updated", text);
	}

	@Then("^I update the settings to their original state and save again$")
	public void i_update_the_settings_to_their_original_state_and_save_again() throws Throwable 
	{
		settingsPO page = new settingsPO(driver);
		page.updateName("T0 U0");
		page.saveButton();
	}

}
