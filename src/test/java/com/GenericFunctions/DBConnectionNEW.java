package com.GenericFunctions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import freemarker.core.Environment;

public class DBConnectionNEW extends GenericMethods {
	
	public static String dbConnect()
	{ String data="";
	String URL3=getData("URL1","Login",1); 
	 Actions action = new Actions(driver);
	   try {
		     
		   
	
		   if(URL3.equals("jdbc:sqlserver://172.21.91.5;databaseName=xcelerate_UAT")) {
			   
	           	 //System.out.println("Test result is: Failed!");
			   //String url1="jdbc:sqlserver://172.21.91.5;databaseName=xcelerate_UAT";
	        	
	     	 	  String username1="Peter";
			 	  
			 	  String password1="P@ssw0rd";
			 	 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
	 	 

			 	//action.moveToElement(element).click().perform();
			 	
			 	  //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					Connection conn1 = DriverManager.getConnection(URL3,username1, password1);
				      System.out.println("connected");
				      Statement statement1 = conn1.createStatement();
				      String environment4=getData("Environment","Login",1); 
				      String client1=getData("Client","Login",1); 

				      String queryString1 = "exec [Peter].dbo.[GetNextTask] '"+environment4.trim()+"','"+client1.trim()+"'";

				     // String queryString = "select * from bank";
				      ResultSet rs1 = statement1.executeQuery(queryString1);
				      while (rs1.next()) {
				         //System.out.println(rs.getString(1));
				         System.out.println(rs1.getString(1));
			             data=rs1.getString(1);  
	        	
		  	 	  			  		   
				      }} else
		           {     	 System.out.println("Not Connected!");
		           }
	
		   if(!URL3.equals("jdbc:sqlserver://172.21.91.5;databaseName=xcelerate_UAT")) {
				    	
				    	   String url2="jdbc:sqlserver://sa-igmsqlx.solarsystem.ioh.co.za;databaseName=xcelerate";
					 	  
					 	  String username="Peter";
					 	  
					 	  String password="P@ssw0rd";
					 	  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
							Connection conn = DriverManager.getConnection(url2,username, password);
						      System.out.println("connected");
						      Statement statement = conn.createStatement();
						      String environment5=getData("Environment1","Login",1); 
						      String client=getData("Client","Login",1); 

						      String queryString = "exec [Peter].dbo.[GetNextTask] '"+environment5.trim()+"','"+client.trim()+"'";

						     // String queryString = "select * from bank";
						      ResultSet rs = statement.executeQuery(queryString);
						      while (rs.next()) {
						         //System.out.println(rs.getString(1));
						         System.out.println(rs.getString(1));
					             data=rs.getString(1);  
					             
				            //System.out.println("Test result is: Successful Match");

		           }

			  // String url="jdbc:sqlserver://sa-igmsqlx.solarsystem.ioh.co.za;databaseName=xcelerate";
		   		   
//		 	  String url="jdbc:sqlserver://172.21.91.5;databaseName=xcelerate_UAT";
//		 	  
//		 	  String username="Peter";
//		 	  
//		 	  String password="P@ssw0rd";
		 	  
//			 	  String username="xdev";
//			 	  
//			 	  String password="P@ssw0rd123";
		       
//		 	  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//			Connection conn = DriverManager.getConnection(url,username, password);
//		      System.out.println("connected");
//		      Statement statement = conn.createStatement();
	      

	      }

			             

		   
	   } catch (Exception e) {
	      e.printStackTrace();
	   }
	   return data;
	   }
	

}






	
