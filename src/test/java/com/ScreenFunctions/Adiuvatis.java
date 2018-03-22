package com.ScreenFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericMethods;

public class Adiuvatis extends GenericMethods{

	@FindBy(how=How.XPATH,using="//input[@name='UserId']")
	public static WebElement Edi_Username;
	
	@FindBy(how=How.XPATH,using="//input[@name='Password']")
	public static WebElement Edi_Password;
	



public void Adiuvatis() throws Exception   
{
	waitForElement(Edi_Username);
	Edi_Username.sendKeys("srinivas");
	Edi_Password.sendKeys("ad153sr");
	

}
}

