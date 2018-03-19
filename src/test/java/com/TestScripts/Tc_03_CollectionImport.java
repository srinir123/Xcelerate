package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.CollectionImport;
import com.ScreenFunctions.Login;

public class Tc_03_CollectionImport extends GenericMethods {

	@Test
	public static void evaluateTestcase() throws Exception
	{
		GenericMethods.LaunchBrowser("chrome");
Login lgn=PageFactory.initElements(driver, Login.class);

//Dashboard db=PageFactory.initElements(driver, Dashboard.class);

CollectionImport cpb=PageFactory.initElements(driver, CollectionImport.class);

lgn.launch_Application();
Thread.sleep(4000);
//db.EntitySearch(); 
cpb.CollectionImport();
Thread.sleep(3000);


	}
	

}
