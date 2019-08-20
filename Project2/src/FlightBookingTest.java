import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FlightBookingTest {
	
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
	public void flightsBookingTest() throws InterruptedException {
		
		//Slow Scroll
		for (int i=0; i < 8; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		
		//Selecting Flights
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/section/div[2]/div/div/div[2]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		
		//Putting in information
		
		//Location
		driver.findElement(By.xpath("//*[@id=\"s2id_origin\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/div/input")).sendKeys("New York");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/div/input")).sendKeys(Keys.RETURN);
	    Thread.sleep(2000);
	    
		driver.findElement(By.xpath("//*[@id=\"s2id_destination\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/div/input")).sendKeys("Manchester");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/div/input")).sendKeys(Keys.RETURN);
	    Thread.sleep(2000);
	    
	    //One Way
	    driver.findElement(By.xpath("//*[@id=\"thflights\"]/div[9]/div[1]/div/div/ins")).click();
	    Thread.sleep(2000);

	    //Dates
	    driver.findElement(By.xpath("//*[@id=\"departure\"]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[15]/div[1]/table/tbody/tr[5]/td[6]")).click();
	    Thread.sleep(2000);
	    
	    //Clicking Search
	    driver.findElement(By.xpath("//*[@id=\"thflights\"]/div[6]/button")).click();
	    Thread.sleep(2000);
	    
	    //Book Now
	    driver.findElement(By.xpath("//*[@id=\"form_0\"]/div/button")).click();
	    Thread.sleep(2000);
	    
	    //Guest Booking 
	    driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[2]/div[1]/div[2]/div[2]/a")).click();
	    Thread.sleep(2000);
	    
		//Slow Scroll
		for (int i=0; i < 22; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Asif");
		driver.findElement(By.xpath("//*[@id=\"surname\"]")).sendKeys("Mahmud");
		
		driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("01671324427");
		driver.findElement(By.xpath("//*[@id=\"birthday\"]")).sendKeys("1995-05-25");
		driver.findElement(By.xpath("//*[@id=\"cardno\"]")).sendKeys("11111111");
		driver.findElement(By.xpath("//*[@id=\"expiration\"]")).sendKeys("2022-05-05");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("asifmahmud22@gmail.com");

	    
	}
	
	
	@AfterMethod
	public void shutDown() {
		
		//driver.quit();
	}


}
