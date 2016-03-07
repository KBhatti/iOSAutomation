package PageObjects;


import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

import org.openqa.selenium.support.PageFactory;

public class inboxPO 
{

	public inboxPO(IOSDriver<IOSElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@iOSFindBy(name="Inbox Tab")
	public IOSElement inbxScrn;
	 
	@iOSFindBy(name="Comose Button")
	public IOSElement newMsg;
	 
	@iOSFindBy(name="To Text Field")
	public IOSElement toField;
	
	@iOSFindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[2]")
	public IOSElement pickUsr;

	@iOSFindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIASearchBar[1]") 
	public IOSElement srch;
	
	@iOSFindBy(name="5 Unread Messages") 
	public IOSElement unrdCnt;

	@iOSFindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/UIATableCell[1]") 
	public IOSElement topUser;
	
	
	public void ClickInbox()
	{
		inbxScrn.click();
	} 
	
	public void newMessage()
	{ 
		newMsg.click();
	}
	
	public void enterUser(String user)
	{
		toField.sendKeys(user);
	}
	
	public void pickUser()
	{
		pickUsr.click();
	}
	
	public void searchUser(String username)
	{
		srch.sendKeys(username);
	}
	
	public void userConvo()
	{
		topUser.click();
	}
	
}
