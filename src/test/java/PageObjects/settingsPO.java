package PageObjects;


import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

import org.openqa.selenium.support.PageFactory;

public class settingsPO 
{
	public settingsPO(IOSDriver<IOSElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@iOSFindBy(name="Settings Tab")
	public IOSElement settingsScrn;
	 
	@iOSFindBy(name="Logout")
	public IOSElement lout;	
	
	@iOSFindBy(name="Yes")
	public IOSElement yay;	

	@iOSFindBy(name="OK")
	public IOSElement pinNotice;	
	
	@iOSFindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAImage[3]")
	public IOSElement chavtr;
	
	@iOSFindBy(name="Take Photo")
	public IOSElement chtkph;
	
	@iOSFindBy(name="PhotoCapture")
	public IOSElement phcaptr;
	
	@iOSFindBy(name="Use Photo")
	public IOSElement uphot;                                                                                                               	
	
	@iOSFindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIASecureTextField[1]")
	public IOSElement currPass;
	
	@iOSFindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIASecureTextField[2]")
	public IOSElement newPass;
	
	@iOSFindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIASecureTextField[3]")
	public IOSElement reNewPass;
	
	@iOSFindBy(name="Back Button")
	public IOSElement bckBtn;	
	
	@iOSFindBy(name="Organizations")
	public IOSElement orgz;
	
	@iOSFindBy(name="cc.net")
	public IOSElement ctdOrg;	
	
	@iOSFindBy(name="Disconnect Account")
	public IOSElement dAcct;
	
	@iOSFindBy(name="Yes")
	public IOSElement yesDc;
	
	@iOSFindBy(name="Back Button")
	public IOSElement bckToSettings;
	
	@iOSFindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]")
	public IOSElement usrSettings;
	
	@iOSFindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIATextField[1]")
	public IOSElement updStat;
	
	@iOSFindBy(name="Done")
	public IOSElement dnbtn;
	
	@iOSFindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[2]/UIATextField[1]")
	public IOSElement nm;
	
	@iOSFindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[3]/UIATextField[1]")
	public IOSElement ttle;
	
	@iOSFindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[4]/UIATextField[1]")
	public IOSElement dpt;
	
	@iOSFindBy(name="Save")
	public IOSElement svbtn;
	
	@iOSFindBy(name="Back")
	public IOSElement xupdusr;
	
	@iOSFindBy(name="Save")
	public IOSElement camsvbtn;

	
	public void clickSettings()
	{
		settingsScrn.click();
	} 
	
	public void loutSettings()
	{ 
		lout.click();
	}	
	
	public void lOutPopup()
	{ 
		yay.click();
	}
	
	public void pinPopup()
	{ 
		pinNotice.click();
	}	
	
	public void currentPassword()
	{ 
		currPass.sendKeys("Testpass1");
	}
	
	public void backButton()
	{ 
		bckBtn.click();
	}
	
	public void organizations()
	{ 
		orgz.click();
	}
	
	public void createdOrg()
	{ 
		ctdOrg.click();
	}
	
	public void disconnOrg()
	{ 
		dAcct.click();
	}
	
	public void yesDisconnect()
	{ 
		yesDc.click();
	}
	
	public void name()
	{ 
		usrSettings.click();
	}
	
	public void updateStatus(String status)
	{ 
		updStat.sendKeys(status);
	}
	
	public void doneButton()
	{
		dnbtn.click();
	}
	
	public void updateName(String name)
	{ 
		nm.clear();
		nm.sendKeys(name);
	}
	
	public void updateTitle(String title)
	{ 
		ttle.clear();
		ttle.sendKeys(title);
	}
	
	public void updateDepartment(String department)
	{ 
		dpt.clear();
		dpt.sendKeys(department);
	}
	
	public void saveButton()
	{ 
		svbtn.click();
	}
	
	public void xOutUpdates()
	{
		xupdusr.click();
	}
	
	public void changeAvatar()
	{
		chavtr.click();
	}
	
	public void takeNewPic()
	{
		chtkph.click();
	}
	
	public void capturePic()
	{
		phcaptr.click();
	}
	
	public void usePhoto()
	{
		uphot.click();
	}

	public void saveAvatar()
	{
		camsvbtn.click();
	}
	
}


