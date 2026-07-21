package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement AccountList=driver.findElement(By.cssSelector("div[id='nav-link-accountList']"));
		Actions a=new Actions(driver);
		WebElement SearchBox=driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
		a.moveToElement(SearchBox).click().keyDown(Keys.SHIFT).sendKeys("hello nandhini").build().perform();
		Thread.sleep(3000);
		a.moveToElement(AccountList).contextClick().build().perform();
		
		driver.quit();
		
	}

}
