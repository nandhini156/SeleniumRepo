package test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class Locators1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		String password=getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("nandhini");
		driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals((driver.findElement(By.tagName("p")).getText()), "You are successfully logged in.");
		driver.quit();
		
		
	}
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(@class,'reset')]")).click();		
		String pwdTxt=driver.findElement(By.cssSelector("form p")).getText();
		String[] pwdtxtArray=pwdTxt.split("'");
		String password=pwdtxtArray[1].split("'")[0];
		return password;
		
	}

}
