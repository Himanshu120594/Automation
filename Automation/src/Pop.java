
import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pop {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HIMANSHU\\Desktop\\geckoDriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("https://www.naukri.com/");
		d.close();

}
}
