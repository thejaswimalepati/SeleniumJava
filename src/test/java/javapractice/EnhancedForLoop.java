package javapractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EnhancedForLoop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		// Classname obj=new ClassName();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		// driver.findElement(By.name("locator")).sendKeys("data");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Thejaswi");
		
		List<WebElement> allMonths= driver.findElements(By.id("month"));
		
		for(WebElement month:allMonths) {
			
			System.out.println(month.getText());
		}
		
		
		driver.close();
		

	}

}
