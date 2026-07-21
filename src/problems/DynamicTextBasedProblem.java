package problems;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicTextBasedProblem {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement checkbox = driver.findElement(By.cssSelector("label[for='benz'] input"));
		checkbox.click();
		String checkBoxValue = driver.findElement(By.cssSelector("label[for='benz']")).getText();
		Select sc = new Select(driver.findElement(By.cssSelector("select[id='dropdown-class-example']")));
		sc.selectByVisibleText(checkBoxValue);
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys(checkBoxValue);
		driver.findElement(By.cssSelector("input[id='alertbtn']")).click();
		String alertText = driver.switchTo().alert().getText();
		if (alertText.contains(checkBoxValue)) {
			System.out.println("Present");
		} else {
			System.out.println("Not Present");
		}
		
		driver.quit();

	}

}
