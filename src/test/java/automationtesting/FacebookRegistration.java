package automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookRegistration {
	@Test
	public void facebookReg() throws InterruptedException  {

		WebDriverManager.chromedriver().setup();

		// Classname obj=new ClassName();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		// driver.findElement(By.name("locator")).sendKeys("data");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Thejaswi");

		
		//Thread.sleep(3000);
		// day
		WebElement selDropdown = driver.findElement(By.id("day"));

		Select sel = new Select(selDropdown);
		sel.selectByIndex(3);
		//Thread.sleep(3000);
		// month
		WebElement selAllMonth = driver.findElement(By.id("month"));

		Select selMonth = new Select(selAllMonth);

		selMonth.selectByValue("5");
		//Thread.sleep(3000);
		// year
		WebElement selAllYear = driver.findElement(By.id("year"));

		Select selYear = new Select(selAllYear);

		selYear.selectByVisibleText("1996");

		//Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()=\"Female\"]")).click();
		//Thread.sleep(3000);
		
		driver.close();

	}
}
