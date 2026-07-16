package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Assert.assertFalse(driver.findElement(By.cssSelector("div[id='familyandfriend'] input[type='checkbox']")).isSelected());
		driver.findElement(By.cssSelector("div[id='familyandfriend'] input[type='checkbox']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("div[id='familyandfriend'] input[type='checkbox']")).isSelected());	
		System.out.println(driver.findElement(By.cssSelector("div[id='familyandfriend'] input[type='checkbox']")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("div[id='discount-checkbox'] input[type='checkbox']")).size());
		Assert.assertEquals(driver.findElements(By.cssSelector("div[id='discount-checkbox'] input[type='checkbox']")).size(), 5);
		driver.quit();
	}

}
