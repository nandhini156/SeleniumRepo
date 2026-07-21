package test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement name=driver.findElement(By.xpath("//label/following-sibling::input[@name='name']"));
		name.sendKeys("Nandhini");
		WebElement Email=driver.findElement(By.cssSelector("input[name='email']"));
		Email.sendKeys("nandhinivm06@gmail.com");
		WebElement password=driver.findElement(By.cssSelector("input[id='exampleInputPassword1']"));
		password.sendKeys("Welcome@123");
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		WebElement gender=driver.findElement(By.cssSelector("select[id='exampleFormControlSelect1']"));
		Select dd=new Select(gender);
		dd.selectByContainsVisibleText("Female");
		WebElement EmploymentStatus=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		EmploymentStatus.click();
		WebElement DOB=driver.findElement(By.xpath("//input[@name='bday']"));
		DOB.sendKeys("15062000");
		WebElement btnSubmit=driver.findElement(By.xpath("//input[@value='Submit']"));
		btnSubmit.click();
		WebElement message=driver.findElement(By.cssSelector(".alert-success"));
		System.out.println(message.getText());
		driver.quit();
	}

}
