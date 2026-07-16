package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'BLR')]")).getText());
		driver.findElement(By.xpath("//div[contains(text(),'BLR')]")).click();
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'MAA')]")).getText());
		driver.findElement(By.xpath("//div[contains(text(),'MAA')]")).click();
		driver.quit();
		/*
		 * //ParentXpath childXpath System.out.println(driver.findElement(By.
		 * xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']"
		 * )).getText()); driver.findElement(By.
		 * xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']"
		 * )).click(); Thread.sleep(1000);
		 * //driver.findElement(By.xpath("//a[@value='BLR']")).click(); - BLR xpath
		 * //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); - chennai
		 * xpath System.out.println(driver.findElement(By.
		 * xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"
		 * )).getText()); driver.findElement(By.
		 * xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"
		 * )).click();
		 */
		
	}

}
