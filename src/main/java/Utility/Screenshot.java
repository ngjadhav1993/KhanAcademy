package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void clickonscreenshot(String name,WebDriver driver) throws IOException
	{
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination = new File ("D:\\workspace\\KhanAcademy\\Screenshot ");
		
		FileHandler.copy(source, destination);
	}
}	

