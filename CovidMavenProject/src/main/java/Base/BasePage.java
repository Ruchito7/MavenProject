package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasePage {
	private  Properties prop;
	private String Url;


	public BasePage() throws IOException{
		prop = new Properties();
		FileInputStream data = new FileInputStream("C:\\Users\\ruchi\\SSelenium\\Workspace2\\CovidMavenProject\\src\\main\\java\\Resources\\config.properties");
	prop.load(data);

	}

	public static WebDriver GetDriver() {
		return WebDriverInstance.GetDriver();
		

	}

	public String GetUrl() {
		Url= prop.getProperty("url");
		return Url;

	}

	public void TakeSnapShot(String Name) throws IOException {
		File srcfile = ((TakesScreenshot)GetDriver()).getScreenshotAs(OutputType.FILE);
		File DestFile = new File(System.getProperty("C:\\Users\\ruchi\\SSelenium\\Workspace2\\CovidMavenProject\\target\\Screenshots", timestamp()+".png"));
		FileUtils.copyFile(srcfile, DestFile);

	}

	public String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}
}
