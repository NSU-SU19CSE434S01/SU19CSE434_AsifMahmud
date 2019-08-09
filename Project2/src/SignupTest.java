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

public class SignupTest {

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
	public void invalidNameSignupFailedTest() {
		//Going into signup page
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[2]/ul/li[1]/ul/li[2]/a")).click();
		
		//Slow Scroll
		for (int i=0; i < 5; i++) {
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
		
		//Sending signup inputs
		driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[3]/input")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[4]/input")).sendKeys("Mahmud");
		driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[5]/input")).sendKeys("01671324427");
		driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[6]/input")).sendKeys("asifmahmud22@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[7]/input")).sendKeys("25051994");
		driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[8]/input")).sendKeys("25051994");

		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Slow Scroll
		for (int i=0; i < 5; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		try {
			Thread.sleep(40);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}

		//Clicking login button
		driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[9]/button")).click();

		//Slow Scroll
		for (int i=0; i < 10; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-20)");
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
		
		//Checking for signup error alert
		boolean signupErrorAlert = driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[2]/div/p")).isDisplayed();
		String signupErrorAlertMsg = driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[2]/div/p")).getText();
		System.out.println(signupErrorAlert);
		System.out.println(signupErrorAlertMsg);
		
		assertTrue(signupErrorAlert);
		assertEquals(signupErrorAlertMsg,"The First name field is required.");


	}
	

	
	
	@AfterMethod
	public void shutDown() {
		
		driver.quit();
	}

}
