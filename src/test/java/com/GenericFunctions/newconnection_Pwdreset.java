package com.GenericFunctions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class newconnection_Pwdreset extends GenericMethods {
	
	public static String dbConnect1()
	{ String data="";
	   try {
	 	  
	 	  	  
	 	  String url="jdbc:sqlserver://172.20.92.20:1433;databaseName=Xcelerate";
	 	  
	 	  String username="Peter";
	 	  
	 	  String password="P@ssw0rd";
	       
	 	  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	      Connection conn = DriverManager.getConnection(url,username, password);
	      System.out.println("connected");
	      Statement statement = conn.createStatement();
	      
	      //String environment=getData("Environment","Login",1); 
	 
	      String queryString = "exec [Peter].dbo.[Update_Password] [Xcelerate]";
	      
	     // String queryString = "select * from bank";
	      ResultSet rs = statement.executeQuery(queryString);
	      while (rs.next()) {
	         //System.out.println(rs.getString(1));
	         System.out.println(rs.getString(2));
             data=rs.getString(2);  
	      }
	   } catch (Exception e) {
	      e.printStackTrace();
	   }
	   return data;
	}


}

	