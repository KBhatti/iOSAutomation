package TestCases;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

import org.apache.commons.lang.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class webAdmin extends AbstractPageSD
{
	IOSDriver<IOSElement> driver = getDriver();
	WebDriver wdriver = getWebDriver();

	
	@Given("^I am on the home page$")
	public void i_am_on_the_home_page() throws Throwable 
	{
		WebDriver wdriver = getWebDriver();
		String baseURL = "https://home.tigertext.com/";
	    wdriver.get(baseURL);
	}

	@Then("^I login to TigerText$")
	public void i_login_to_TigerText() throws Throwable 
	{
		wdriver.findElement(By.id("userName")).sendKeys("kashif+test1@tigertext.com");
		wdriver.findElement(By.id("password")).sendKeys("password");
		wdriver.findElement(By.cssSelector("html body div.loginWrapper div.col-a div#standardLogin div.buttonCntr input.btn.btn-success.btn-success-red.btn-success-login")).click();	
	}

	@Then("^click on Settings$")
	public void click_on_Settings() throws Throwable 
	{
		wdriver.findElement(By.className("settings")).click();
	}

	@Then("^I go to the Organizations tab$")
	public void i_go_to_the_Organizations_tab() throws Throwable 
	{
		wdriver.findElement(By.cssSelector("div.orgIcon i.icon-org")).click();
	}

	@Then("^search for \"([^\"]*)\" Oganization$")
	public void search_for_Oganization(String orgName) throws Throwable 
	{
		wdriver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div/div[2]/div/input")).sendKeys(orgName);
		//wdriver.findElement(By.className("div.searchCntr input.input-large.span15 search")).sendKeys(orgName);
		Thread.sleep(2000);
	}

	@Then("^I click on the Org$")
	public void i_click_on_the_Org() throws Throwable 
	{
		wdriver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div/table/tbody/tr/td[1]")).click();
	}

	@Then("^set the PIN Lock value to \"([^\"]*)\"$")
	public void set_the_PIN_Lock_value_to(String dropItem) throws Throwable 
	{
		Select dropDown = new Select(wdriver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div/div[3]/div[4]/div[2]/select")));
		dropDown.selectByVisibleText(dropItem);
	}

	@Then("^I save the changes$")
	public void i_save_the_changes() throws Throwable 
	{
		wdriver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div/div[1]/div/div[2]/button")).click();
		
	}

	@Then("^I login to TigerText with another User$")
	public void i_login_to_TigerText_with_another_User() throws Throwable 
	{
		wdriver.findElement(By.id("userName")).sendKeys("Test0.User0@tigertext.com");
		wdriver.findElement(By.id("password")).sendKeys("Testpass1");
		wdriver.findElement(By.cssSelector("html body div.loginWrapper div.col-a div#standardLogin div.buttonCntr input.btn.btn-success.btn-success-red.btn-success-login")).click();
	}

	@Then("^search for the original User$")
	public void search_for_the_original_User() throws Throwable 
	{
		wdriver.findElement(By.cssSelector("html body div#home_template div.container-fluid div#left div#menuBarCntr div.header.headerCompose div.btnCompose.newConvButton")).click();
		wdriver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div[1]/div[2]/div[1]/ul/li/input")).sendKeys("T0 U0");
		wdriver.findElement(By.xpath("/html/body/div[8]/ul/li/ul/li/div/div")).click();
		Thread.sleep(2000);
	}

	@Then("^send a message to the User$")
	public void send_a_message_to_the_User() throws Throwable 
	{
		wdriver.findElement(By.cssSelector("html body div#home_template div.container-fluid div#left div.mainCntr div.typeCntr div.inputCntr textarea")).sendKeys("random message: " + RandomStringUtils.randomNumeric(6));
		wdriver.findElement(By.cssSelector("html body div#home_template div.container-fluid div#left div.mainCntr div.typeCntr div.send input.button")).click();	
	}
	
	@Then("^I should see the updated status of that User$")
	public void i_should_see_the_updated_status_of_that_User() throws Throwable 
	{
		WebElement element = wdriver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div[4]/div[2]/div/div[1]/div[2]/p"));
		String txt = element.getText();
		Thread.sleep(2000);
		Assert.assertEquals("editingStatus", txt);
	}															

}
