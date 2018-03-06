package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Login;
import com.ScreenFunctions.NominatedPayments_SUMD;

public class Tc_07_NominatedPayments_SUMD extends GenericMethods{

	@Test
	public static void evaluateTestcase() throws Exception {
		int itr=getmaxrownumber("iteration","Login");
		int subitr=getmaxrownumber("Sub_iteration","NominatedPayments_SUMD");

		GenericMethods.LaunchBrowser("chrome");
         Login lgn=PageFactory.initElements(driver, Login.class);
         
         //Dashboard db=PageFactory.initElements(driver, Dashboard.class);

         NominatedPayments_SUMD np=PageFactory.initElements(driver, NominatedPayments_SUMD.class);
         
     	for(int i=1;i<=itr;i++) 	
     	{

		lgn.launch_Application(i);
		//db.EntitySearch(); 
		for(int j=1;j<=subitr;j++) 	
		{
		np.NominatedPayments_SUMD(i,j);

		

	}

}
driver.quit();
	}
}