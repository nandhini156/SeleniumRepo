package problems;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qaclickacademy.com/practice.php");
		driver.findElement(By.id("autocomplete")).sendKeys("Ind");
		Thread.sleep(1000);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
		

	}

}
