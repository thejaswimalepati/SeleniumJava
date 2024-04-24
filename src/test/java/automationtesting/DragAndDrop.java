package automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
	@Test
	public void dragAndDrop() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//ClassName objectName=new ClassName();-Instance creation
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/droppable/");
		
		driver.manage().window().maximize();
		
		WebElement sourceElement=driver.findElement(By.id("draggable"));
		
		WebElement destElement=driver.findElement(By.id("droppable"));
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		
		//act.dragAndDrop(sourceElement, destElement);
		
		act.clickAndHold(sourceElement).moveToElement(destElement).release(destElement).build().perform();
		Thread.sleep(6000);
		driver.close();
		
	
	}

}
