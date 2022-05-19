package seleniumPracticeCode;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebsiteAutomationAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\jaganag\\eclipse-workspace\\jarfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//to perform wait action for the overall process
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//to get access of the desired webpage
		driver.get("http://automationpractice.com/index.php");
		
		Actions act = new Actions(driver);
		//women option is hovered with help of action class
		WebElement women = driver.findElement(By.xpath("//li//a[@class='sf-with-ul']"));
		act.moveToElement(women).build().perform();
		//T-shirt is clicked with help of action class
		WebElement tshirt = driver.findElement(By.xpath("//li//a[contains(text(),'T-shirts')]"));
	    act.moveToElement(tshirt).click().perform();
	    //page scroll is enabled by js executor class
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0,800)");
	    
	    WebElement dress = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
	    act.moveToElement(dress).build().perform();
	    
	    driver.findElement(By.linkText("More")).click();
	    
	    driver.findElement(By.xpath("//a//span//i[@class='icon-plus']")).click();
	    //drop-down is handled with help of select class
	    Select sc = new Select(driver.findElement(By.id("group_1")));
	    sc.selectByVisibleText("L");
	    
	    driver.findElement(By.id("color_14")).click();
	    
	    js.executeScript("window.scrollTo(0,400)");
	    
	    driver.findElement(By.xpath("//p[@id='add_to_cart']//span[.='Add to cart']")).click();
	    
	    driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
	    
	    driver.close();
	    
	    driver.quit();
	}
}
