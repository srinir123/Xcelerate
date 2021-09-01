package com.GenericFunctions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.ScreenFunctions.Authorization_NewUser;

public class NewDBConnection_OTP extends GenericMethods {
	
	public static String dbConnect2(int i)
	{ String data="";
	   try {
	 	  
	 	  	  
		 	// String url="jdbc:sqlserver://sa-igmsqlx.solarsystem.ioh.co.za;databaseName=xcelerate";
		 	 String url="jdbc:sqlserver://172.21.91.5;databaseName=xcelerate_UAT";
		 	  String username="Peter";
		 	  
		 	  String password="P@ssw0rd";
	       
	 	  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	      Connection conn = DriverManager.getConnection(url,username, password);
	      System.out.println("connected");
	      Statement statement = conn.createStatement();
	      
//	      String environment=getData("Environment","Login",1); 
//	      String client=getData("Client","Login",1); 
	      String Username=getData("FirstName","NewUser_creation",i).concat(getData("Surname","NewUser_creation",i).substring(0, 1));
	      String queryString = "exec [Peter].dbo.[Get_OTP] 'Xcelerate','"+Username+"'";
	      //String queryString = "exec [Peter].dbo.[Get_OTP] 'Xcelerate','lancen'";
	      
	     // String queryString = "select * from bank";
	      ResultSet rs = statement.executeQuery(queryString);
	      while (rs.next()) {
	         //System.out.println(rs.getString(1));
	         System.out.println(rs.getString(1));
             data=rs.getString(1);  
	      }
	   } catch (Exception e) {
	      e.printStackTrace();
	   }
	   return data;
	}


}

	