package org.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeLaunch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tharu\\eclipse-workspace-1\\Youtube\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
        WebElement search =driver.findElement(By.xpath("//input[@type='text']"));
        search.sendKeys("minnalvala song");
        WebElement btn = driver.findElement(By.xpath("//button[@class='ytSearchboxComponentSearchButton']"));
        btn.click();
        Thread.sleep(2000);
       WebElement song = driver.findElement(By.xpath("(//a[@id='thumbnail'])[4]"));
       song.click();
	}

}
