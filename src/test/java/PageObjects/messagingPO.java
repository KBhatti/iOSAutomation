package PageObjects;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

import org.openqa.selenium.support.PageFactory;

public class messagingPO 
{
	public messagingPO(IOSDriver<IOSElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@iOSFindBy(name="Attachment Button")
	public IOSElement attchbutton;
	
	@iOSFindBy(name="Take Photo or Video")
	public IOSElement phtvid;
	
	@iOSFindBy(name="Record Audio")
	public IOSElement recaud;
	
	@iOSFindBy(name="audio record")
	public IOSElement tapAudio;
	
	@iOSFindBy(name="audio recording")
	public IOSElement tapStopAudio;
	
	@iOSFindBy(name="Send Audio")
	public IOSElement sndAudio;
	
	@iOSFindBy(name="PhotoCapture")
	public IOSElement phCapture;
	
	@iOSFindBy(name="Use Photo")
	public IOSElement uphoto;  
	
	@iOSFindBy(name="VideoCapture")
	public IOSElement vidCaptureNStop;
	
	@iOSFindBy(name="Use Video")
	public IOSElement usVid;  
	
	@iOSFindBy(name="Cancel Compose")
	public IOSElement convDone;
	
	@iOSFindBy(name="Text Field")
	public IOSElement msgField;
	
	@iOSFindBy(name="Send Button")
	public IOSElement sndButton;
	
	@iOSFindBy(name="play")
	public IOSElement playAud;
	
	@iOSFindBy(name="Done")
	public IOSElement vidDone;
	
	@iOSFindBy(name="Back")
	public IOSElement convChecked;
	
	@iOSFindBy(name="Recall")
	public IOSElement rcll;
	
	@iOSFindBy(name="Resend")
	public IOSElement rsnd;
	
	@iOSFindBy(name="Forward")
	public IOSElement fwd;
	
	@iOSFindBy(name="Forward")
	public IOSElement fwdMsg;
	
	public void attchmentBtn()
	{
		attchbutton.click();
	} 
	
	public void phtoOrvid()
	{
		phtvid.click();
	} 
	
	public void capturePhoto()
	{
		phCapture.click();
	} 
	
	public void usePhot0()
	{
		uphoto.click();
	} 
	
	public void recordAudio()
	{
		recaud.click();
	} 
	
	public void tapToRecordAudio()
	{
		tapAudio.click();
	} 
	
	public void tapToStopRecordAudio()
	{
		tapStopAudio.click();
	} 
	
	public void tapToSendAudio()
	{
		sndAudio.click();
	} 
	
	public void recordAndStopVideo()
	{
		vidCaptureNStop.click();
	} 
	
	public void useVideo()
	{
		usVid.click();
	} 
	
	public void outOfConvo()
	{
		convDone.click();
	}

	public void playAudio()
	{
		playAud.click();
	} 
	
	public void videoDone()
	{
		vidDone.click();
	} 
	
	public void sendMessage(String message)
	{
		msgField.sendKeys(message);
		sndButton.click();
	}
	
	public void recallConvo()
	{
		rcll.click();
	} 
	
	public void resendConvo()
	{
		rsnd.click();
	}
	
	public void forwardConvo()
	{
		fwd.click();
	} 
	
	public void forwardToUser()
	{
		fwdMsg.click();
	} 
	
}
