package com.ScreenFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericMethods;

public class Ad extends GenericMethods{

	@FindBy(how=How.XPATH,using="//*[@id='TABLOGINWINDOW']/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[4]/td[3]/input")
	public static WebElement Edi_Username;
	
	@FindBy(how=How.XPATH,using="//*[@id='TABLOGINWINDOW']/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[6]/td[3]/input")
	public static WebElement Edi_Password;
	



public void AdLogin() throws Exception   
{
	waitForElement(Edi_Username);
	Edi_Username.sendKeys("srinivas");
	Edi_Password.sendKeys("ad153sr");
	

}
}

