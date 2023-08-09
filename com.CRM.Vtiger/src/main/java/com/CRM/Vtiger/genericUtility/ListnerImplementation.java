package com.CRM.Vtiger.genericUtility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListnerImplementation implements ITestListener{
//some changes for reports learn 
	ExtentReports reports;
	ExtentTest test;
	
	public void onTestStart(ITestResult result) {
	
		String methodname=result.getMethod().getMethodName();
		System.out.println(methodname+"test script execution started");
		test=reports.createTest(methodname);//changes here
	}

	public void onTestSuccess(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		System.out.println(methodname+"test script execution pass");
		test.log(Status.PASS, "test script pass");//chnages here
	}

	public void onTestFailure(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		System.out.println(methodname+"test script fail");	
		test.log(Status.FAIL, "test script failed");//changes here
		
		
		
		
		JavaUtility jutil=new JavaUtility();
		WebDriverUtility wutil=new WebDriverUtility();
		String screenshotname=methodname+jutil.systemDate();
		try {
			String path=wutil.screenShot(Baseclass.sdriver, screenshotname);
			test.addScreenCaptureFromPath(path);//changes here
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		System.out.println(methodname+"test script skipped");
		test.log(Status.SKIP, "test script skipped");
	}

	public void onStart(ITestContext context) {
		System.out.println("suite level execution started");
		//for configure system
ExtentSparkReporter reporter=new ExtentSparkReporter("./ExtentReport\\Report-"+new JavaUtility().systemDate()+".html");
		reporter.config().setDocumentTitle("Vtiger Execution Report");
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setReportName("Vtiger Execution Report");
		//for configuration report
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("BaseURL", "http://localhost:8888");
		reports.setSystemInfo("Browser", "chrome");
		reports.setSystemInfo("Reporter name", "Praveen");
		
	}

	public void onFinish(ITestContext context) {
		reports.flush();
		System.out.println("suite");  
		
	}
	

}
