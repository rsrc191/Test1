	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class testcase3 {


	
		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			
			// Create driver object
			//"C:\Users\Ramku\AppData\Local\Mozilla Firefox\firefox.exe"
			//File pathToBinary = new File("C:\\Users\\Ramku\\AppData\\Local\\Mozilla Firefox\\Firefox.exe");
			//FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		//	System.setProperty("webdriver.firefox.bin",  "E:\\WebDriver\\Mozilla Firefox\\Firefox.exe");
		//	System.setProperty("webdriver.ie.driver", "E:\\WebDriver\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
		//	WebDriver driver = new InternetExplorerDriver();
			
			System.setProperty("webdriver.chrome.driver", "E:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		
			
			
		//	driver.get("https://www.msn.com/en-us/foodanddrink/tipsandtricks/the-5-best-and-5-worst-foods-to-get-delivered-according-to-chefs/ss-BB12oIwE?li=BBnb7Kw");
		//	driver.get("http://www.google.com");
			driver.get("https://www.postfun.com/entertainment/a-few-hilarious-photos-of-people-in-the-background/?utm_campaign=hpp-d-us-c-0-int-200324-pu-ob-d7-em&utm_term=eyJpdSI6Ijc4YmMwM2MzYWEzNDNlODAzZDBhYTQyMGRjYTY3N2JjZTI1MzJmMTlhZjZjMzkyMDhlYjRlMmI2MjdjMGRmM2EiLCJ3Ijo2MSwiaCI6NjEsImQiOjEuMCwiY3MiOjAsImYiOjB9.jpg&utm_source=ob&utm_medium=004c040f09f1cff2a62ffd9eac42dd559f-ob&utm_content=00f7765b742a5482fa7536a5f277447372&utm_cpc=0.033&dicbo=v1-0d30440ec446ab4ad09c724f67fe46a1-0000f8a31852f93d778adea837b72b6efe-gezdayjsmuygkljtge4dsljumvsdiljygy2dclldgyywkzldgi3wkzbwmm&chrome=1");
	        System.out.println(driver.getTitle());
	        driver.manage().window().fullscreen();
	        for(int i=0;i<20;i++) {
	        	Thread.sleep(10000);
		//	driver.findElement(By.xpath("//*[@id=\"main\"]/article/section[1]/button[2]")).click();
	        	////*[@id="next-button"]/a
	        	driver.findElement(By.xpath("//*[@id=\"next-button\"]/a")).click();
			////*[@id="main"]/article/section[1]/button[2]
			driver.getTitle();
			i++;
	        }
			driver.getTitle();
			driver.getTitle();
//			WebElement loginid = (driver.findElement(By.id("username")));
//			loginid.sendKeys("maximo");
		//    WebElement loginpwd = driver.findElement(By.id("password"));
//		    loginpwd.sendKeys("maxpass1");
//		    WebElement loginbutton = driver.findElement(By.id("loginbutton"));
//		    loginbutton.click();	    
			
		}
	}


