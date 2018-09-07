package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Login;
import com.ScreenFunctions.NominatedpmtParties;

public class Tc_24_Add_Nominatedpmts extends GenericMethods {

	@Test
	public static void evaluateTestcase() throws Exception
	{
		GenericMethods.LaunchBrowser("chrome");
Login lgn=PageFactory.initElements(driver, Login.class);

//Dashboard db=PageFactory.initElements(driver, Dashboard.class);

NominatedpmtParties np=PageFactory.initElements(driver, NominatedpmtParties.class);
//Review_Importfiles rif=PageFactory.initElements(driver, Review_Importfiles.class);

lgn.launch_Application();
Thread.sleep(4000);
//db.EntitySearch(); 
np.NominatedpmtParties();
//rif.Review_Importfiles();
Thread.sleep(5000);

	}
	

}
