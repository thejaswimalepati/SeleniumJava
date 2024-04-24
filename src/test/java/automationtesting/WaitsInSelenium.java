package automationtesting;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsInSelenium {
@Test	
public void waitsInSelenium() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.findElement(By.xpath("//button[text()='Add Textbox1']")).click();
		
		//WebDriverWait wait=new WebDriverWait(driver,20);selenium 3
		 WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
		 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder=\"Textbox1\"])[1]")));
		
		
		driver.findElement(By.xpath("(//input[@placeholder=\"Textbox1\"])[1]")).sendKeys("abc");
		
		Thread.sleep(3000);
		
		driver.close();
		
		
}
}
