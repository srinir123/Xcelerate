 package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.ACBEntryclass;
import com.ScreenFunctions.Login;

public class Tc_27_ISO_AcbEntryclassSetup extends GenericMethods{

	@Test
	public static void evaluateTestcase() throws Exception {
		
		GenericMethods.LaunchBrowser("chrome");
        Login lgn=PageFactory.initElements(driver, Login.class);
  

         ACBEntryclass acb=PageFactory.initElements(driver, ACBEntryclass.class);
         //Authorization_ISOPAIN aiso=PageFactory.initElements(driver, Authorization_ISOPAIN.class);
	
		lgn.launch_Application();
		acb.ACBEntryclass();
//		lgn.launch_Application1();
//		Thread.sleep(3000);
//		aiso.Authorization_ISOPAIN();
//		Thread.sleep(5000);
		


	}

}
