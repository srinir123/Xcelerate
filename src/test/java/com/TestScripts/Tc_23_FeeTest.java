package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.FeeRun;
import com.ScreenFunctions.Login;

public class Tc_23_FeeTest extends GenericMethods {

	@Test
	public static void evaluateTestcase() throws Exception
	{
		GenericMethods.LaunchBrowser("chrome");
Login lgn=PageFactory.initElements(driver, Login.class);


FeeRun fr=PageFactory.initElements(driver, FeeRun.class);

lgn.launch_Application();
fr.FeeRun();
Thread.sleep(3000);

	}
	

}
