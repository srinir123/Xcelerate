package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Journals_Ext_SUMD;
import com.ScreenFunctions.Login;

public class Tc_13_Journals_Ext_SUMD extends GenericMethods{

	@Test
	public static void evaluateTestcase() throws Exception {
		int itr=getmaxrownumber("iteration","Login");
		int subitr=getmaxrownumber("Sub_iteration","Journals_Ext_SUMD");

		GenericMethods.LaunchBrowser("chrome");
         Login lgn=PageFactory.initElements(driver, Login.class);
         
         //Dashboard db=PageFactory.initElements(driver, Dashboard.class);

         Journals_Ext_SUMD jnls=PageFactory.initElements(driver, Journals_Ext_SUMD.class);

      	for(int i=1;i<=itr;i++) 	
      	{
		lgn.launch_Application(i);
		//db.EntitySearch(); 
		for(int j=1;j<=subitr;j++) 	
		{
        jnls.Journals_Ext_SUMD(i,j);		

	}
	}
      	driver.quit();
      	Thread.sleep(5000);
}
}

