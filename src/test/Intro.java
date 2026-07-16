package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("Webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
	}

}
