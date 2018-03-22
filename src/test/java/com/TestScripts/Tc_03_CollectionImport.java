package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.CollectionImport;
import com.ScreenFunctions.Login;
import com.ScreenFunctions.Review_Importfiles;

public class Tc_03_CollectionImport extends GenericMethods {

	@Test
	public static void evaluateTestcase() throws Exception
	{
		GenericMethods.LaunchBrowser("chrome");
Login lgn=PageFactory.initElements(driver, Login.class);

//Dashboard db=PageFactory.initElements(driver, Dashboard.class);

CollectionImport cpb=PageFactory.initElements(driver, CollectionImport.class);
Review_Importfiles rif=PageFactory.initElements(driver, Review_Importfiles.class);


lgn.launch_Application();
Thread.sleep(4000);
//db.EntitySearch(); 
cpb.CollectionImport();
rif.Review_Importfiles();

Thread.sleep(5000);

	}
	

}
