package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Login;
import com.ScreenFunctions.PaymentImport;
import com.ScreenFunctions.Review_Importfiles;

public class Tc_04_PaymentImport extends GenericMethods {

	@Test
	public static void evaluateTestcase() throws Exception
	{
		GenericMethods.LaunchBrowser("chrome");
Login lgn=PageFactory.initElements(driver, Login.class);

//Dashboard db=PageFactory.initElements(driver, Dashboard.class);

PaymentImport pi=PageFactory.initElements(driver, PaymentImport.class);
Review_Importfiles rif=PageFactory.initElements(driver, Review_Importfiles.class);


lgn.launch_Application();
Thread.sleep(2000);
pi.PaymentImport();
rif.Review_Importfiles();
Thread.sleep(5000);
	}
	

}
