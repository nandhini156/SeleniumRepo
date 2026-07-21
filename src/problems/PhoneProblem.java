package problems;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PhoneProblem {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Learning@830$3mK2");
		driver.findElement(By.xpath("//span[contains(text(),'User')]/following-sibling::span")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='okayBtn']")));
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
		WebElement ddValue = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dd = new Select(ddValue);
		dd.selectByIndex(2);
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
		String[] MobilesNeeded = { "iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry" };
		int j = 0;
		List<WebElement> AvailableMobiles = driver.findElements(By.xpath("//h4[@class='card-title']"));
		for (int i = 0; i < AvailableMobiles.size(); i++) {
			String Mobile = AvailableMobiles.get(i).getText();
			List<String> MobileList = Arrays.asList(MobilesNeeded);
			if (MobileList.contains(Mobile)) {
				j++;
				driver.findElements(By.cssSelector(".btn.btn-info")).get(i).click();
				if (j == MobilesNeeded.length)
					break;
			}
		}
		driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();
		// wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn.btn-success")));
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		System.out.println("Done Successfully");
		driver.findElement(By.xpath("//input[@id='country']")).sendKeys("India");
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("India")));
		driver.findElement(By.linkText("India")).click();
		driver.findElement(By.cssSelector("label[for='checkbox2']")).click();
		driver.findElement(By.xpath("//input[@value='Purchase']")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
		driver.quit();

	}

}
