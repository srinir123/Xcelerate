package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.CollectionImport_Ext;
import com.ScreenFunctions.Login;

public class Tc_11_CollectionImport_Ext extends GenericMethods {

	@Test
	public static void evaluateTestcase() throws Exception
	{
		GenericMethods.LaunchBrowser("chrome");
Login lgn=PageFactory.initElements(driver, Login.class);

//Dashboard db=PageFactory.initElements(driver, Dashboard.class);

CollectionImport_Ext cpb=PageFactory.initElements(driver, CollectionImport_Ext.class);

lgn.launch_Application();
Thread.sleep(4000);
//db.EntitySearch(); 
cpb.CollectionImport_Ext();
Thread.sleep(3000);


	}
	

}
