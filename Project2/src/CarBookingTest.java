import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CarBookingTest {
	
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
	public void successfulCarsBookingTest() throws InterruptedException {
		//Slow Scroll
		for (int i=0; i < 8; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		
		//Selecting Cars
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/section/div[2]/div/div/div[2]/ul/li[4]/a")).click();
		Thread.sleep(2000);
		
		//Putting in information
		
		//Location
		driver.findElement(By.xpath("//*[@id=\"s2id_carlocations\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/div/input")).sendKeys("Manchester");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/div/input")).sendKeys(Keys.RETURN);
	    Thread.sleep(2000);
	    
	    //Dates
	    driver.findElement(By.xpath("//*[@id=\"departcar\"]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[11]/div[1]/table/tbody/tr[5]/td[6]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[12]/div[1]/table/tbody/tr[5]/td[7]")).click();
	    Thread.sleep(2000);
	    
	    //Time
	    driver.findElement(By.xpath("//*[@id=\"cars\"]/form/div[4]/div/select")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"cars\"]/form/div[4]/div/select/option[4]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"cars\"]/form/div[6]/div/select")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"cars\"]/form/div[6]/div/select/option[5]")).click();
	    Thread.sleep(2000);
	    
	    //Submit
	    driver.findElement(By.xpath("//*[@id=\"cars\"]/form/div[7]/button")).click();
	    
	    //Car details
	    driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[6]/div/div[3]/div/table/tbody/tr/td/div[3]/a/button")).click();
		//Slow Scroll
		for (int i=0; i < 60; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		//Book now 
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[4]/div/div[2]/form/button")).click();
		
		//Filling up user info
		driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[1]/div[2]/input")).sendKeys("Asif");
		driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[1]/div[3]/input")).sendKeys("Mahmud");
		driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[2]/div[2]/input")).sendKeys("asifmahmud22@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[2]/div[3]/input")).sendKeys("asifmahmud22@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[3]/div[2]/input")).sendKeys("01671324427");
		driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[4]/div[2]/input")).sendKeys("Dhaka");
		
		for (int i=0; i < 30; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"bookingdetails\"]/div[2]/table/tbody/tr[1]/td[4]/label/span")).click();
		driver.findElement(By.xpath("//*[@id=\"bookingdetails\"]/div[2]/table/tbody/tr[3]/td[4]/label/span")).click();
		Thread.sleep(2000);
		
		for (int i=0; i < 25; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		
		//Confirm Book
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div/div/div[1]/div/div[1]/div[2]/div[4]/button")).click();
		
		//Wait for invoice
		WebElement invoice = (new WebDriverWait(driver, 10))
				  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"invoiceTable\"]/tbody/tr[2]/td/div[1]/table/tbody/tr/td/div[3]")));
		
		for (int i=0; i < 8; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		
		Thread.sleep(2000);
		
		//Check Invoce
		String invoiceName = driver.findElement(By.xpath("//*[@id=\"invoiceTable\"]/tbody/tr[2]/td/div[2]/table/tbody/tr/td/div[2]")).getText();
		System.out.println(invoiceName);

		assertEquals(invoiceName,"ASIF MAHMUD");

	}
	
	
	@Test(priority =2)
	public void unsuccessfulCarsBookingTest() throws InterruptedException {
		//Slow Scroll
		for (int i=0; i < 8; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		
		//Selecting Cars
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/section/div[2]/div/div/div[2]/ul/li[4]/a")).click();
		Thread.sleep(2000);
		
		//Putting in information
		
		//Location
		driver.findElement(By.xpath("//*[@id=\"s2id_carlocations\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/div/input")).sendKeys("Manchester");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/div/input")).sendKeys(Keys.RETURN);
	    Thread.sleep(2000);
	    
	    //Dates
	    driver.findElement(By.xpath("//*[@id=\"departcar\"]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[11]/div[1]/table/tbody/tr[5]/td[6]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[12]/div[1]/table/tbody/tr[5]/td[7]")).click();
	    Thread.sleep(2000);
	    
	    //Time
	    driver.findElement(By.xpath("//*[@id=\"cars\"]/form/div[4]/div/select")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"cars\"]/form/div[4]/div/select/option[4]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"cars\"]/form/div[6]/div/select")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"cars\"]/form/div[6]/div/select/option[5]")).click();
	    Thread.sleep(2000);
	    
	    //Submit
	    driver.findElement(By.xpath("//*[@id=\"cars\"]/form/div[7]/button")).click();
	    
	    //Car details
	    driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[6]/div/div[3]/div/table/tbody/tr/td/div[3]/a/button")).click();
		//Slow Scroll
		for (int i=0; i < 60; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		//Book now 
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[4]/div/div[2]/form/button")).click();
		
		//Filling up user info
		driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[1]/div[2]/input")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[1]/div[3]/input")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[2]/div[2]/input")).sendKeys("asifmahmudgmail.com");
		driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[2]/div[3]/input")).sendKeys("asifmahmud22@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[3]/div[2]/input")).sendKeys("01671324427");
		driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[4]/div[2]/input")).sendKeys("Dhaka");
		
		for (int i=0; i < 30; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"bookingdetails\"]/div[2]/table/tbody/tr[1]/td[4]/label/span")).click();
		driver.findElement(By.xpath("//*[@id=\"bookingdetails\"]/div[2]/table/tbody/tr[3]/td[4]/label/span")).click();
		Thread.sleep(2000);
		
		for (int i=0; i < 25; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		
		//Confirm Book
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div/div/div[1]/div/div[1]/div[2]/div[4]/button")).click();
		
		//Checking alert
		boolean alertMsgVisible = driver.findElement(By.xpath("//*[@id=\"body-section\"]/div/div/div[1]/div/div[1]/div[2]/div[1]/div")).isDisplayed();
		System.out.println(alertMsgVisible);
		String alertMsg = driver.findElement(By.xpath("//*[@id=\"body-section\"]/div/div/div[1]/div/div[1]/div[2]/div[1]/div")).getText();
		System.out.println(alertMsg);
		
		assertTrue(alertMsgVisible);
		assertEquals(alertMsg,
						"The Email field must contain a valid email address\n" + 
						"Email not matching with confirm email\n" + 
						"First Name is required\n" + 
						"Last Name is required");

	}

	
	
	@AfterMethod
	public void shutDown() {
		
		driver.quit();
	}


}
