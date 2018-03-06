package demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class TestNG {
	
	@Test
	public void launch()

	{
		
//		System.out.println("Hello World");
		dbConnect();
		//sendMail();
		//GetDateinJava();
		
	}

	private void dbConnect() {
		// TODO Auto-generated method stub
		
	}

	private void sendMail() {
		// TODO Auto-generated method stub
		
	}

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
