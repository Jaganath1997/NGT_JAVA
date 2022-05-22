package seleniumPracticeCode;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\jaganag\\eclipse-workspace\\jarfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com");
		 
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("jackman2021@mail.com");
		driver.findElement(By.id("Password")).sendKeys("Jackman2021");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		try 
		{
			driver.findElement(By.linkText("Log out")).isDisplayed();
			System.out.println("Login Successfull");
			driver.findElement(By.linkText("Log out")).click();
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Login Unsuccessfull");
		}

		driver.close();
	}

}
