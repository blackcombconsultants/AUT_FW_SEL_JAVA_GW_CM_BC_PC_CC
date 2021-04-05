package com.Utils.Selenium;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class Selenium_Reporting_Utils extends GW_GetDriver {

	public static String getScreenShot_addScreenCaptureFromPath(WebDriver driver) {

		TakesScreenshot ts = (TakesScreenshot) driver;

		String strPath = pScreenshots + sdf_ddMMMMyyyyHHmmss.format(new Date()) + ".jpeg";
		File pSource = ts.getScreenshotAs(OutputType.FILE);
		File pDestination = new File(strPath);

		try {
			FileUtils.copyFile(pSource, pDestination);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			oExtentTest.addScreenCaptureFromPath(strPath);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return strPath;
	}

	public static String getScreenShot_Robot_createScreenCapture(WebDriver driver) {

		TakesScreenshot ts = (TakesScreenshot) driver;

		String strPath = pScreenshots + sdf_ddMMMMyyyyHHmmss.format(new Date()) + ".jpeg";
		File pSource = ts.getScreenshotAs(OutputType.FILE);
		File pDestination = new File(strPath);

		try {
			FileUtils.copyFile(pSource, pDestination);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			driver.getTitle();
			BufferedImage image = new Robot()
					.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			ImageIO.write(image, "png",pDestination);
		} catch (Exception e) {
			e.printStackTrace();

		}
		return strPath;
	}
	
	public static void SendEmail() {
		// TODO Auto-generated method stub
	      // Recipient's email ID needs to be mentioned.
	      String to = "abcd@gmail.com";

	      // Sender's email ID needs to be mentioned
	      String from = "web@gmail.com";

	      // Assuming you are sending email from localhost
	      String host = "localhost";

	      // Get system properties
	      Properties properties = System.getProperties();

	      // Setup mail server
	      properties.setProperty("mail.smtp.host", host);

	      // Get the default Session object.
	      Session session = Session.getDefaultInstance(properties);

	      try {
	         // Create a default MimeMessage object.
	         MimeMessage message = new MimeMessage(session);

	         // Set From: header field of the header.
	         message.setFrom(new InternetAddress(from));

	         // Set To: header field of the header.
	         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

	         // Set Subject: header field
	         message.setSubject("This is the Subject Line!");

	         // Now set the actual message
	         message.setText("This is actual message");

	         // Send message
	         Transport.send(message);
	         System.out.println("Sent message successfully....");
	      } catch (MessagingException mex) {
	         mex.printStackTrace();
	      }
	}

}
