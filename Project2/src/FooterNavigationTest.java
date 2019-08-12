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

public class FooterNavigationTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Java Projects\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.navigate().to("https://www.phptravels.net/");
	}

	
	@Test
	public void contactTest() throws InterruptedException {
		for (int i=0; i < 150; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		
		Thread.sleep(2000);
		
		//Clicking Contact
		driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[1]/div/div[1]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		
		for (int i=0; i < 5; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		
		//Messaging 
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[1]/div[2]/div/div/form/div[1]/div[2]/input[1]")).sendKeys("Asif Mahmud");
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[1]/div[2]/div/div/form/div[1]/div[2]/input[2]")).sendKeys("asifmahmud22@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[1]/div[2]/div/div/form/div[1]/div[2]/input[3]")).sendKeys("Hello World!");
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[1]/div[2]/div/div/form/div[1]/div[3]/textarea")).sendKeys("Hello World!");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[1]/div[2]/div/div/form/div[3]/input")).click();
		Thread.sleep(2000);
		
		boolean alert = driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[1]/div[2]/div/div/form/div[1]/div[1]")).isDisplayed();
		String alertMsg = driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[1]/div[2]/div/div/form/div[1]/div[1]")).getText();
		
		System.out.println(alert);
		System.out.println(alertMsg);
		
		//Testing
		assertTrue(alert);
		assertEquals(alertMsg, "Please Verify Recaptcha");


	}
	
	
	@Test
	public void aboutTest() throws InterruptedException {
		for (int i=0; i < 150; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		
		Thread.sleep(2000);
		
		//Clicking Contact
		driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[1]/div/div[1]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		
		String url = driver.getCurrentUrl();
		
		//Testing
		assertEquals(url, "https://www.phptravels.net/About-Us");

		
	}
	
	@Test
	public void howToBookTest() throws InterruptedException {
		
		for (int i=0; i < 150; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		
		Thread.sleep(2000);
		
		//Clicking Contact
		driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[1]/div/div[1]/ul/li[3]/a")).click();
		Thread.sleep(2000);
		
		String url = driver.getCurrentUrl();
		
		//Testing
		assertEquals(url, "https://www.phptravels.net/How-to-Book");

		
	}
	
	
	
	@AfterMethod
	public void shutDown() {
		
		//driver.quit();
	}

}
