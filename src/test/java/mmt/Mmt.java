package mmt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mmt {
	public static String mmt = "https://www.makemytrip.com/"; 
	WebDriver driver;
	
	@BeforeTest
	public void BT()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(mmt);
	}
	@Test
	public void mmt() throws InterruptedException
	{
		//Select Holiday Packages
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@class='chNavIcon appendBottom2 chSprite chHolidays']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@placeholder='From']")).sendKeys("Bangalore");
//		driver.findElement(By.xpath("//*[@for='fromCity']")).sendKeys("Bangalore");
		
		//From City
		Actions mouse = new Actions(driver);
//		WebElement city = driver.findElement(By.xpath("//*[@for='fromCity']"));
//		mouse.click(city).build().perform();
//		Thread.sleep(3000);
//		WebElement clkcity = driver.findElement(By.xpath("//*[@class='autoSuggest_list']/ul/li[3]"));
//		mouse.click(clkcity).build().perform();
		
		//To City
		WebElement tocity = driver.findElement(By.xpath("//*[@for='toCity']"));
		mouse.click(tocity).build().perform();
		driver.findElement(By.xpath("//*[@placeholder='To']")).sendKeys("Singapore");
		Thread.sleep(3000);
		WebElement toclkcity = driver.findElement(By.xpath("//*[@class='linear-dest-city']"));
		mouse.click(toclkcity).build().perform();
		Thread.sleep(2000);
		
		//Click on Search
		driver.findElement(By.xpath("//*[@data-cy='submit']")).click();
		
		//Click on Date
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='departure_date']")).click();
		
		//choose date 10
		Thread.sleep(2000);
		driver.findElements(By.xpath("//*[@class='DayPicker-Body']/div[2]/div[5]")).get(0).click();
		
		//Click on Search
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='primaryBtn big fill btn btn-top-nav btn-lg']")).click();
		
		//Scroll
		
		//Select Package
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@class='silderCardImage  active ']")).click();
		
		//scroll
		
		//Click on change hotel
		Thread.sleep(18000);
//		driver.findElement(By.xpath("//*[@class='hotel-row-btns']")).click();
//		driver.findElement(By.id("changeRemoveBtn")).click();
		driver.findElements(By.linkText("CHANGE")).get(10).click();
		
		//Select Hotel
		Thread.sleep(5000);
		driver.findElements(By.xpath("//*[@class='primaryBtn fill selectBtn']")).get(1).click();
		
		//Update Package
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='updatePackageBtnText font10']")).click();
		
		//Add Activity
		Thread.sleep(8000);
		driver.findElements(By.xpath("//*[@class='add-activity-button']")).get(0).click();
		
		//Select Activity
		Thread.sleep(8000);
		driver.findElements(By.xpath("//*[@class='primaryBtn fill selectBtn']")).get(8).click();
		
		//Update Package
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@class='updatePackageBtnText font10 btn btn-primary btn-sm']")).click();
		
	}

}








