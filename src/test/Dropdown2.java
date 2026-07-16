package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(2000L);
		int i=1;
		while(i<5) {
		driver.findElement(By.xpath("//*[@id='hrefIncAdt']")).click();
		i++;
		}
		
		driver.findElement(By.xpath("//*[@id='btnclosepaxoption']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
		driver.quit();
	}

}
