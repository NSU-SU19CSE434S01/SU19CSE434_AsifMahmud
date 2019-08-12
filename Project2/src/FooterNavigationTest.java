import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
	
	
	@Test
	public void bookingTipsTest() throws InterruptedException {
		
		for (int i=0; i < 150; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		
		Thread.sleep(2000);
		
		//Clicking Contact
		driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[1]/div/div[1]/ul/li[4]/a")).click();
		Thread.sleep(2000);
		
		String url = driver.getCurrentUrl();
		
		//Testing
		assertEquals(url, "https://www.phptravels.net/Booking-Tips");

		
	}
	
	
	@Test
	public void ourPartnersTest() throws InterruptedException {
		
		for (int i=0; i < 150; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		
		Thread.sleep(2000);
		
		//Clicking Contact
		driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[1]/div/div[2]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		
		String url = driver.getCurrentUrl();
		
		//Testing
		assertEquals(url, "https://www.phptravels.net/Our-Partners");

		
	}

	
	
	@Test
	public void privacyPolicyTest() throws InterruptedException {
		
		for (int i=0; i < 150; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		
		Thread.sleep(2000);
		
		//Clicking Contact
		driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[1]/div/div[2]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		
		String url = driver.getCurrentUrl();
		
		//Testing
		assertEquals(url, "https://www.phptravels.net/Privacy-Policy");

		
	}
	
	
	@Test
	public void termsOfUseTest() throws InterruptedException {
		
		for (int i=0; i < 150; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		
		Thread.sleep(2000);
		
		//Clicking Contact
		driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
		Thread.sleep(2000);
		
		String url = driver.getCurrentUrl();
		
		//Testing
		assertEquals(url, "https://www.phptravels.net/Terms-of-Use");

		
	}

	
	@Test
	public void faqTest() throws InterruptedException {
		
		for (int i=0; i < 150; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		
		Thread.sleep(2000);
		
		//Clicking Contact
		driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[1]/div/div[3]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		
		String url = driver.getCurrentUrl();
		
		//Testing
		assertEquals(url, "https://www.phptravels.net/FAQ");

		
	}
	
	
	@Test
	public void supplierLoginTest() throws InterruptedException {
		
		for (int i=0; i < 150; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		
		Thread.sleep(2000);
		
		// Store the current window handle
		String winHandleBefore = driver.getWindowHandle();

		// Perform the click operation that opens new window
		//Clicking Supplier Login
		driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[1]/div/div[3]/ul/li[2]/a")).click();
		Thread.sleep(2000);

		// Switch to new window opened
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		
		// Perform the actions on new window

		driver.findElement(By.xpath("/html/body/div[1]/form[1]/div[1]/input[1]")).sendKeys("asifmahmud22@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/form[1]/div[1]/input[2]")).sendKeys("25051994");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/form[1]/button")).click();

		//Wait for alert
		WebElement alert = (new WebDriverWait(driver, 10))
				 .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/form[1]/div[2]/div")));

		boolean alertVisible = driver.findElement(By.xpath("/html/body/div[1]/form[1]/div[2]/div")).isDisplayed();
		System.out.println(alertVisible);
		
		//Testing
		assertTrue(alertVisible);
		
		Thread.sleep(2000);
		// Close the new window, if that window no more required
		driver.close();
		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
		
	}


	@Test
	public void supplierSignupTest() throws InterruptedException {
		
		for (int i=0; i < 150; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		
		Thread.sleep(2000);
		
		// Store the current window handle
		String winHandleBefore = driver.getWindowHandle();

		// Perform the click operation that opens new window
		//Clicking Supplier Login
		driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[1]/div/div[4]/ul/li[1]/a")).click();
		Thread.sleep(2000);

		// Switch to new window opened
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		
		// Perform the actions on new window
		driver.findElement(By.xpath("//*[@id=\"tours\"]")).click();
		Thread.sleep(2000);
		
		for (int i=0; i < 25; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		
		Thread.sleep(2000);


		driver.findElement(By.xpath("//*[@id=\"apply\"]/div/div/form/div[1]/div/fieldset/div[1]/div/input")).sendKeys("Cox's Bazar Tour");
		driver.findElement(By.xpath("//*[@id=\"apply\"]/div/div/form/div[1]/div/fieldset/div[2]/div/input")).sendKeys("Asif");
		driver.findElement(By.xpath("//*[@id=\"apply\"]/div/div/form/div[1]/div/fieldset/div[3]/div/input")).sendKeys("Mahmud");
		driver.findElement(By.xpath("//*[@id=\"apply\"]/div/div/form/div[1]/div/fieldset/div[4]/div/input")).sendKeys("asifmahmud22@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"apply\"]/div/div/form/div[1]/div/fieldset/div[5]/div/input")).sendKeys("01671324427");
		Thread.sleep(2000);
		
		for (int i=0; i < 22; i++) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,20)");
		Thread.sleep(40);}
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"apply\"]/div/div/form/div[1]/div/fieldset/div[6]/div/select")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"apply\"]/div/div/form/div[1]/div/fieldset/div[6]/div/select/option[10]")).click();
		driver.findElement(By.xpath("//*[@id=\"apply\"]/div/div/form/div[1]/div/fieldset/div[7]/div/input")).sendKeys("Chittagong");
		driver.findElement(By.xpath("//*[@id=\"apply\"]/div/div/form/div[1]/div/fieldset/div[8]/div/input")).sendKeys("Chittagong");
		driver.findElement(By.xpath("//*[@id=\"apply\"]/div/div/form/div[1]/div/fieldset/div[9]/div/input")).sendKeys("Cox's Bazar");
		Thread.sleep(2000);
		
		//Register
		driver.findElement(By.xpath("//*[@id=\"apply\"]/div/div/form/div[2]/button")).click();


		//Wait for alert
		WebElement alertSuccess = (new WebDriverWait(driver, 10))
				 .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"body-section\"]/div[3]/div[1]")));

		boolean alertSuccessVisible = driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[3]/div[1]")).isDisplayed();
		System.out.println(alertSuccessVisible);
		
		//Testing
		assertTrue(alertSuccessVisible);
		
		Thread.sleep(2000);
		// Close the new window, if that window no more required
		driver.close();
		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
		
	}


	
	
	
	@AfterMethod
	public void shutDown() {
		
		driver.quit();
	}

}
