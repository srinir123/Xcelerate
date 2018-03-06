 package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Authorization_ISOPAIN;
import com.ScreenFunctions.ISOPAIN;
import com.ScreenFunctions.Login;

public class ISOPAIN_Fintegrate_Project extends GenericMethods{

	@Test
	public static void evaluateTestcase() throws Exception {
		
		//int maxnumber=getmaxrownumber("iteration","Login");
		GenericMethods.LaunchBrowser1("chrome");
		//Devurl durl=PageFactory.initElements(driver, Devurl.class);
        Login lgn=PageFactory.initElements(driver, Login.class);
  

         ISOPAIN iso=PageFactory.initElements(driver, ISOPAIN.class);
         Authorization_ISOPAIN aiso=PageFactory.initElements(driver, Authorization_ISOPAIN.class);
		//Thread.sleep(3000);
		//durl.Devurl();
		lgn.launch_Application();
	

		iso.ISOPAIN();
		
		lgn.launch_Application2();
		Thread.sleep(3000);
		aiso.Authorization_ISOPAIN();
		


	}

}
