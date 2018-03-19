 package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Login;
import com.ScreenFunctions.Reports_Module;

public class Tc_14_Reports_Module extends GenericMethods{

	@Test
	public static void evaluateTestcase() throws Exception {

		GenericMethods.LaunchBrowser("chrome");
		Login lgn=PageFactory.initElements(driver, Login.class);
		Reports_Module rm=PageFactory.initElements(driver, Reports_Module.class);

			lgn.launch_Application();
			Thread.sleep(5000);
			rm.Reports_Module();
			Thread.sleep(3000);


}	

}
