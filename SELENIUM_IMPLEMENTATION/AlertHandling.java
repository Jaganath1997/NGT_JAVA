package seleniumPracticeCode;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\jaganag\\eclipse-workspace\\jarfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com");
		driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	    Alert alert=driver.switchTo().alert();
	    alert.accept();

	    driver.close();
	}

}
