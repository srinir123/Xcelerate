package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Login;
import com.ScreenFunctions.NominatedPayments_MUMD;

public class Tc_07_NominatedPayments_MUMD extends GenericMethods{

	@Test
	public static void evaluateTestcase() throws Exception {
		int maxnumber=getmaxrownumber("iteration","Login");

		GenericMethods.LaunchBrowser("chrome");
         Login lgn=PageFactory.initElements(driver, Login.class);
         
        // Dashboard db=PageFactory.initElements(driver, Dashboard.class);

         NominatedPayments_MUMD np=PageFactory.initElements(driver, NominatedPayments_MUMD.class);
         
     	for(int i=1;i<=maxnumber;i++) 	
     	{

		lgn.launch_Application(i);
		//db.EntitySearch(); 
		np.NominatedPayments_MUMD(i);
		

		

	}
driver.quit();

}


}