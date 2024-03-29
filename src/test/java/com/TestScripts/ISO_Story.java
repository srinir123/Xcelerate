package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.ACBEntryclass;
import com.ScreenFunctions.ACBEntryclass_Pmt;
import com.ScreenFunctions.AddNewB2BUser_ISO_Story;
import com.ScreenFunctions.Auth_Scene3;
import com.ScreenFunctions.Authorization_CollImport_ISOStory;
import com.ScreenFunctions.Authorization_Journal;
import com.ScreenFunctions.Authorization_MCP_ISOStory;
import com.ScreenFunctions.Authorization_NewEntity_Story1;
import com.ScreenFunctions.Authorization_NewUser_ISO_Story;
import com.ScreenFunctions.Authorization_NewUser_Story1;
import com.ScreenFunctions.Authorization_PmtImport_ISOStory;
import com.ScreenFunctions.Autorization_Recall;
import com.ScreenFunctions.B2BSetup;
import com.ScreenFunctions.B2BSetup_CollectionXSD;
import com.ScreenFunctions.B2BSetup_PaymentXSD;
import com.ScreenFunctions.BankBatchCreation;
import com.ScreenFunctions.CollPeriodBalances_MCC_ISO_Story;
import com.ScreenFunctions.CollPeriodBalances_MCP_ISO_Story;
import com.ScreenFunctions.CollectionImport;
import com.ScreenFunctions.CollectionImport_ISO_Story;
import com.ScreenFunctions.FinancialRelease;
import com.ScreenFunctions.FissionTest;
import com.ScreenFunctions.InterestGroupNSubAccount_Creation;
import com.ScreenFunctions.Journal_ISO_Story;
import com.ScreenFunctions.Level3Authorizations_TransactionToSaveCSVnPDFnTXTnReportCheck;
import com.ScreenFunctions.Login;
import com.ScreenFunctions.NewB2BUserCreation_ISO_Story;
import com.ScreenFunctions.NewEntityCreation_ISOStory;
import com.ScreenFunctions.NewEntityCreation_Story1;
import com.ScreenFunctions.NewEntity_creation;
import com.ScreenFunctions.NewServiceChannel_ISO_Story;
import com.ScreenFunctions.NominatedPayments_ISO_Story;
import com.ScreenFunctions.PaymentImport_ISO_Story;
import com.ScreenFunctions.Recall_Payments;
import com.ScreenFunctions.Review_CImportfiles;
import com.ScreenFunctions.Review_PImportfiles;
import com.ScreenFunctions.Scene3;
import com.ScreenFunctions.SecondNewEntityCreation_Story1;
import com.ScreenFunctions.iso_story;
import com.ScreenFunctions.story1;

public class ISO_Story extends GenericMethods
{

