package automationtesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsPractice {
	@Test
	public void dragAndDrop() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		//ClassName objectName=new ClassName();-Instance creation
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.manage().window().maximize();
		
		WebElement trains= driver.findElement(By.xpath("(//strong[text()='TRAINS'])[1]"));
		
		WebElement buses= driver.findElement(By.xpath("//a[text()=' BUSES ']"));
		
		WebElement more= driver.findElement(By.xpath("//a[text()=' MORE ']"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		
		act.moveToElement(trains).build().perform();
		Thread.sleep(3000);
		
        act.contextClick(buses).build().perform();
		Thread.sleep(3000);
		
		act.doubleClick(more).build().perform();
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
		
		
	}

}
