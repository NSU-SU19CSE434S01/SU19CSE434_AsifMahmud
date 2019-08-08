import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Java Projects\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://www.phptravels.net/");
	}
	
	
	@Test
	public void loginFailedTest() {
		
		//Going into login
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[2]/ul/li[1]/ul/li[1]/a")).click();
		
		//Slow Scroll
		for (int i=0; i < 10; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		try {
			Thread.sleep(40);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}

		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//Sending invalid login inputs
		driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[1]/div[5]/div/div[1]/input")).sendKeys("asif@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[1]/div[5]/div/div[2]/input")).sendKeys("asifmahmud");
		
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//Clicking login button
		driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/button")).click();
		
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Checking login error alert
		boolean loginErrorAlert = driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[1]/div[2]/div")).isDisplayed();
		String loginErrorAlertMsg = driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[1]/div[2]/div")).getText();
		System.out.println(loginErrorAlert);
		System.out.println(loginErrorAlertMsg);
		
		assertTrue(loginErrorAlert);
		assertEquals(loginErrorAlertMsg,"Invalid Email or Password");
		
		}


	
	
	@AfterMethod
	public void shutDown() {
		
		driver.quit();
	}
	
	
}
