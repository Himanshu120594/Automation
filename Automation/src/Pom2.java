import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2 {
	@FindBy(id="login_field")
	private WebElement username;
	@FindBy(name="password")
	private WebElement password;
	@FindBy(name="commit")
	private WebElement signin;
	public Pom2(WebDriver d)
	{
		PageFactory.initElements(d, this);	
	}
	public WebElement password()
	{
		return password;
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HIMANSHU\\Desktop\\chromeDriver.exe");
		WebDriver d = new ChromeDriver();
		Pom2 p = new Pom2(d);
		d.get("https://github.com/login");
		p.username.sendKeys("himanshusharmacurrent@gmail.com");
		p.password.sendKeys("123");
		p.signin.click();
		Thread.sleep(2000);
		p.password.sendKeys("himanshugithub2460248");
		p.signin.click();
		
	
		

	}

}
