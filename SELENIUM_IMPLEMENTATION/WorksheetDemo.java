package seleniumPracticeCode;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorksheetDemo {

		public static void main(String[] args) throws IOException, InterruptedException {
			File file = new File("C:\\Users\\ASUS\\Downloads\\sample.xlsx");
	        FileInputStream fis= new FileInputStream(file);
	        XSSFWorkbook workbook=new XSSFWorkbook(fis);
	        XSSFSheet sheet =workbook.getSheetAt(0);
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\ECLIPSE\\jarfiles\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("http://demowebshop.tricentis.com/");
	        driver.manage().window().maximize();
	        for(int i=1;i<=sheet.getLastRowNum();i++) {
	            String username=sheet.getRow(i).getCell(0).getStringCellValue();
	            String pasword=sheet.getRow(i).getCell(1).getStringCellValue();
	            driver.findElement(By.linkText("Log in")).click();
	            Thread.sleep(2000);
	            driver.findElement(By.id("Email")).sendKeys(username);
	            driver.findElement(By.id("Password")).sendKeys(pasword);
	            Thread.sleep(2000);
	            driver.findElement(By.xpath("//input[@value='Log in']")).click();
	            Thread.sleep(2000);
	            driver.findElement(By.linkText("Log out")).click();   
	        }
	        workbook.close(); 
		    driver.close();
		}
}
