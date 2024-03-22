package testBase;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.ScreenshotException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class BaseClass {
	public static WebDriver driver;
	public ResourceBundle RB;
	public Logger logger;
	@BeforeClass
	@Parameters({"browser"})
	public void launch(String br) {
		RB=ResourceBundle.getBundle("config");
		logger=LogManager.getLogger(this.getClass());
		if(br.equals("chrome")) {
		driver=new ChromeDriver();
		}
		else {
			driver=new EdgeDriver();
		}
		driver.get(RB.getString("baseURL"));
		logger.info("********Lauching URL********");
		driver.manage().window().maximize();
		logger.info("*********Maximize window********");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		logger.info("*********implicit applied********");
	}
	@AfterClass
	public void close() {
		driver.close();
	}
	public String CaptureScreen(String tname) {
		String timeStamp=new SimpleDateFormat("dd.MM.yyyy.HH.mm.ss").format(new Date());
		TakesScreenshot screenshot=(TakesScreenshot)driver;
	    File source=screenshot.getScreenshotAs(OutputType.FILE);
	    String destination=System.getProperty("user.dir")+"\\screenshots\\"+tname+"_"+timeStamp;
	try {
		FileUtils.copyFile(source, new File(destination));
	}
	catch(Exception e){
		e.getMessage();
		
	}
	
	return "";
	}
}
