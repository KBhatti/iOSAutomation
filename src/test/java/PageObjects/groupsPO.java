package PageObjects;


import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

import org.openqa.selenium.support.PageFactory;

public class groupsPO 
{
	public groupsPO(IOSDriver<IOSElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@iOSFindBy(name="Settings Tab")
	public IOSElement settingsScrn;
	 
	@iOSFindBy(name="Logout")
	public IOSElement lout;
	 
	
	public void clickSettings()
	{
		settingsScrn.click();
	} 
	
	public void logOut()
	{ 
		lout.click();
	}

}
