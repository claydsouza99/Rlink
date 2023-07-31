package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Test1 {
	@Test
	public void loginTest() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.name("email")).sendKeys("acb@example.com");
		Thread.sleep(2000);
		
		driver.findElement(By.name("pass")).sendKeys("areedada");
		Thread.sleep(2000);
		
		driver.findElement(By.name("login")).click();
	}
}
