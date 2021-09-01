package com.GenericFunctions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.activation.DataSource;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import freemarker.core.Environment;

public class DBConnection extends GenericMethods {
//imp	
	public static String dbConnect()
	{ String data="";
	   try {
		   

		   
		   
		   
		   
    	   //String url="jdbc:sqlserver://sa-igmsqlx.solarsystem.ioh.co.za;databaseName=xcelerate";
		   String url="jdbc:sqlserver://172.21.91.5;databaseName=xcelerate_UAT";  
		   
	
      	   
    	   
    	   
    	   
	        	
	  	 	 // String url="jdbc:sqlserver://172.21.91.5;databaseName=xcelerate_UAT";
//		     String url1=getData("URL","Login",1); 
//		     System.out.println(url1);
//		     String db=getData("DB","Login",1); 
//		     System.out.println(db);
		     //String url="getData("URL","Login",1);getData("DB","Login",1)";
//imp		     
//		 	String url=getData("URL","Login",1).concat(getData("DB","Login",1));
//		 	  System.out.println(url);
		 	  String username="Peter";
		 	  
		 	  String password="P@ssw0rd";
		 	  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				Connection conn = DriverManager.getConnection(url,username, password);
			      System.out.println("connected");
			      Statement statement = conn.createStatement();
			      String environment=getData("Environment","Login",1); 
			      String client=getData("Client","Login",1); 

			      String queryString = "exec [Peter].dbo.[GetNextTask] '"+environment.trim()+"','"+client.trim()+"'";

			     // String queryString = "select * from bank";
			      ResultSet rs = statement.executeQuery(queryString);
			      while (rs.next()) {
			         //System.out.println(rs.getString(1));
			         System.out.println(rs.getString(1));
		             data=rs.getString(1);  
		             
  
	           

		  // String url="jdbc:sqlserver://sa-igmsqlx.solarsystem.ioh.co.za;databaseName=xcelerate";
	   		   
//	 	  String url="jdbc:sqlserver://172.21.91.5;databaseName=xcelerate_UAT";
//	 	  
//	 	  String username="Peter";
//	 	  
//	 	  String password="P@ssw0rd";
	 	  
//		 	  String username="xdev";
//		 	  
//		 	  String password="P@ssw0rd123";
	       
//	 	  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//		Connection conn = DriverManager.getConnection(url,username, password);
//	      System.out.println("connected");
//	      Statement statement = conn.createStatement();
	      
//imp
	      }
	   } catch (Exception e) {
	      e.printStackTrace();
	   }
	   return data;
	   }
	

}

	