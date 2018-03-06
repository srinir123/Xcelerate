package com.ScreenFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericMethods;

public class Devurl extends GenericMethods {
	@FindBy(how=How.XPATH,using="/html/body/app-root/div/div/div/div[1]/app-lab-manager-branch-list[1]/div/div[2]/div/app-lab-manager-branch[11]/div/div/a/i")
	public static WebElement Dev_Smilink; 
	
	@FindBy(how=How.ID,using="txtUsername")
	public static WebElement Edi_Username;
	
	@FindBy(how=How.ID,using="txtPassword")
	public static WebElement Edi_Password;
	
	@FindBy(how=How.ID,using="btnLogin")
	public static WebElement Btn_Loginbtn;



public static void Devurl() throws Exception {
	waitForElement(Dev_Smilink);
	Dev_Smilink.click();
	waitForElement(Edi_Username);
	Edi_Username.sendKeys("lancen");
	Edi_Password.sendKeys("P@ssw0rd");
	 Btn_Loginbtn.click();
	}
}
