package seleniumPracticeCode;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\jaganag\\eclipse-workspace\\jarfiles\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.get("https://www.google.com");
		 driver.get("http://demowebshop.tricentis.com/");
	     WebElement computer = driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Computers')]"));
	     Actions act = new Actions(driver);
	     act.moveToElement(computer).build().perform();
		 WebElement NoteBook = driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Notebooks')]"));
		 act.moveToElement(NoteBook).click().perform();
		 WebElement sort = driver.findElement(By.id("products-orderby"));
		 Select sel =new Select(sort);
		 List<WebElement>selsort = sel.getOptions();
		 System.out.println("value stores at "+ selsort.get(2).getText());
		 System.out.println("total elements in list are : "+selsort.size());
		 for(int i=0;i<selsort.size();i++)
		 {
			 String element = selsort.get(i).getText();
			 System.out.println("value at index "+ i + "is "+element);
		 }
		 driver.close();
	}

}
