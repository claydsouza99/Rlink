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
public class Test2 {
	WebDriver d;
	WebElement wb_selCountry;
	Select sel_country;
	String url ="http://test.flyincareer.com";
	@Test(dataProvider ="dp",priority=2 )
	public void fun(String name,String email,String password,String country,String mobile,String city) throws InterruptedException {
		d.findElement(By.xpath("//a[@href='/signup']")).click();
		Thread.sleep(2000);
		d.findElement(By.name("u_fname")).sendKeys(name);
		Thread.sleep(2000);
		d.findElement(By.name("u_email")).sendKeys(email);
		Thread.sleep(2000);
		d.findElement(By.name("u_passwd")).sendKeys(password);
		Thread.sleep(2000);
		d.findElement(By.name("u_passwd_conf")).sendKeys(password);
		Thread.sleep(2000);
		wb_selCountry =d.findElement(By.name("country_code"));
		sel_country=new Select(wb_selCountry);
		sel_country.selectByVisibleText(country);
		Thread.sleep(2000);
		d.findElement(By.name("u_phone_no")).sendKeys(mobile);
		Thread.sleep(2000);
		d.findElement(By.name("u_city")).sendKeys(city);
		Thread.sleep(2000);
//		d.findElement(By.cssSelector("label[for=\"u_tc_sf\"]")).click();
		d.findElement(By.className("form_btn")).click();
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
				Object [][] obj = new Object [3][6];
				{
					obj[0][0]="vikki";
					obj[0][1]="vikramnikam@gmail.com";
					obj[0][2]="vikram@12345";
					obj[0][3]="India";
					obj[0][4]="9527313746";
					obj[0][5]="Mumbai";
					
					obj[1][0]="Vasim";
					obj[1][1]="vasim@gmail.com";
					obj[1][2]="vasim@12345";
					obj[1][3]="India";
					obj[1][4]="9527313746";
					obj[1][5]="Mumbai";
					
					
					obj[2][0]="vrushali";
					obj[2][1]="vrushali@gmail.com";
					obj[2][2]="vrush@12345";
					obj[2][3]="India";
					obj[2][4]="9528989910";
					obj[2][5]="Mumbai";
					
				}
				return obj;
			}

		}