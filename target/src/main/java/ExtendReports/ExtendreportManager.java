package ExtendReports;

import java.lang.module.ModuleDescriptor.Exports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendreportManager implements ITestListener 
{

	public ExtentSparkReporter SparkReporter ;
	public ExtentTest test;
	public ExtentReports extent;
	
	public void onStart(ITestContext context) {

		SparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+ "/reports/myReports.html");

		SparkReporter.config().setDocumentTitle("Automation Report"); 

		SparkReporter.config().setReportName("Functional Testing"); 
		
		SparkReporter.config().setTheme(Theme.STANDARD);

		extent=new ExtentReports();
		extent.attachReporter(SparkReporter);
		extent.setSystemInfo("Computer Name", "localhost");
		extent.setSystemInfo("Environment", "QA"); 
		extent.setSystemInfo("Tester Name", "pushpendra");
		extent.setSystemInfo("os", "Windows10");
		extent.setSystemInfo("Browser name", "Chrome");
	
	}
	
	public void onTestSuccess(ITestResult result) {
	    
		test = extent.createTest(result.getName());
		test.log(Status.PASS, "Test case Passed is:"+ result.getName());
		
	  }
	public void onTestFailure(ITestResult result) {
	    
		test = extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case Fail is:"+ result.getName());
		test.log(Status.PASS, "Test case Passed is:"+ result.getThrowable());
		
	  }

	public void onTestSkipped(ITestResult result) {

		test = extent.createTest(result.getName());
		test.log(Status.PASS, "Test case skiped is:"+ result.getName());
	  }
	public void onFinish(ITestContext context) {
	    
		extent.flush();
	  }
	}
