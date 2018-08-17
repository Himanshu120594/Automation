import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
	@FindBy(id="username")
	private WebElement username;
	@FindBy(name="pwd")
	private WebElement password;
	@FindBy(id="loginButton")
	private WebElement login;
	public Pom(WebDriver d)
	{
		PageFactory.initElements(d, this);
	
	}
	public WebElement password()
	{
		return password;
	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HIMANSHU\\Desktop\\chromeDriver.exe" );
		WebDriver d = new ChromeDriver();
		d.get("https://online.actitime.com/qspiders29/login.do");
		Pom p = new Pom(d);
		p.username.sendKeys("Him");
		p.password.sendKeys("123");
		p.login.click();
		Thread.sleep(2000);
		p.username.sendKeys("himanshu00755");
		p.password.sendKeys("himanshuacti");
		p.login.click();
		

	}

}
