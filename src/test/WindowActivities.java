package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println("Navigated to automation practice page");
		Thread.sleep(1000);
		driver.navigate().back();
		System.out.println("Navigated back to Google page");
		Thread.sleep(1000);
		driver.navigate().forward();
		System.out.println("Navigated to automation practice page");
		driver.close();
	}

}
