package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("Ind");
		Thread.sleep(3000);
		List <WebElement> options=driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		for(WebElement option:options) {
			if(option.getText().equalsIgnoreCase("India")) {
				option.click();
				System.out.println("India selected");
				break;
				
			}
			
		}
		
		
		
	}

}
