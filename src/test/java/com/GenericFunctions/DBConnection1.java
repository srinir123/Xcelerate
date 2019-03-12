package com.GenericFunctions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection1 extends GenericMethods {
	
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
	      
	      String environment=getData("Environment","Login",1); 
	      //String client=getData("Client","Login",1); 
	      String entityName=getData("EntityName","story1",1); 

	      //String queryString = "exec [Peter].dbo.[Get_NextTask] '"+environment.trim()+"','"+client.trim()+"'";
	      String queryString = "exec [Peter].dbo.[GetNextTask] '"+environment.trim()+"','"+entityName.trim()+"'"; 
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

	