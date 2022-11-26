package Utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listners extends BaseClass implements ITestListener  {

	
	public void onteststart(ITestResult result)
	{
		System.out.println("ontest start"+result.getName());
	}
	public void ontestsucess(ITestResult result)
	{
		System.out.println("ontest sucess"+result.getName());
	}
	public void ontestfailure(ITestResult result)
	{
		try {
				Screenshot.clickonscreenshot(result.getName(),driver );
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		
		System.out.println("ontest failure"+result.getName());
	}
	public void ontestskipped(ITestResult result)
	{
		System.out.println("ontest skipped"+result.getName());
	}
}
