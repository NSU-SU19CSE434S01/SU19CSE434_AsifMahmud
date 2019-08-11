import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BlogsAndOffersNavigationTest {
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
	public void blogsNavigationTest() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[1]/li[1]/a")).click();
		Thread.sleep(2000);
		
		//Searching blogs
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div/div/div[2]/div[2]/div[2]/form/div/input")).click();
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div/div/div[2]/div[2]/div[2]/form/div/input")).sendKeys("Travel");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div/div/div[2]/div[2]/div[2]/form/div/span/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div/div/div[1]/div/div[2]/div[2]/a")).click();
		Thread.sleep(2000);
		String url1 = driver.getCurrentUrl();
		
		//Testng
		assertEquals(url1, "https://www.phptravels.net/blog/Fiercely-Independent-Cultures");
		
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div/div/div[2]/div[3]/div/a[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div/div/div[1]/div/div[2]/div[2]/a")).click();
		Thread.sleep(2000);
		String url2 = driver.getCurrentUrl();
		
		//Testng
		assertEquals(url2, "https://www.phptravels.net/blog/Peace-Train-A-Long-Time-Coming");

		for (int i=0; i < 20; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div/div/div[2]/div[4]/div[2]/div/div[1]/div/h5/a")).click();
		Thread.sleep(2000);
		String url3 = driver.getCurrentUrl();
		
		//Testng
		assertEquals(url3, "https://www.phptravels.net/blog/Virgin-Gorda-beaches-and-lobste");
	
	}
	
	
	@Test
	public void offersNavigationTest() throws InterruptedException {
		
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[1]/li[2]/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[6]/div/div[3]/div[2]/a[2]")).click();
		Thread.sleep(2000);
		String url1 = driver.getCurrentUrl();
		
		//Testng
		assertEquals(url1, "https://www.phptravels.net/offers/Lunch-Discount");
		
		for (int i=0; i < 50; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		
		Thread.sleep(2000);
		
		//Messaging 
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[6]/div/form/fieldset/div[1]/input")).sendKeys("Asif Mahmud");
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[6]/div/form/fieldset/div[2]/input")).sendKeys("01671324427");
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[6]/div/form/fieldset/div[4]/textarea")).sendKeys("Hello World!");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[6]/div/form/fieldset/div[6]/input[3]")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[6]/div/div[3]/div[1]/a[2]")).click();
		Thread.sleep(2000);
		String url2 = driver.getCurrentUrl();
		
		//Testng
		assertEquals(url2, "https://www.phptravels.net/offers/Dubai-Special-Packages");

	}

	
	
	@AfterMethod
	public void shutDown() {
		
		//driver.quit();
	}

}
