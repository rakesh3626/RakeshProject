package utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testBase.BaseClass;

public class ExtentReportManager implements ITestListener{
	public ExtentSparkReporter sparkreporter;
	public ExtentReports extent;
	public ExtentTest test;
	String repName;
	
	public void onStart(ITestContext context) {
		String timeStamp=new SimpleDateFormat("dd.MM.yyyy.HH.mm.ss").format(new Date());
		repName="Test-Report"+timeStamp+".html";
		sparkreporter = new ExtentSparkReporter(".\\reports\\"+repName);
		sparkreporter.config().setDocumentTitle("Automation Testing");
		sparkreporter.config().setReportName("regression test");
		sparkreporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(sparkreporter);
		extent.setSystemInfo("computer name", "Local host");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("TesterName", "Rakesh");
		extent.setSystemInfo("OS", "Windows10");
		extent.setSystemInfo("Browser", "chrome");
		extent.setSystemInfo("Location", "Hyderabad");	
	}
	public void onTestSuccess(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.PASS, "Test is Passed"+result.getName());
		System.out.println("Test is passed");
		
		try {
			String imgpath=new BaseClass().CaptureScreen(result.getName());
			test.addScreenCaptureFromPath(imgpath);
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
		
	public void onTestFailure(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.FAIL, "Test is failed"+result.getName());
		test.log(Status.FAIL, "Test is failed"+result.getThrowable());
		System.out.println("test is failed");
		try {
			String imgpath=new BaseClass().CaptureScreen(result.getName());
			test.addScreenCaptureFromPath(imgpath);
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
	public void onTestSkipped(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.SKIP, "Test is Skipped"+result.getName());
		test.log(Status.SKIP, "Test is Skipped"+result.getThrowable());
		System.out.println("test is skipped");
		try {
			String imgpath=new BaseClass().CaptureScreen(result.getName());
			test.addScreenCaptureFromPath(imgpath);
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
	public void onFinish(ITestContext context) {
		extent.flush();
	}
}
