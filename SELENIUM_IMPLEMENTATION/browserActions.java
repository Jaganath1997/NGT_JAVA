package seleniumPracticeCode;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class browserActions {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		//maximize
		driver.manage().window().maximize();
		//minimize
		driver.manage().window().minimize();
		//full screen
		driver.manage().window().fullscreen();
		
		driver.navigate().to("https://www.capgemini.com/");
		//screenshot
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("./images.png"));
		//size
		int w=driver.manage().window().getSize().getHeight();
		int h=driver.manage().window().getSize().getWidth();
		System.out.println("height: "+h + " widht: "+ w);
		//set size of the window
		driver.manage().window().setSize(new Dimension (1000,900));
		
		//position
		driver.manage().window().getPosition().getX();
		driver.manage().window().getPosition().getY();
		//by using point
		driver.manage().window().setPosition(new Point(700,600));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		//FRAMES
		//to switch between frames inside webpage
		//driver.switchTo().frame("name of the frame/index");
		//driver.switchTo().defaultContent();
		driver.close();
	}

}
