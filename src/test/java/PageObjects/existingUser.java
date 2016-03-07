package PageObjects;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

import org.openqa.selenium.support.PageFactory;

public class existingUser 
{
	public existingUser(IOSDriver<IOSElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@iOSFindBy(name="Email or Username")
	public IOSElement userName;
	
	@iOSFindBy(name="Contats")
	public IOSElement cnts;
	
	@iOSFindBy(name="Add Inbox")
	public IOSElement ainbx;
	
	@iOSFindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]")
	public IOSElement pickContactUsr;
	
	@iOSFindBy(name="return")
	public IOSElement prsRet;
	
	@iOSFindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAElement[1]")
	public IOSElement cntcSpnOrg;
	
	@iOSFindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")
	public IOSElement usrnm;
	
	@iOSFindBy(name="Start")
	public IOSElement strtBtn;
	
	
	public void userName(String usernm)
	{
		userName.sendKeys(usernm);
	}
	
	public void enterUser(String username)
	{
		usrnm.sendKeys(username);
	}
	
	public void addInbox()
	{
		ainbx.click();
	}
	
	public void pickContactUser()
	{
		pickContactUsr.click();
	}
	
	public void pressReturn()
	{
		prsRet.click();
	}
	
	public void contactsOrg()
	{
		cnts.click();
	}
	
	public void contactsSpinnerOrg()
	{
		cntcSpnOrg.click();
	}
	
	public void startButton()
	{
		strtBtn.click();
	}
}
