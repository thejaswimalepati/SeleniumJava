package automationtesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsPractice {
    @Test
	public void alertsExample() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[contains(text(),'Alert with OK')])[1]")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'alert box')]")).click();
		
		Alert simpleAlert= driver.switchTo().alert();
		Thread.sleep(3000);
		
		System.out.println(simpleAlert.getText());
		Thread.sleep(3000);
	
		simpleAlert.accept();
		Thread.sleep(3000);
		
		driver.close();
		
		
		
	}
}
