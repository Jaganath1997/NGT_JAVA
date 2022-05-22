package seleniumPracticeCode;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchingTabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\jaganag\\eclipse-workspace\\jarfiles\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.get("https://www.google.com");
		 driver.get("http://demowebshop.tricentis.com/");
	     Actions act = new Actions(driver);
	     act.moveToElement(driver.findElement(By.linkText("Log in"))).contextClick().perform();
	     Robot robot = new Robot();
	     robot.keyPress(KeyEvent.VK_DOWN);
	     //robot.keyPress(KeyEvent.VK_DOWN);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     ArrayList<String> windowdetails=new ArrayList<>(driver.getWindowHandles());
	        System.out.println("total tabs opened are "+windowdetails.size());
	        driver.switchTo().window(windowdetails.get(1));
	     driver.findElement(By.linkText("Log in")).click();
	     driver.findElement(By.id("Email")).sendKeys("jackman2021@mail.com");
	     driver.findElement(By.id("Password")).sendKeys("Jackman2021");
	     driver.findElement(By.xpath("//input[@Value='Log in']")).click();
	     driver.quit();

	}

}
