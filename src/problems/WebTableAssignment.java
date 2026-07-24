package problems;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableAssignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qaclickacademy.com/practice.php");
		WebElement table=driver.findElement(By.cssSelector(".table-display"));
		System.out.println("No. of rows: "+driver.findElements(By.cssSelector(".table-display tr")).size());
		System.out.println("No. of columns: "+driver.findElements(By.cssSelector(".table-display th")).size());
		List<WebElement> secondrow=table.findElements(By.cssSelector(".table-display tr:nth-child(3) td"));
		System.out.println(secondrow.get(0).getText());
		System.out.println(secondrow.get(1).getText());
		System.out.println(secondrow.get(2).getText());
		driver.quit();

	}

}
