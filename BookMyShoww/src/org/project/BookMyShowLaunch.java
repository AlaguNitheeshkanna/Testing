package org.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShowLaunch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tharu\\eclipse-workspace-1\\BookMyShoww\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/explore/home/chennai");
        
		WebElement movie = driver.findElement(By.xpath("(//div[@class='sc-7o7nez-0 lkwOqB'])[2]"));
		movie.click();
		Thread.sleep(2000);
		WebElement bookticket = driver.findElement(By.xpath("(//div[@class='sc-1vmod7e-2 ixpVNC'])[1]"));
		bookticket.click();
	}

}
