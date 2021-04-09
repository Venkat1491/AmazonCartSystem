package amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonCartSystem {

	 @Test
	 public void cartingItems() throws Exception{
		 
		 System.setProperty("webdriver.chrome.driver", "./Browser Drivers/chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		 
		 driver.get("https://www.amazon.in/");
		 
		 Thread.sleep(3000);

		 String pageTitle = driver.getTitle();
		 String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		 System.out.println(pageTitle);
		 Assert.assertEquals(pageTitle, expectedTitle, "Amazon.in not found");
		 System.out.println("User is on Amazon.in Homepage");
		 
		 Select searchddBox = new Select(driver.findElement(By.xpath("//select[@id=\"searchDropdownBox\"]")));
		 searchddBox.selectByVisibleText("Amazon Devices");
		 
		 //WebElement searchBox = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		 
		 //searchBox.sendKeys("iPhone 12");
		 
	     driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		
		 WebElement firstOption = driver.findElement(By.xpath("//span[text()=\"New Apple iPhone 12 (64GB) - Green\"]"));

		 firstOption.click();
		 
		 String newWindowTitle = driver.getTitle();
		 
		 System.out.println(newWindowTitle);
		 
		 System.out.println("new page is added");
		 
		 
		 
		// WebElement LanguageSelector = driver.findElement(By.xpath("//div[@id=\"nav-tools\"]//a[@id=\"icp-nav-flyout\"]"));
		 
		 //LanguageSelector.click();
		 
		 
		 }
		 
		 
	 }
	
	
