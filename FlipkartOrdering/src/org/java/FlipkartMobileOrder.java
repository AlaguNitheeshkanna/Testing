package org.java;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartMobileOrder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tharu\\eclipse-workspace-1\\FlipKart\\driver\\chromedriver.exe");
		// WebDriver Selection
		WebDriver driver = new ChromeDriver();
		// URL
		driver.get("https://www.flipkart.com/");
		// Windows Maximize
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// Search
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("I phone 14");
		search.submit();
		driver.findElement(By.className("KzDlHZ")).click();
		Thread.sleep(2000);
		// Get Winndows Handle

		String parId = driver.getWindowHandle();
		Set<String> allIds = driver.getWindowHandles();
		for (String s : allIds) {
			if (!parId.equals(s)) {
				driver.switchTo().window(s);
			}
		}

		WebElement buy = driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ _3Yl67G _7Pd1Fp']"));
		buy.click();

		Thread.sleep(2000);

		WebElement email = driver.findElement(By.xpath("//input[@class='r4vIwl Jr-g+f']"));
		email.sendKeys("nitheeshkannan03@gmail.com");

		WebElement btn = driver.findElement(By.xpath("//button[@class='QqFHMw YhpBe+ _7Pd1Fp']"));
		btn.click();

		Thread.sleep(2000);

		WebElement phoneno = driver.findElement(By.xpath("//input[@class='r4vIwl Jr-g+f']"));
		phoneno.sendKeys("8681019655");

		WebElement Continue = driver.findElement(By.xpath("//button[@type='submit']"));
		Continue.click();

	}
}
