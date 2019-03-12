package demo;

import org.testng.annotations.Test;

import com.GenericFunctions.NewDBConnection_OTP;
import com.ScreenFunctions.Authorization_NewUser;

public class TestNG {
	
	@Test
	public void launch()

	{

		String OTP = NewDBConnection_OTP.dbConnect2(0);
		System.out.println(OTP);

//	private void GetDateinJava() {
//		// TODO Auto-generated method stub
//		 // Create object of SimpleDateFormat class and decide the format
//		 DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		 
//		 //get current date time with Date()
//		 Date date = new Date();
//		 
//		 // Now format the date
//		 String ele1= dateFormat.format(date);
//		 
//		 // Print the Date
//		 System.out.println(ele1);
//	}


}

	private void dbConnect2() {
		// TODO Auto-generated method stub
		
	}
}
