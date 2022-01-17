package Robert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class trail {
	public static void main(String [] args) throws InterruptedException
	{
		
	    System.setProperty("webdriver.chrome.driver","./Spider/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("kgf trailer");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy' and @class='style-scope ytd-searchbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='video-title' and @title='KGF Trailer Hindi | Yash | Srinidhi | 21st Dec 2018']")).click();
				Thread.sleep(2000);
		
	}
}