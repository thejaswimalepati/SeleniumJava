package automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExceptionHandling {
	@Test
	public void exceptionHandling() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		//ClassName objectName=new ClassName();-Instance creation
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		try {
		driver.findElement(By.id("userName")).sendKeys("Thejaswi");
		}catch (NoSuchElementException e) {
			System.out.println("Due to NoSuchElementException username is not entered with the given text");
		}catch (ElementNotInteractableException e) {
			System.err.println("Due to ElementNotInteractableException username is not entered with the given text");
		}catch (WebDriverException e) {
			System.err.println("Due to WebDriverException username is not entered with the given text");
		}
		Thread.sleep(3000);
		driver.findElement(By.id("usrPwd")).sendKeys("Tej123");
		
		driver.close();
		
	}

}
