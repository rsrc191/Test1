import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create driver object
		System.setProperty("webdriver.chrome.driver", "E:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://maximo-demo75.mro.com/maximo/webclient/login/login.jsp?welcome=true");
        System.out.println(driver.getTitle());
		driver.getTitle();
		driver.getTitle();
		
		driver.getTitle();
		driver.getTitle();
		WebElement loginid = (driver.findElement(By.id("username")));
		loginid.sendKeys("maximo");
	    WebElement loginpwd = driver.findElement(By.id("password"));
	    loginpwd.sendKeys("maxpass1");
	    WebElement loginbutton = driver.findElement(By.id("loginbutton"));
	    loginbutton.click();	    
		
	}

}
