package com.ScreenFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.GenericFunctions.GenericMethods;


public class VerifyEntity extends GenericMethods{
	

	@FindBy(how=How.XPATH,using="//*[@id='btnAuthAccept']")
	public static WebElement Click_btnAccept;
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Yes']")
	public static WebElement Click_Yes;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnAD']")
	public static WebElement Btn_Activate;
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Yes']")
	public static WebElement Click_Yes1;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnClose']")
	public static WebElement Btn_Close;
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Yes']")
	public static WebElement Click_Yes2;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnLogout2']")
	public static WebElement Btn_logout;
	
	@FindBy(how=How.ID,using="txtUsername")
	public static WebElement Edi_Username;
	
	@FindBy(how=How.ID,using="txtPassword")
	public static WebElement Edi_Password;
	
	@FindBy(how=How.ID,using="btnLogin")
	public static WebElement Btn_Loginbtn;
	
	@FindBy(how=How.ID,using="//*[@id='btnAuthAccept']")
	public static WebElement Btn_Authaccept;
	
	
	
	
	

	
	public static String reset;
	public static String OTP;
	

	public static void VerifyEntity(int i) throws Exception 
	{   

		Thread.sleep(6000);
		
		System.out.println(story1.taskid);
		driver.findElement(By.xpath("//td[text()='"+NewEntityCreation_Story1.taskid+"']")).click();

	waitForElement(Btn_Authaccept);
	Btn_Authaccept.click();

	waitForElement(Click_Yes);
	Click_Yes.click();
	
	
	}
}