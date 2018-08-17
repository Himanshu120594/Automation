
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class BrowserAutomationDemo2 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HIMANSHU\\Desktop\\chromeDriver.exe");
WebDriver d = new ChromeDriver();
Thread.sleep(1000);
d.get("file:///C:Users/HIMANSHU/Desktop/Site pages/Drop.html");
d.manage().window().maximize();
Select s = new Select(d.findElement(By.id("abc")));
s.selectByVisibleText("B");
Thread.sleep(1000);
s.selectByVisibleText("C");
Thread.sleep(1000);
s.selectByVisibleText("D");
d.close();

	}

}
