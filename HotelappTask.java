package org.mav;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelappTask {
	
	static WebDriver driver;
	
	@Test
	public void step3() throws InterruptedException {
		
		driver.findElement(By.id("username")).sendKeys("Mcboi123");
		driver.findElement(By.id("password")).sendKeys("mcboi123");
		driver.findElement(By.id("login")).click();
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByIndex(5);
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotel);
		s1.selectByIndex(1);
		WebElement room = driver.findElement(By.id("room_type"));
		Select s2 = new Select(room);
		s2.selectByIndex(3);
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("first_name")).sendKeys("Zayn");
		driver.findElement(By.id("last_name")).sendKeys("Malik");
		driver.findElement(By.id("address")).sendKeys("sydney");
		driver.findElement(By.id("cc_num")).sendKeys("1234567892153658");
		WebElement card = driver.findElement(By.id("cc_type"));
        Select s3 = new Select(card);
        s3.selectByIndex(3);
        WebElement month = driver.findElement(By.id("cc_exp_month"));
        Select s4 = new Select(month);
        s4.selectByIndex(7);
        WebElement year = driver.findElement(By.id("cc_exp_year"));
		Select s5 = new Select(year);
		s5.selectByIndex(14);
		driver.findElement(By.id("cc_cvv")).sendKeys("5846");
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(5000);
		WebElement order = driver.findElement(By.id("order_no"));
		System.out.println(order.getAttribute("value"));	
	}
	
    @BeforeClass
	public static void step1() {
	
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
	}
	
	 @AfterClass
		public static void step2() throws InterruptedException {
			Thread.sleep(1000);
	}
	 
	@Before
	public void step4() throws InterruptedException {
		Thread.sleep(1000);	
	}
	
	@After
	public void step5() throws InterruptedException {
		Thread.sleep(1000);
	}
	
}
