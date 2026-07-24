package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollDemo {

	public static void main(String[] args) throws InterruptedException {
		int Sum=0;
		int expectedSum=0;
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		js.executeScript("document.querySelector('.tableFixHead').scrollBy(0,500)");
		List<WebElement> values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		for(int i=0;i<values.size();i++) {
			Sum+=Integer.parseInt(values.get(i).getText());
		}

		System.out.println(Sum);
		expectedSum=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(Sum, expectedSum);
		driver.quit();
	}

}
