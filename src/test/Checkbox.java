package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println(driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa'])[1]")).isDisplayed());
		driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa'])[1]")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElements(By.cssSelector("div[class='css-1dbjc4n r-7o8qx1'] svg circle[r='8']")).size());
		driver.quit();
	}

}
