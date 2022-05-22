package seleniumPracticeCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\jaganag\\eclipse-workspace\\jarfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//to perform wait action for the overall process
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.navigate().to("https://trytestingthis.netlify.app/");
		//locators
		driver.findElement(By.id("fname"));
		driver.findElement(By.name("lname"));
		driver.findElement(By.className("pop-up-alert"));
		driver.findElement(By.cssSelector("#male"));
		driver.findElement(By.linkText(" Your Sample Alert Button!"));
		driver.findElement(By.tagName("input"));
		driver.findElement(By.xpath("//input[@value='option 2']"));
		driver.findElement(By.xpath("//input[@text='option 2']"));
		driver.findElement(By.xpath("//*[contains(@name,'option 2')]"));

	}

}
