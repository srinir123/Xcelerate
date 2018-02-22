package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Dashboard;
import com.ScreenFunctions.Journals;
import com.ScreenFunctions.Journals_MUMD;
import com.ScreenFunctions.Journals_SUMD;
import com.ScreenFunctions.Login;
import com.ScreenFunctions.NominatedPayments;

public class Tc_08_Journals_SUMD extends GenericMethods{

	@Test
	public static void evaluateTestcase() throws Exception {
		int itr=getmaxrownumber("iteration","Login");
		int subitr=getmaxrownumber("Sub_iteration","Journals_SUMD");

		GenericMethods.LaunchBrowser("chrome");
         Login lgn=PageFactory.initElements(driver, Login.class);
         
         Dashboard db=PageFactory.initElements(driver, Dashboard.class);

         Journals_SUMD jnls=PageFactory.initElements(driver, Journals_SUMD.class );

     	for(int i=1;i<=itr;i++) 	
     	{
		lgn.launch_Application(i);
		//db.EntitySearch(); 
		for(int j=1;j<=subitr;j++) 	
		{
        jnls.Journals_SUMD(i,j);		

	}
	}
     	driver.quit();

}
	
}