	@Test
	public static void evaluateTestcase() throws Exception
	{
GenericMethods.LaunchBrowser("chrome");

Login lgn=PageFactory.initElements(driver, Login.class);
int itr=getmaxrownumber("iteration","Login");
//int subitr=getmaxrownumber("Sub_iteration","NewUser_creation");

iso_story Is=PageFactory.initElements(driver, iso_story.class);

Login lgn1= PageFactory.initElements(driver, Login.class);

Authorization_NewUser_ISO_Story Anu= PageFactory.initElements(driver, Authorization_NewUser_ISO_Story.class);

NewB2BUserCreation_ISO_Story nbc=PageFactory.initElements(driver, NewB2BUserCreation_ISO_Story.class);
AddNewB2BUser_ISO_Story ab2b=PageFactory.initElements(driver, AddNewB2BUser_ISO_Story.class);
B2BSetup_CollectionXSD b2bc=PageFactory.initElements(driver, B2BSetup_CollectionXSD.class);

ACBEntryclass acb=PageFactory.initElements(driver, ACBEntryclass.class);
ACBEntryclass_Pmt acbp=PageFactory.initElements(driver, ACBEntryclass_Pmt.class);
NewServiceChannel_ISO_Story nsc=PageFactory.initElements(driver, NewServiceChannel_ISO_Story.class);
B2BSetup_PaymentXSD b2bp=PageFactory.initElements(driver, B2BSetup_PaymentXSD.class);
NewEntityCreation_ISOStory nec=PageFactory.initElements(driver, NewEntityCreation_ISOStory.class);
//Authorization_NewEntity_Story1 Ane=PageFactory.initElements(driver, Authorization_NewEntity_Story1.class);

InterestGroupNSubAccount_Creation igsb=PageFactory.initElements(driver, InterestGroupNSubAccount_Creation.class);

CollectionImport_ISO_Story cis=PageFactory.initElements(driver, CollectionImport_ISO_Story.class);
Authorization_PmtImport_ISOStory authpimport=PageFactory.initElements(driver, Authorization_PmtImport_ISOStory.class);
Review_CImportfiles rcif=PageFactory.initElements(driver, Review_CImportfiles.class);
Review_PImportfiles rpif=PageFactory.initElements(driver, Review_PImportfiles.class);
Authorization_CollImport_ISOStory authcimport=PageFactory.initElements(driver, Authorization_CollImport_ISOStory.class);
PaymentImport_ISO_Story pis=PageFactory.initElements(driver, PaymentImport_ISO_Story.class);
//CollPeriodBalances_MCC_ISO_Story mcc=PageFactory.initElements(driver, CollPeriodBalances_MCC_ISO_Story.class);
CollPeriodBalances_MCC_ISO_Story mcc=PageFactory.initElements(driver, CollPeriodBalances_MCC_ISO_Story.class);
CollPeriodBalances_MCP_ISO_Story mcp=PageFactory.initElements(driver, CollPeriodBalances_MCP_ISO_Story.class); 
Authorization_MCP_ISOStory amcp=PageFactory.initElements(driver, Authorization_MCP_ISOStory.class);
NominatedPayments_ISO_Story npi=PageFactory.initElements(driver, NominatedPayments_ISO_Story.class); 
FinancialRelease fs=PageFactory.initElements(driver, FinancialRelease.class);
BankBatchCreation bbc=PageFactory.initElements(driver, BankBatchCreation.class);
Level3Authorizations_TransactionToSaveCSVnPDFnTXTnReportCheck trnchk=PageFactory.initElements(driver, Level3Authorizations_TransactionToSaveCSVnPDFnTXTnReportCheck.class);
Journal_ISO_Story j=PageFactory.initElements(driver, Journal_ISO_Story.class);
Authorization_Journal aj=PageFactory.initElements(driver, Authorization_Journal.class);
Recall_Payments r=PageFactory.initElements(driver, Recall_Payments.class);
Autorization_Recall ar=PageFactory.initElements(driver, Autorization_Recall.class);
FissionTest ft=PageFactory.initElements(driver, FissionTest.class);


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





////****************New B2B Setup*********************Currently not using
//lgn1.launch_Application11();
//b2bc.B2BSetup_CollectionXSD();
//nsc.NewServiceChannel_ISO_Story();
//acb.ACBEntryclass();
//b2bp.B2BSetup_PaymentXSD();
//acbp.ACBEntryclass_Pmt();
//ab2b.AddNewB2BUser_ISO_Story();


//******************This is part of Entity creation but not using currently******************* 
/////////igsb.InterestGroupNSubAccount_Creation();   







 	

lgn.launch_Application7(); ////****************New User Creation*********************
Thread.sleep(2000);
Thread.sleep(2000);
Is.iso_story();
lgn1.launch_Application2();
Anu.Authorization_NewUser_ISO_Story();
nbc.NewB2BUserCreation_ISO_Story();
//
//
//lgn1.launch_Application14();   ////****************New Entity Creation*********************
//nec.NewEntityCreation_ISOStory();



//lgn1.launch_Application9();  ////****************Transactions and Authorization*********************
//cis.CollectionImport_ISO_Story();
//rcif.Review_CImportfiles();
//lgn1.launch_Application16();
//authcimport.Authorization_CollImport_ISOStory();   
//lgn1.launch_Application9();
//pis.PaymentImport_ISO_Story();
//rpif.Review_PImportfiles();
//lgn1.launch_Application6();
//authpimport.Authorization_PmtImport_ISOStory();  //issue to authorize
//lgn1.launch_Application9();
//mcc.CollPeriodBalances_MCC_ISO_Story();
//npi.NominatedPayments_ISO_Story();
//mcp.CollPeriodBalances_MCP_ISO_Story();
//lgn1.launch_Application6();
//amcp.Authorization_MCP_ISOStory();
//lgn1.launch_Application7();  
//trnchk.Level3Authorizations_TransactionToSaveCSVnPDFnTXTnReportCheck();      
//lgn1.launch_Application9();
//j.Journal_ISO_Story();
//lgn1.launch_Application6();
//aj.Authorization_Journal(); //can't do due to 0 balance
//lgn1.launch_Application9();
//r.Recall_Payments();
//lgn1.launch_Application6();
//ar.Autorization_Recall();


//*****************Fission Test************************
//lgn1.launch_Application7(); 										
//ft.FissionTest();


////****************Financial Release*******************
//lgn1.launch_Application3();
//fs.FinancialRelease();
//lgn1.launch_Application15();
//bbc.BankBatchCreation();






}
}

	
//driver.quit();
//Thread.sleep(5000);






