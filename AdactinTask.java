package org.mav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AdactinTask {
	
	static WebDriver driver;

	@Test(invocationCount = 5)
	private void case1() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
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
	

}
