package sampleTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.jboss.netty.handler.codec.http.multipart.FileUpload;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleTest {

	@Test
	public void loginTest() throws IOException {
		
		WebDriver wd=new FirefoxDriver();
		wd.get("https://www.google.co.in");
		
		File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Workspace1\\sampleTest\\screenshot\\google.jpg"));
	
	
	}
}
