import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FeaturedToursAndCarsBookingTest {
	
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
	public void successfulFeaturedTourBookingTest() throws InterruptedException {
		
		//Slow Scroll
		for (int i=0; i < 50; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		
		Thread.sleep(2000);
		
		//Clicking Book Now
		driver.findElement(By.xpath("//*[@id=\"tour-36\"]/div/div[3]/div[2]/a")).click();
		Thread.sleep(2000);
		
		//Slow Scroll
		for (int i=0; i < 70; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		Thread.sleep(2000);
		
		//Putting in informations
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[3]/div[2]/div[2]/div/div/form/div/div[2]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[10]/div[1]/table/tbody/tr[5]/td[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"selectedAdults\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"selectedAdults\"]/option[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"selectedInfants\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"selectedInfants\"]/option[2]")).click();
		Thread.sleep(2000);
		
		//Clicking Book Now
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[3]/div[2]/div[2]/div/form/div[4]/button")).click();



	}

	
	
	
	@AfterMethod
	public void shutDown() {
		
		//driver.quit();
	}

}
