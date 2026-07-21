package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowHandlingDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String Password = null;
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//div[@class='float-right']/a[1]")).click();
		String mainWindow=driver.getWindowHandle();
		for(String handle:driver.getWindowHandles()) {
			if(!handle.equals(mainWindow)) {
				driver.switchTo().window(handle);
				Password=driver.findElement(By.cssSelector("strong a")).getText();
				
			}
		}
		driver.switchTo().window(mainWindow);
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys(Password);

	}

}
