package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement checkbox=driver.findElement(By.cssSelector("input[id='checkBoxOption1']"));
		checkbox.click();
		System.out.println(checkbox.isSelected());
		checkbox.click();
		System.out.println(checkbox.isSelected());
		List <WebElement> checkboxes=driver.findElements(By.cssSelector("label input[type='checkbox']"));
		System.out.println(checkboxes.size());
		driver.quit();
		
	}

}
