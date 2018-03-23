package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.CollectionImport_MUMD;
import com.ScreenFunctions.Dashboard;
import com.ScreenFunctions.Login;

public class Tc_03_CollectionImport_MUMD extends GenericMethods {

	@Test
	public static void evaluateTestcase() throws Exception
	{
		int maxnumber=getmaxrownumber("iteration","Login");
		
GenericMethods.LaunchBrowser("chrome");
Login lgn=PageFactory.initElements(driver, Login.class);

Dashboard db=PageFactory.initElements(driver, Dashboard.class);

CollectionImport_MUMD cpb=PageFactory.initElements(driver, CollectionImport_MUMD.class);

for(int i=1;i<=maxnumber;i++) 	
{

lgn.launch_Application(i);
Thread.sleep(4000);
//db.EntitySearch(); 
cpb.CollectionImport_MUMD(i);

	}
driver.quit();
Thread.sleep(5000);

	}
	
}

