
package com.ReportGeneration;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.GenericFunctions.GenericMethods;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class GenerateReports {
	
	
	public static ExtentReports extent;
	
	public static ExtentTest test;
	
	public  static String crntclassname;
	
	public static String resultfile;
	
	
	public static void intializeTest(String Filename)
	{
		extent=new ExtentReports(getpath()+"\\"+Filename+".html");
		
		extent.addSystemInfo("Report Type","Automation Test Report")
		.addSystemInfo("Project Name","Xcelerate");
		
		
		extent.loadConfig(new File("extent.xml"));
		resultfile=getpath()+"\\"+Filename+".html";
		
	}
	
	public static void startTest(String methodname)
	{
		test=extent.startTest(methodname);
		
		
	}
	
	public static void closeTest()
	{
		extent.flush();
		//extent.close();
		sendMail();
		
	}

	////////////////////////////////////////////////////////////////////////////////////////////////
	public static void LogEvent(String status,String Description)
	{
		if(status.equalsIgnoreCase("pass"))
		{test.log(LogStatus.PASS, Description,test.addBase64ScreenShot(takeScreenshot()));
			
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, Description,test.addBase64ScreenShot(takeScreenshot()));
		}
	}
	
	
	
	public static String getpath()
	{
		String path="";
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YY");
		
		System.out.println();
		
		File f=new File(System.getProperty("user.dir")+"\\Results\\"+sdf.format(new Date()).replace("/", ""));
		
		
		if(!f.exists())
		{
			
			f.mkdirs();
			path= System.getProperty("user.dir")+"\\Results\\"+sdf.format(new Date()).replace("/", "");
		}
		
		return System.getProperty("user.dir")+"\\Results\\"+sdf.format(new Date()).replace("/", "");
				
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public static String takeScreenshot()
	{
		TakesScreenshot sht=(TakesScreenshot) GenericMethods.driver;
		
		 String scnShot = sht.getScreenshotAs(OutputType.BASE64);
		    return "data:image/jpg;base64, " + scnShot ;
	}

	public static void  sendMail()
	{
		

		// Create object of Property file
					Properties props = new Properties();
			 
					// this will set host of server- you can change based on your requirement 
					props.put("mail.smtp.host", "smtp.gmail.com");
			 
					// set the port of socket factory 
					props.put("mail.smtp.socketFactory.port", "465");
			 
					// set socket factory
					props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
			 
					// set the authentication to true
					props.put("mail.smtp.auth", "true");
			 
					// set the port of SMTP server
					props.put("mail.smtp.port", "465");
			 
					// This will handle the complete authentication
					Session session = Session.getDefaultInstance(props,
			 
							new javax.mail.Authenticator() {
			 
								protected PasswordAuthentication getPasswordAuthentication() {
			 
								return new PasswordAuthentication("selenium.xcelerate@gmail.com", "R0ck5t@r");
			 
								}
			 
							});
			 
					try {
			 
						// Create object of MimeMessage class
						Message message = new MimeMessage(session);
			 
						// Set the from address
						message.setFrom(new InternetAddress("selenium.xcelerate@gmail.com"));
			 
						// Set the recipient address
						message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("srinir@insuregroup.co.za, lancen@insuregroup.co.za"));
			            
			                        // Add the subject link
						message.setSubject("Testing Subject");
			 
						// Create object to add multimedia type content
						BodyPart messageBodyPart1 = new MimeBodyPart();
			 
						// Set the body of email
						messageBodyPart1.setText("This is message body");
			 
						// Create another object to add another content
						MimeBodyPart messageBodyPart2 = new MimeBodyPart();
			 
						// Mention the file which you want to send
						String filename = resultfile;
			 
						// Create data source and pass the filename
						DataSource source = new FileDataSource(filename);
			 
						// set the handler
						messageBodyPart2.setDataHandler(new DataHandler(source));
			 
						// set the file
						messageBodyPart2.setFileName(filename);
			 
						// Create object of MimeMultipart class
						Multipart multipart = new MimeMultipart();
			 
						// add body part 1
						multipart.addBodyPart(messageBodyPart2);
			 
						// add body part 2
						multipart.addBodyPart(messageBodyPart1);
			 
						// set the content
						message.setContent(multipart);
			 
						// finally send the email
						Transport.send(message);
			 
						System.out.println("=====Email Sent=====");
			 
					} catch (MessagingException e) {
			 
						throw new RuntimeException(e);
			 
					}
			 
				}
			

}
