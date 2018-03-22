package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.CollectionImport_Ext_SUMD;
import com.ScreenFunctions.Dashboard;
import com.ScreenFunctions.Login;

public class Tc_11_CollectionImport_Ext_SUMD extends GenericMethods {

	@Test
	public static void evaluateTestcase() throws Exception	{
		int itr=getmaxrownumber("iteration","Login");
		int subitr=getmaxrownumber("Sub_iteration","CollectionImport_Ext_SUMD");

		GenericMethods.LaunchBrowser("chrome");
Login lgn=PageFactory.initElements(driver, Login.class);

Dashboard db=PageFactory.initElements(driver, Dashboard.class);

CollectionImport_Ext_SUMD cpb=PageFactory.initElements(driver, CollectionImport_Ext_SUMD.class);

for(int i=1;i<=itr;i++) 	
{
lgn.launch_Application(i);
Thread.sleep(4000);
//db.EntitySearch();
for(int j=1;j<=subitr;j++) 	
{
cpb.CollectionImport_Ext_SUMD(i,j);

	}
	}
driver.quit();
	}
}
