package BootCampTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

	

	import java.util.Iterator;

	import java.util.Set;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	import org.openqa.selenium.interactions.Actions;

	import org.openqa.selenium.support.ui.Select;

public class Expedia {
	static WebDriver driver;
  @Test
  public void ExpediaTest() throws InterruptedException {
	 
	  			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Babna\\eclipse-workspace\\BootCampWinter\\Drivers\\chromedriver.exe");



	  			driver = new ChromeDriver();

	  			driver.manage().window().maximize();

	  			driver.get("https://www.expedia.com/");

	  			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



	  			driver.findElement(By.xpath("//*[@id=\"gc-custom-header-nav-bar-acct-menu\"]/button/div")).click();



	  			driver.findElement(By.xpath("//a[@href='?pwaLob=wizard-flight-pwa']")).click();

	  			driver.findElement(By.xpath("//*[@aria-label='Leaving from']")).sendKeys("jfk");

	  			driver.findElement(By.xpath("//strong[contains(text(),'New York (JFK - John F. Kennedy Intl.)')]")).click();



	  			driver.findElement(By.xpath("//button[@aria-label='Going to']")).sendKeys("dh");

	  			driver.findElement(By.xpath("//strong[contains(text(),'Dhaka (DAC - Shahjalal Intl.)')]")).click();



	  			driver.findElement(By.xpath("//*[@id='d1-btn']")).click();

	  			Thread.sleep(2000);
	  			
	  			driver.findElement(By.xpath("(//*[@data-day='27'])[1]")).click();

	  			driver.findElement(By.xpath("(//*[@data-day='27'])[2]")).click();

	  			driver.findElement(By.xpath("(//*[text()='Done'])[2]")).click();

	  			Thread.sleep(1000);

	  			driver.findElement(By.xpath("//*[text()='Search']")).click();

	  			Thread.sleep(6000);
	  			
	  			driver.findElement(By.xpath("(//*[@class='uitk-card-link'])[1]")).click();			

	  			Thread.sleep(6000);
	  			
	  			driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
	  			
	  			Thread.sleep(6000);
	  			
	  			driver.findElement(By.xpath("(//*[@class='uitk-card-link'])[1]")).click();		
	  			
	  			driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
	  			
	  			Thread.sleep(9000);
	  			
	  			driver.findElement(By.xpath("//a[contains(text(),'No Thanks')]")).click();
	  			
	  			Thread.sleep(9000);
	  			
	  			
	  			
	  			String parentWindow=driver.getWindowHandle();
	  		
	  	        for (String subWindow:driver.getWindowHandles()) {
	  	        		
	  	        	driver.switchTo().window(subWindow);	
	  	        
	  	        }
	  	        
	  	        Thread.sleep(9000);
	  	        
	  	        driver.findElement(By.xpath("//button[contains(text(),'Check out')]")).click();

	  	        
	  	        Thread.sleep(50000);
	  	        
	  	        driver.findElement(By.xpath("//button[@id='delayed_prompt_covid_continue_booking']")).click();
	  			
	  			

	  			driver.findElement(By.xpath("//input[@id='firstname[0]']")).click();
	  			
	  			driver.findElement(By.xpath("//input[@id='firstname[0]']")).sendKeys("Michael");

	  			driver.findElement(By.xpath("//input[@id='lastname[0]']")).click();
	  			
	  			driver.findElement(By.xpath("//input[@id='lastname[0]']")).sendKeys("Jordan");		

	  			driver.findElement(By.xpath("//input[@id='phone-number[0]']")).click();
	  			
	  			driver.findElement(By.xpath("//input[@id='phone-number[0]']")).sendKeys("212-234-1234");
	  					
	  			driver.findElement(By.xpath("//*[text()='Male']")).click();

	  			

	  			driver.findElement(By.id("date_of_birth_month0")).click();

	  			new Select(driver.findElement(By.id("date_of_birth_month0"))).selectByVisibleText("02 - Feb");

	  			
	  			driver.findElement(By.id("date_of_birth_day[0]")).click();

	  			new Select(driver.findElement(By.id("date_of_birth_day[0]"))).selectByVisibleText("10");


	  			driver.findElement(By.id("date_of_birth_year[0]")).click();

	  			new Select(driver.findElement(By.id("date_of_birth_year[0]"))).selectByVisibleText("1989");




	  			driver.findElement(By.xpath("(//input[@name='creditCards[0].cardholder_name'])[2]")).click();

	  			driver.findElement(By.xpath("(//input[@name='creditCards[0].cardholder_name'])[2]")).sendKeys("Michael Jordan");


	  			driver.findElement(By.id("creditCardInput")).click();

	  			driver.findElement(By.id("creditCardInput")).sendKeys("73636884849498");


	  			driver.findElement(By.name("creditCards[0].expiration_month")).click();

	  			new Select(driver.findElement(By.name("creditCards[0].expiration_month"))).selectByVisibleText("02-Feb");

	  			
	  			driver.findElement(By.name("creditCards[0].expiration_year")).click();

	  			new Select(driver.findElement(By.name("creditCards[0].expiration_year"))).selectByVisibleText("2025");
                
	  			Thread.sleep(5000);

	  			driver.findElement(By.id("new_cc_security_code")).click();

	  			driver.findElement(By.id("new_cc_security_code")).sendKeys("369");



	  			driver.findElement(By.name("creditCards[0].street")).click();

	  			driver.findElement(By.name("creditCards[0].street")).sendKeys("168 st");

	  			driver.findElement(By.name("creditCards[0].street2")).click();
	  			
	  			driver.findElement(By.name("creditCards[0].street2")).sendKeys("90 ave");

	  			driver.findElement(By.name("creditCards[0].city")).click();

	  			driver.findElement(By.name("creditCards[0].city")).sendKeys("Jamaica");



	  			driver.findElement(By.name("creditCards[0].state")).click();

	  			new Select(driver.findElement(By.name("creditCards[0].state"))).selectByVisibleText("NY");

	  			driver.findElement(By.name("creditCards[0].zipcode")).click();

	  			driver.findElement(By.name("creditCards[0].zipcode")).sendKeys("11434");



	  			driver.findElement(By.xpath("(//input[@name='email'])[2]")).click();

	  			driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("mjordan@gmail.com");

	  			driver.findElement(By.id("complete-booking")).click();



	  		}

  }

