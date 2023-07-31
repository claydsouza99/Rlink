package testing;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Test3 {
	WebDriver d;
	WebElement wb_selCountry;
	Select sel_country;
	String url ="https://www.facebook.com/";
	@Test(dataProvider ="dp",priority=2 )
	public void fun(String email,String password) throws InterruptedException {
		d.findElement(By.name("email")).sendKeys(email);
		Thread.sleep(2000);
		d.findElement(By.name("pass")).sendKeys(password);
	
//		d.findElement(By.cssSelector("label[for=\"u_tc_sf\"]")).click();
		d.findElement(By.name("login")).click();
		Thread.sleep(2000);
		
	}
	//BEFORE METHOD
			@Test(priority=1)
			
			public void beforeMethod() {
				WebDriverManager.chromedriver().setup();
				d=new ChromeDriver();
				d.get(url);
				d.manage().window().maximize();
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				
			}
			@DataProvider
			public Object[] [] dp(){
				Object [][] obj = new Object [3][2];
				{
					obj[0][0]="akshay@gmail.com";
					obj[0][1]="abc@123";
					
					
					obj[1][0]="akshay12@gmail.com";
					obj[1][1]="abcd@1234";
					
					
					obj[2][0]="akshaygadekar2812@gmail.com";
					obj[2][1]="Baramati@123456";
					
					
				}
				return obj;
			}

		}