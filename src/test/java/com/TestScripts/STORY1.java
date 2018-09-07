package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Auth_Scene3;
import com.ScreenFunctions.Authorization_NewEntity_Story1;
import com.ScreenFunctions.Authorization_NewUser_Story1;
import com.ScreenFunctions.Login;
import com.ScreenFunctions.NewEntityCreation_Story1;
import com.ScreenFunctions.Scene3;
import com.ScreenFunctions.SecondNewEntityCreation_Story1;
import com.ScreenFunctions.story1;

public class STORY1 extends GenericMethods
{

	@Test
	public static void evaluateTestcase() throws Exception
	{
GenericMethods.LaunchBrowser("chrome");

Login lgn=PageFactory.initElements(driver, Login.class);
int itr=getmaxrownumber("iteration","Login");
int subitr=getmaxrownumber("Sub_iteration","NewUser_creation");

story1 nuc=PageFactory.initElements(driver, story1.class);

Login lgn1= PageFactory.initElements(driver, Login.class);

Authorization_NewUser_Story1 Anu= PageFactory.initElements(driver, Authorization_NewUser_Story1.class);

NewEntityCreation_Story1 nec=PageFactory.initElements(driver, NewEntityCreation_Story1.class);

Authorization_NewEntity_Story1 Ane=PageFactory.initElements(driver, Authorization_NewEntity_Story1.class);

SecondNewEntityCreation_Story1 snec=PageFactory.initElements(driver, SecondNewEntityCreation_Story1.class);

Scene3 sn4=PageFactory.initElements(driver, Scene3.class);

Auth_Scene3 Asn3=PageFactory.initElements(driver, Auth_Scene3.class);

//for(int i=1;i<=itr;i++) 	
//{
//lgn.launch_Application(i);
//Thread.sleep(2000);
//nuc.story1(i); 
//}
//for(int i=1;i<=itr;i++) 	
//{
//lgn1.launch_Application2();
//Anu.Authorization_NewUser_Story1(i);
//if (i==1){
//nec.NewEntityCreation_Story1(i);
//lgn1.launch_Application1();
//Ane.Authorization_NewEntity_Story1(i);	
//lgn1.launch_Application1();
//}
//else if (i==2);
//{
//	//iso.ISOPAIN();
//	
//}
//
//
//
//	}
//	
//driver.quit();
//Thread.sleep(5000);
//}
//
//}






for(int i=1;i<=2;i++) 	
{
lgn.launch_Application(i);
Thread.sleep(2000);
nuc.story1(i); 
}
lgn1.launch_Application2();
Anu.Authorization_NewUser_Story1();
nec.NewEntityCreation_Story1();
lgn1.launch_Application1();
Ane.Authorization_NewEntity_Story1();	
snec.SecondNewEntityCreation_Story1();
//lgn1.launch_Application8();
//sn4.Scene3();
lgn1.launch_Application1();
Asn3.Auth_Scene3();
lgn1.launch_Application7();




	
//driver.quit();
//Thread.sleep(5000);
}

}



