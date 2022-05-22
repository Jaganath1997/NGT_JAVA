package seleniumPracticeCode;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\jaganag\\eclipse-workspace\\jarfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.navigate().to("http://automationpractice.com/index.php");
		
		//implicit wait
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//explicit wait
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement contact=wait.until(ExpectedConditions.elementToBeClickable(By.id("contact-link")));
		contact.click();
		
		//fluent wait
		Wait<WebDriver> fluentwait = new FluentWait<WebDriver>(driver)
		        .withTimeout(Duration.ofSeconds(10))
		        .pollingEvery(Duration.ofSeconds(1))
		        .ignoring(NoSuchElementException.class);
		fluentwait.until(ExpectedConditions.elementToBeSelected(By.id("contact-link")));
		
		driver.close();
		driver.quit();
	}

}
