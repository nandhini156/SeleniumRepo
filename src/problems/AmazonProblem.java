package problems;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonProblem {
	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4[class='product-name']"));
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("- 1 Kg");
			String formattedName = name[0].trim();
			List<String> itemsNeededList = Arrays.asList(itemsNeeded);
			if (itemsNeededList.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemsNeeded.length)
					break;

			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String[] itemsNeeded = { "Cauliflower", "Mushroom", "Corn", "Carrot" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		addItems(driver, itemsNeeded); // No need to create object if the method declared is static
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		/*
		 * WebElement promo=driver.findElement(By.xpath("//input[@class='promoCode']"));
		 * WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
		 * wait.until(ExpectedConditions.visibilityOf(promo));
		 * promo.sendKeys("rahulshettyscademy");
		 */
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		driver.quit();

	}

}
