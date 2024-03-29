import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
		Thread.sleep(2000);
		
		//Filling up user info
		driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[1]/div[2]/input")).sendKeys("Asif");
		driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[1]/div[3]/input")).sendKeys("Mahmud");
		driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[2]/div[2]/input")).sendKeys("asifmahmud22@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[2]/div[3]/input")).sendKeys("asifmahmud22@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[3]/div[2]/input")).sendKeys("01671324427");
		driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[4]/div[2]/input")).sendKeys("Dhaka");
		
		//Slow Scroll
		for (int i=0; i < 35; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"bookingdetails\"]/div[2]/table/tbody/tr[1]/td[4]/label/span")).click();
		driver.findElement(By.xpath("//*[@id=\"bookingdetails\"]/div[2]/table/tbody/tr[3]/td[4]/label/span")).click();
		Thread.sleep(2000);
		
		//Slow Scroll
		for (int i=0; i < 20; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		
		//Passport details
		driver.findElement(By.xpath("//*[@id=\"bookingdetails\"]/div[7]/div[2]/div/div[1]/div[1]/input")).sendKeys("Asif Mahmud");
		driver.findElement(By.xpath("//*[@id=\"bookingdetails\"]/div[7]/div[2]/div/div[1]/div[2]/input")).sendKeys("11111111");
		driver.findElement(By.xpath("//*[@id=\"bookingdetails\"]/div[7]/div[2]/div/div[1]/div[3]/input")).sendKeys("24");
		driver.findElement(By.xpath("//*[@id=\"bookingdetails\"]/div[7]/div[2]/div/div[2]/div[1]/input")).sendKeys("Abdullah");
		driver.findElement(By.xpath("//*[@id=\"bookingdetails\"]/div[7]/div[2]/div/div[2]/div[2]/input")).sendKeys("22222222");
		driver.findElement(By.xpath("//*[@id=\"bookingdetails\"]/div[7]/div[2]/div/div[2]/div[3]/input")).sendKeys("24");
		driver.findElement(By.xpath("//*[@id=\"bookingdetails\"]/div[7]/div[2]/div/div[3]/div[1]/input")).sendKeys("Jaber");
		driver.findElement(By.xpath("//*[@id=\"bookingdetails\"]/div[7]/div[2]/div/div[3]/div[2]/input")).sendKeys("33333333");
		driver.findElement(By.xpath("//*[@id=\"bookingdetails\"]/div[7]/div[2]/div/div[3]/div[3]/input")).sendKeys("1");
		
		//Slow Scroll
		for (int i=0; i < 20; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		Thread.sleep(2000);
		
		//Confirm booking
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[1]/div/div/div/div[1]/div[2]/div[4]/button")).click();
		
		//Wait for invoice
		WebElement invoice = (new WebDriverWait(driver, 10))
				  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"invoiceTable\"]/tbody/tr[2]/td/div[1]/table/tbody/tr/td/div[3]")));
		
		//Slow Scroll
		for (int i=0; i < 20; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		Thread.sleep(2000);
		
		//Checking Invoice
		String invoiceName = driver.findElement(By.xpath("//*[@id=\"invoiceTable\"]/tbody/tr[4]/td/table/tbody/tr[2]/td/table[2]/tbody/tr/td[1]")).getText();
		System.out.println(invoiceName);
		String invoicePassport = driver.findElement(By.xpath("//*[@id=\"invoiceTable\"]/tbody/tr[4]/td/table/tbody/tr[2]/td/table[2]/tbody/tr/td[2]")).getText();
		System.out.println(invoicePassport);
		
		//Testing
		assertEquals(invoiceName,"Asif Mahmud");
		assertEquals(invoicePassport,"11111111");
		
		//Slow Scroll
		for (int i=0; i < 20; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-20)");
		Thread.sleep(40);}
		Thread.sleep(2000);
		
		//Clicking pay on arrival
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[1]/div[2]/div[2]/center/button[1]")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		
		//Checking
		boolean alert = driver.findElement(By.xpath("//*[@id=\"invoiceTable\"]/tbody/tr[1]/td/div")).isDisplayed();
		System.out.println(alert);
		
		//Testing
		assertTrue(alert);
		
		}
	
	@Test(priority = 2)
	public void successfulTourReviewTest() throws InterruptedException {
		
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
		for (int i=0; i < 140; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		Thread.sleep(2000);
		
		//Clicking Write Review
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[3]/div[4]/div[1]/div[2]/div[2]/button")).click();
		Thread.sleep(2000);
		
		//Writing Review
		driver.findElement(By.xpath("//*[@id=\"reviews-form-36\"]/div[3]/div[1]/div[1]/input")).sendKeys("Asif Mahmud");
		driver.findElement(By.xpath("//*[@id=\"reviews-form-36\"]/div[3]/div[1]/div[2]/input")).sendKeys("asifmahmud22@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"reviews-form-36\"]/div[3]/textarea")).sendKeys("Good Tour!");
		Thread.sleep(2000);
		
		//Slow Scroll
		for (int i=0; i < 15; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		Thread.sleep(2000);
		
		//Clicking Submit
		driver.findElement(By.xpath("//*[@id=\"36\"]")).click();
		Thread.sleep(2000);

		}
	
	
	@Test(priority = 3)
	public void unsuccessfulTourReviewTest() throws InterruptedException {
		
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
		for (int i=0; i < 140; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		Thread.sleep(2000);
		
		//Clicking Write Review
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[3]/div[4]/div[1]/div[2]/div[2]/button")).click();
		Thread.sleep(2000);
		
		
		//Slow Scroll
		for (int i=0; i < 10; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		Thread.sleep(2000);
		
		//Clicking Submit
		driver.findElement(By.xpath("//*[@id=\"36\"]")).click();
		
		//Slow Scroll
		for (int i=0; i < 10; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-20)");
		Thread.sleep(40);}
		
		//Checking alert
		boolean errorAlert = driver.findElement(By.xpath("//*[@id=\"review_result36\"]/div")).isDisplayed();
		String errorAlertMsg = driver.findElement(By.xpath("//*[@id=\"review_result36\"]/div")).getText();
		System.out.println(errorAlert);
		System.out.println(errorAlertMsg);
		
		assertTrue(errorAlert);
		assertEquals(errorAlertMsg, "The Comment field is required.\n" + 
				"The Email field is required.\n" + 
				"The Name field is required.");
		
		Thread.sleep(2000);

	}
	
	
	@Test(priority = 4)
	public void successfulFeaturedCarBookingTest() throws InterruptedException {
	
		//Slow Scroll
		for (int i=0; i < 110; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		Thread.sleep(2000);
		
		//move mouse to element
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[5]/div/div[2]/div/div[1]/div[2]/div/div/a"));
		action.moveToElement(element).perform();
		
		Thread.sleep(2000);
		
		//Clicking Book Now
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[5]/div/div[2]/div/div[1]/div[2]/div/div/a")).click();
		Thread.sleep(2000);
		
		//Slow Scroll
		for (int i=0; i < 55; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		Thread.sleep(2000);
		
		//Putting in informations
		driver.findElement(By.xpath("/html/body/div[5]/div[4]/div/div[2]/form/div[1]/div[1]/div[2]/div/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/div/input")).sendKeys("Muscat");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/div/input")).sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"departcar2\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[10]/div[1]/table/tbody/tr[5]/td[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[11]/div[1]/table/tbody/tr[5]/td[7]")).click();
		Thread.sleep(2000);
		
		//Clicking Book Now
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[4]/div/div[2]/form/button")).click();
		Thread.sleep(2000);
		
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
		
		//Check Invoice
		String invoiceName = driver.findElement(By.xpath("//*[@id=\"invoiceTable\"]/tbody/tr[2]/td/div[2]/table/tbody/tr/td/div[2]")).getText();
		System.out.println(invoiceName);
		
		//Testing
		assertEquals(invoiceName,"ASIF MAHMUD");
		
		for (int i=0; i < 8; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-20)");
		Thread.sleep(40);}
		
		Thread.sleep(2000);
		
		//Pay Now
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[1]/div[2]/div[2]/center/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"gateway\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"gateway\"]/option[5]")).click();
		for (int i=0; i < 10; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"card-holder-firstname\"]")).sendKeys("Asif");
		driver.findElement(By.xpath("//*[@id=\"card-holder-lastname\"]")).sendKeys("Asif");
		driver.findElement(By.xpath("//*[@id=\"card-number\"]")).sendKeys("1111-1111-1111-1111");
		driver.findElement(By.xpath("//*[@id=\"cvv\"]")).sendKeys("111");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"expiry-month\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"expiry-month\"]/option[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"expiry-year\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"expiry-year\"]/option[3]")).click();
		Thread.sleep(2000);
		
		//Pay now
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[1]/div[2]/div[2]/center/button[2]")).click();
		Thread.sleep(4000);
		
		//Checking alert
		boolean alert = driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[1]/div[2]/div[1]")).isDisplayed();
		System.out.println(alert);
		
		//Testing
		assertTrue(alert);
		
		}



	
	
	
	@AfterMethod
	public void shutDown() {
		
		driver.quit();
	}

}
