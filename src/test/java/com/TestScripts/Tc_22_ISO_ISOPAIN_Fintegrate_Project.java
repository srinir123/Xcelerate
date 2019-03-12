package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Authorization_ISOPAIN;
import com.ScreenFunctions.ISOPAIN;
import com.ScreenFunctions.Login;

public class Tc_22_ISO_ISOPAIN_Fintegrate_Project extends GenericMethods{

	@Test
	public static void evaluateTestcase() throws Exception {
		
		GenericMethods.LaunchBrowser("chrome");
        Login lgn=PageFactory.initElements(driver, Login.class);
  

         ISOPAIN iso=PageFactory.initElements(driver, ISOPAIN.class);
         Authorization_ISOPAIN aiso=PageFactory.initElements(driver, Authorization_ISOPAIN.class);
	
		lgn.launch_Application();
		iso.ISOPAIN();
		lgn.launch_Application1();
		Thread.sleep(3000);
		aiso.Authorization_ISOPAIN();
		Thread.sleep(5000);
		


	}

}
