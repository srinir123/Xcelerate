 package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Login;
import com.ScreenFunctions.NewEntityCreation_ISOStory;

public class Test extends GenericMethods{


	public static void evaluateTestcase() throws Exception {

		GenericMethods.LaunchBrowser("chrome");
		Login lgn1= PageFactory.initElements(driver, Login.class);
		NewEntityCreation_ISOStory nec=PageFactory.initElements(driver, NewEntityCreation_ISOStory.class);

		lgn1.launch_Application14();
		nec.NewEntityCreation_ISOStory();

}	

}
