package Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {

	public static ExtentReports extent()
	{
		ExtentReports report = new ExtentReports();                              // to collect the information 
		ExtentSparkReporter exp = new ExtentSparkReporter ("Extentreport.html"); // to create the report
		report.attachReporter(exp);
		report.setSystemInfo("test", "Regression");
		
		return report;
		
	}
	
	
	
	
}
