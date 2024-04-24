package automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionPractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/signup");
		
		driver.manage().window().maximize();
		
		WebElement createAccount=driver.findElement(By.xpath("//div[text()='Create a new account']"));
		WebElement firstName=driver.findElement(By.name("firstname"));
		WebElement alreadyHaveAcc=driver.findElement(By.xpath("//a[text()='Already have an account?']"));
		
		Actions act= new Actions(driver);
		Thread.sleep(3000);
		act.doubleClick(createAccount).build().perform();
		
		Thread.sleep(3000);
		act.contextClick(firstName).build().perform();
		Thread.sleep(3000);
		act.moveToElement(alreadyHaveAcc).build().perform();
		Thread.sleep(5000);
		driver.close();
		
		
		

	}

}
