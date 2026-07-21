package test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.geeksforgeeks.org/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerDriver = driver.findElement(By.cssSelector(".footer-container"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		WebElement columnDriver = footerDriver.findElement(By.xpath(".//ul[@class='footer-container_links-list'][1]"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());

		for (int i = 1; i < columnDriver.findElements(By.tagName("a")).size(); i++) {
			String clickLinkOnNewTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickLinkOnNewTab);
		}
		String mainWindow=driver.getWindowHandle();
		for(String handles:driver.getWindowHandles()) {
			if(!handles.equals(mainWindow)) {
				driver.switchTo().window(handles);
				System.out.println(driver.getTitle());
			}
		}
		driver.quit();

	}

}
