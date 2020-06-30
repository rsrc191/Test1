import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class testcase2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create driver object
		//"C:\Users\Ramku\AppData\Local\Mozilla Firefox\firefox.exe"
		//File pathToBinary = new File("C:\\Users\\Ramku\\AppData\\Local\\Mozilla Firefox\\Firefox.exe");
		//FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		System.setProperty("webdriver.firefox.bin",  "E:\\WebDriver\\Mozilla Firefox\\Firefox.exe");
		System.setProperty("webdriver.gecko.driver", "E:\\WebDriver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	//	driver.get("https://maximo-demo75.mro.com/maximo/webclient/login/login.jsp?welcome=true");
		driver.get("http://www.google.com");
        System.out.println(driver.getTitle());
		driver.getTitle();
		driver.getTitle();
		
		driver.getTitle();
		driver.getTitle();
//		WebElement loginid = (driver.findElement(By.id("username")));
//		loginid.sendKeys("maximo");
	//    WebElement loginpwd = driver.findElement(By.id("password"));
//	    loginpwd.sendKeys("maxpass1");
//	    WebElement loginbutton = driver.findElement(By.id("loginbutton"));
//	    loginbutton.click();	    
		
	}
}
