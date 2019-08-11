import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageNavigationTest {
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
	
	
	@Test(priority = 1)
	public void homePageBlogsTest() throws InterruptedException {
		
		for (int i=0; i < 20; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[1]/a[2]/div/div/div/h4[2]")).click();
		Thread.sleep(2000);
		String url1 = driver.getCurrentUrl();
		
		assertEquals(url1, "https://www.phptravels.net/blog/Fiercely-Independent-Cultures");
		
		for (int i=0; i < 150; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div/div/div[4]/div[2]/div[1]/a/div/strong")).click();
		Thread.sleep(2000);
		String url2 = driver.getCurrentUrl();
		
		assertEquals(url2, "https://www.phptravels.net/blog/Flavio-Al-Velavevodetto-in-Testaccio");
	}
	
	
	@Test(priority = 2)
	public void homePageOfferTest() throws InterruptedException {
		
		for (int i=0; i < 90; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[4]/div/div[2]/a")).click();
		Thread.sleep(2000);
		String url1 = driver.getCurrentUrl();
		
		assertEquals(url1, "https://www.phptravels.net/offers");

		}

	
	@AfterMethod
	public void shutDown() {
		
		driver.quit();
	}

}
