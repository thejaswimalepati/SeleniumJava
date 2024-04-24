package automationtesting;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandling {
	@Test
public void windowsHandling() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.manage().window().maximize();
 
		driver.findElement(By.xpath("//a[contains(text(),'abbed Windows')] ")).click();
		
		driver.findElement(By.xpath("(//button[contains(text(),'click')])[1]")).click();
		Thread.sleep(3000);
		String parentWindow= driver.getWindowHandle();
		
	    Set<String> allWindows= driver.getWindowHandles();
	    Thread.sleep(3000);
	    
	    for(String window:allWindows) {
	    	
	    	String title=driver.switchTo().window(window).getTitle();
	    	
	    	if(title.equals("Selenium")) {
	    		Thread.sleep(3000);
	    		driver.findElement(By.xpath("(//a[contains(text(),'Read more')])[1]")).click();
	    		Thread.sleep(3000);
	    		driver.close();
	    	}
	    }
	    Thread.sleep(3000);
		driver.switchTo().window(parentWindow);
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Seperate Windows")).click();
		Thread.sleep(3000);
		driver.quit();
		
}
		
}
